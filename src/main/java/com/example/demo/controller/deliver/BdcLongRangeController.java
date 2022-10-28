package com.example.demo.controller.deliver;

import com.alibaba.fastjson.JSON;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.model.BdcLongRange;
import com.example.demo.service.BdcLongRangeService;
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
 * @description ： 设备远程信息记录
 * @date ： 2022/4/12 17:33
 */
@Api(value = "设备远程信息", tags = "设备远程信息记录")
@RestController
@RequestMapping("/bdc/deliver/longrange")
public class BdcLongRangeController {
  private static final Logger logger = LoggerFactory.getLogger(BdcLongRangeController.class);
  @Resource
  private BdcLongRangeService bdcLongRangeService;

  /**
   * 根据设备Sn获取设备远程信息
   *
   * @param longRangeVo 条件信息
   * @return 设备远程信息
   */
  @ApiOperation(value = "根据设备Sn获取设备远程信息")
  @RequestMapping(value = "/getLongRangeByMachineSn", method = RequestMethod.POST)
  public Result getLongRangeByMachineSn(@RequestBody BdcDeliverRequestVo<BdcLongRange> longRangeVo) {
    logger.info("前端传入参数:{}", JSON.toJSONString(longRangeVo));
    if (StringUtils.isEmpty(longRangeVo.getMachineSn())) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(BdcLongRange.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("machineSn", longRangeVo.getMachineSn());
    List<BdcLongRange> longRangeList = bdcLongRangeService.findByCondition(condition);
    logger.info("获取设备远程信息接口响应数据:{}", JSON.toJSONString(longRangeList));
    return ResultGenerator.genSuccessResult(longRangeList);
  }

  /**
   * 新增设备远程信息
   *
   * @param bdcLongRange 设备远程信息
   * @return 是否入库成功
   */
  @ApiOperation(value = "新增设备远程信息")
  @RequestMapping(value = "/insertLongRange", method = RequestMethod.POST)
  private Result insertLongRange(@RequestBody BdcLongRange bdcLongRange) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcLongRange));
    Condition condition = new Condition(BdcLongRange.class);
    Example.Criteria criteria = condition.createCriteria();
    Date date = new Date();
    bdcLongRange.setRecordTime(date);
    bdcLongRange.setUpdateTime(date);
    criteria.orEqualTo("identificationCode", bdcLongRange.getIdentificationCode());
    List<BdcLongRange> longRangeList = bdcLongRangeService.findByCondition(condition);
    if (longRangeList.size() == 0) {
      bdcLongRangeService.save(bdcLongRange);
      return ResultGenerator.genSuccessResult();
    }
    return ResultGenerator.genFailResult("识别码已存在,请核查之后重新添加！");

  }

  /**
   * 更新设备远程信息
   *
   * @param bdcLongRange 设备远程信息
   * @return 是否更新成功
   */
  @ApiOperation(value = "更新设备远程信息")
  @RequestMapping(value = "/updateLongRange", method = RequestMethod.POST)
  private Result updateLongRange(@RequestBody BdcLongRange bdcLongRange) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcLongRange));
    bdcLongRange.setUpdateTime(new Date());
    bdcLongRangeService.update(bdcLongRange);
    return ResultGenerator.genSuccessResult();
  }
}
