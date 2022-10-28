package com.example.demo.controller.deliver;

import com.alibaba.fastjson.JSON;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.model.BdcMachineInfo;
import com.example.demo.service.BdcMachineService;
import com.example.demo.vo.BdcMachineInfoVo;
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
 * @description ：机器设备相关信息处理接口
 * @date ： 2022/3/28 10:31
 */
@Api(value = "机器信息", tags = "机器信息处理接口")
@RestController
@RequestMapping("/bdc/deliver/machine")
public class BdcMachineController {

  private static final Logger logger = LoggerFactory.getLogger(BdcMachineController.class);

  @Resource
  private BdcMachineService bdcMachineService;


  /**
   * 获取指定网点设备的交付信息
   *
   * @param machineInfo 设备信息
   * @return 交付信息
   */
  @ApiOperation(value = "根据网点id获取该网点的交付信息")
  @RequestMapping(value = "/getMachineByAreaId", method = RequestMethod.POST)
  private Result getMachineByAreaId(@RequestBody BdcMachineInfo machineInfo) {
    logger.info("获取指定网点设备的交付信息,传入参数:{}", JSON.toJSONString(machineInfo));
    if (StringUtils.isEmpty(machineInfo.getAreaId())) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(BdcMachineInfo.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("areaId", machineInfo.getAreaId());
    List<BdcMachineInfo> machineList = bdcMachineService.findByCondition(condition);
    logger.info("获取指定网点设备的交付信息,响应前端数据:{}", JSON.toJSONString(machineList));
    return ResultGenerator.genSuccessResult(machineList);
  }

  /**
   * 获取指定类型设备的交付信息
   *
   * @param machineVo 指定设备类型
   * @return 交付信息
   */
  @ApiOperation(value = "根据设备id获取该设备的交付信息")
  @RequestMapping(value = "/getMachineByFunction", method = RequestMethod.POST)
  private Result getMachineByFunction(@RequestBody BdcMachineInfoVo machineVo) {
    logger.info("获取指定类型设备的交付信息,传入参数:{}", JSON.toJSONString(machineVo));
    Condition condition = new Condition(BdcMachineInfo.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("machineFunction", machineVo.getMachineFunction());
    List<BdcMachineInfo> machineList = bdcMachineService.findByCondition(condition);
    logger.info("获取指定类型设备的交付信息,响应前端数据:{}", JSON.toJSONString(machineList));
    return ResultGenerator.genSuccessResult(machineList);
  }


  /**
   * 交付设备信息入库
   *
   * @param bdcMachineInfo 交付设备
   * @return 是否入库成功
   */
  @ApiOperation(value = "交付设备信息入库")
  @RequestMapping(value = "/insertMachine", method = RequestMethod.POST)
  private Result insertMachine(@RequestBody BdcMachineInfo bdcMachineInfo) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcMachineInfo));
    Condition condition = new Condition(BdcMachineInfo.class);
    Example.Criteria criteria = condition.createCriteria();
    Date date = new Date();
    bdcMachineInfo.setUpdateTime(date);
    bdcMachineInfo.setInstallTime(date);
    criteria.orEqualTo("machineSn", bdcMachineInfo.getMachineSn());
    List<BdcMachineInfo> areaList = bdcMachineService.findByCondition(condition);
    if (areaList.size() == 0) {
      bdcMachineService.save(bdcMachineInfo);
      return ResultGenerator.genSuccessResult();
    }
    return ResultGenerator.genFailResult("设备SN已存在,请重新添加！");
  }

  /**
   * 交付设备信息更新
   *
   * @param bdcMachineInfo 交付设备
   * @return 是否更新成功
   */
  @ApiOperation(value = "交付设备信息更新")
  @RequestMapping(value = "/updateMachine", method = RequestMethod.POST)
  private Result updateMachine(@RequestBody BdcMachineInfo bdcMachineInfo) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcMachineInfo));
    bdcMachineInfo.setUpdateTime(new Date());
    bdcMachineService.update(bdcMachineInfo);
    return ResultGenerator.genSuccessResult();
  }


}
