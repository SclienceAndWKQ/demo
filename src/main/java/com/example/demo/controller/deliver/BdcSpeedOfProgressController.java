package com.example.demo.controller.deliver;

import com.alibaba.fastjson.JSON;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.model.BdcArea;
import com.example.demo.model.BdcSpeedOfProgress;
import com.example.demo.service.BdcSpeedOfProgressService;
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
 * @description ：设备部署进度信息处理
 * @date ： 2022/4/12 11:26
 */
@Api(value = "设备部署进度信息", tags = "设备部署进度信息处理")
@RestController
@RequestMapping("/bdc/deliver/progress")
public class BdcSpeedOfProgressController {
  private static final Logger logger = LoggerFactory.getLogger(BdcSpeedOfProgressController.class);

  @Resource
  private BdcSpeedOfProgressService bdcSpeedOfProgressService;

  /**
   * 根据设备sn获取部署进度信息
   *
   * @param bdcSpeedOfProgressVo 条件信息
   * @return 设备部署进度信息
   */
  @ApiOperation(value = "根据设备sn获取部署进度信息")
  @RequestMapping(value = "/getSpeedOfProgressByMachineSn", method = RequestMethod.POST)
  public Result getSpeedOfProgressByMachineSn(@RequestBody BdcDeliverRequestVo<BdcSpeedOfProgress> bdcSpeedOfProgressVo) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcSpeedOfProgressVo));
    if (StringUtils.isEmpty(bdcSpeedOfProgressVo.getMachineSn())) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(BdcSpeedOfProgress.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("machineSn", bdcSpeedOfProgressVo.getMachineSn());
    List<BdcSpeedOfProgress> serviceList = bdcSpeedOfProgressService.findByCondition(condition);
    logger.info("获取服务信息接口响应数据:{}", JSON.toJSONString(serviceList));
    return ResultGenerator.genSuccessResult(serviceList);
  }

  /**
   * 新增设备部署进度信息
   *
   * @param bdcSpeedOfProgress 设备部署进度信息
   * @return 是否入库成功
   */
  @ApiOperation(value = "新增设备部署进度信息")
  @RequestMapping(value = "/insertSpeedOfProgress", method = RequestMethod.POST)
  private Result insertSpeedOfProgress(@RequestBody BdcSpeedOfProgress bdcSpeedOfProgress) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcSpeedOfProgress));
    Date date = new Date();
    bdcSpeedOfProgress.setRecordTime(date);
    bdcSpeedOfProgress.setUpdateTime(date);
    Condition condition = new Condition(BdcSpeedOfProgress.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("machineSn", bdcSpeedOfProgress.getMachineSn());
    List<BdcSpeedOfProgress> progressList = bdcSpeedOfProgressService.findByCondition(condition);
    if (progressList.size() == 0) {
      bdcSpeedOfProgressService.save(bdcSpeedOfProgress);
      return ResultGenerator.genSuccessResult();
    }
    return ResultGenerator.genFailResult("该设备的部署进度信息已存在,请勿重复添加！");
  }

  /**
   * 更新设备部署进度信息信息
   *
   * @param speedOfProgress 设备部署进度信息
   * @return 是否更新成功
   */
  @ApiOperation(value = "更新设备部署进度信息信息")
  @RequestMapping(value = "/updateSpeedOfProgress", method = RequestMethod.POST)
  private Result updateSpeedOfProgress(@RequestBody BdcSpeedOfProgress speedOfProgress) {
    logger.info("前端传入参数:{}", JSON.toJSONString(speedOfProgress));
    speedOfProgress.setUpdateTime(new Date());
    bdcSpeedOfProgressService.update(speedOfProgress);
    return ResultGenerator.genSuccessResult();
  }
}
