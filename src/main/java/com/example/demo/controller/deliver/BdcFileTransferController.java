package com.example.demo.controller.deliver;

import com.alibaba.fastjson.JSON;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.model.BdcFileTransfer;
import com.example.demo.model.BdcServiceMsg;
import com.example.demo.service.BdcFileTransferService;
import com.example.demo.service.BdcServiceService;
import com.example.demo.vo.BdcFileTransferVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author ： 185
 * @description ：向服务器传输文件方式的信息记录
 * @date ： 2022/4/12 11:26
 */
@Api(value = "向服务器传输文件方式的信息记录", tags = "向服务器传输文件方式的信息记录")
@RestController
@RequestMapping("/bdc/deliver/filetransfer")
public class BdcFileTransferController {
  private static final Logger logger = LoggerFactory.getLogger(BdcFileTransferController.class);

  @Resource
  private BdcFileTransferService bdcFileTransferService;

  /**
   * 根据服务器id获取向服务器传输文件的方式信息
   *
   * @param fileTransferVo 条件信息
   * @return 向服务器传输文件的方式信息
   */
  @ApiOperation(value = "根据服务器id获取向服务器传输文件的方式信息")
  @RequestMapping(value = "/getFileTransferByServerId", method = RequestMethod.POST)
  public Result getFileTransferByServerId(@RequestBody BdcFileTransferVo fileTransferVo) {
    logger.info("前端传入参数:{}", JSON.toJSONString(fileTransferVo));
    if (StringUtils.isEmpty(fileTransferVo.getServerId())) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(BdcFileTransfer.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("serverId", fileTransferVo.getServerId());
    List<BdcFileTransfer> serviceList = bdcFileTransferService.findByCondition(condition);
    logger.info("获取服务信息接口响应数据:{}", JSON.toJSONString(serviceList));
    return ResultGenerator.genSuccessResult(serviceList);
  }

  /**
   * 新增向服务器传输文件的方式信息
   *
   * @param fileTransfer 向服务器传输文件的方式信息
   * @return 是否入库成功
   */
  @ApiOperation(value = "新增向服务器传输文件的方式信息")
  @RequestMapping(value = "/insertFileTransfer", method = RequestMethod.POST)
  private Result insertFileTransfer(@RequestBody BdcFileTransfer fileTransfer) {
    logger.info("前端传入参数:{}", JSON.toJSONString(fileTransfer));
    Date date = new Date();
    fileTransfer.setRecordTime(date);
    fileTransfer.setUpdateTime(date);
    bdcFileTransferService.save(fileTransfer);
    return ResultGenerator.genSuccessResult();
  }

  /**
   * 根据id更新向服务器传输文件的方式
   *
   * @param fileTransfer 向服务器传输文件的方式信息
   * @return 是否更新成功
   */
  @ApiOperation(value = "根据id更新向服务器传输文件的方式")
  @RequestMapping(value = "/updateFileTransfer", method = RequestMethod.POST)
  private Result updateFileTransfer(@RequestBody BdcFileTransfer fileTransfer) {
    logger.info("前端传入参数:{}", JSON.toJSONString(fileTransfer));
    fileTransfer.setUpdateTime(new Date());
    bdcFileTransferService.update(fileTransfer);
    return ResultGenerator.genSuccessResult();
  }
}
