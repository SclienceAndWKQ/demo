package com.example.demo.controller.deliver;

import com.alibaba.fastjson.JSON;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.model.BdcEngineerMsg;
import com.example.demo.service.BdcEngineerService;
import com.example.demo.vo.BdcDeliverRequestVo;
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
 * @description ： 项目工程师信息记录
 * @date ： 2022/4/12 17:32
 */
@Api(value = "项目工程师信息", tags = "项目工程师信息记录")
@RestController
@RequestMapping("/bdc/deliver/engineer")
public class BdcEngineerController {
  private static final Logger logger = LoggerFactory.getLogger(BdcEngineerController.class);
  @Resource
  private BdcEngineerService bdcEngineerService;

  /**
   * 根据设备sn获取工程师信息
   *
   * @param engineerVo 条件信息
   * @return 工程师信息
   */
  @ApiOperation(value = "根据设备sn获取工程师信息")
  @RequestMapping(value = "/getEngineerByMachineSn", method = RequestMethod.POST)
  public Result getEngineerByMachineSn(@RequestBody BdcDeliverRequestVo<BdcEngineerMsg> engineerVo) {
    logger.info("前端传入参数:{}", JSON.toJSONString(engineerVo));
    if (StringUtils.isEmpty(engineerVo.getMachineSn())) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(BdcEngineerMsg.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("machineSn", engineerVo.getMachineSn());
    List<BdcEngineerMsg> engineerList = bdcEngineerService.findByCondition(condition);
    logger.info("获取工程师信息接口响应数据:{}", JSON.toJSONString(engineerList));
    return ResultGenerator.genSuccessResult(engineerList);
  }

  /**
   * 新增设备工程师信息
   *
   * @param bdcEngineerVo 工程师信息
   * @return 是否入库成功
   */
  @ApiOperation(value = "新增设备工程师信息")
  @RequestMapping(value = "/insertEngineer", method = RequestMethod.POST)
  private Result insertEngineer(@RequestBody BdcDeliverRequestVo<BdcEngineerMsg> bdcEngineerVo) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcEngineerVo));
    List<BdcEngineerMsg> engineerMsgs = bdcEngineerVo.getVo();
    Date date = new Date();
    engineerMsgs.forEach(engineer -> {
      engineer.setRecordTime(date);
      engineer.setUpdateTime(date);
    });
    bdcEngineerService.save(engineerMsgs);
    return ResultGenerator.genSuccessResult();
  }

  /**
   * 更新设备工程师信息
   *
   * @param engineerMsg 工程师信息
   * @return 是否更新成功
   */
  @ApiOperation(value = "更新设备工程师信息")
  @RequestMapping(value = "/updateEngineer", method = RequestMethod.POST)
  private Result updateEngineer(@RequestBody BdcEngineerMsg engineerMsg) {
    logger.info("前端传入参数:{}", JSON.toJSONString(engineerMsg));
    engineerMsg.setUpdateTime(new Date());
    bdcEngineerService.update(engineerMsg);
    return ResultGenerator.genSuccessResult();
  }
}
