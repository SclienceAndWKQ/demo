package com.example.demo.controller.deliver;

import com.alibaba.fastjson.JSON;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.model.BdcFortressMachine;
import com.example.demo.service.BdcFortressMachineService;
import com.example.demo.vo.BdcFortressMachineVo;
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
 * @description ：堡垒机信息处理
 * @date ： 2022/4/12 11:26
 */
@Api(value = "堡垒机信息", tags = "堡垒机信息处理")
@RestController
@RequestMapping("/bdc/deliver/fortress")
public class BdcFortressMachineController {
  private static final Logger logger = LoggerFactory.getLogger(BdcFortressMachineController.class);

  @Resource
  private BdcFortressMachineService bdcFortressMachineService;

  /**
   * 根据服务器id获取堡垒机信息
   *
   * @param fortressMachineVo 条件信息
   * @return 堡垒机信息
   */
  @ApiOperation(value = "根据服务器id获取堡垒机信息")
  @RequestMapping(value = "/getFortressMachineByServerId", method = RequestMethod.POST)
  public Result getFortressMachineByServerId(@RequestBody BdcFortressMachineVo fortressMachineVo) {
    logger.info("前端传入参数:{}", JSON.toJSONString(fortressMachineVo));
    if (StringUtils.isEmpty(fortressMachineVo.getServerId())) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(BdcFortressMachine.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("serverId", fortressMachineVo.getServerId());
    List<BdcFortressMachine> serviceList = bdcFortressMachineService.findByCondition(condition);
    logger.info("获取服务信息接口响应数据:{}", JSON.toJSONString(serviceList));
    return ResultGenerator.genSuccessResult(serviceList);
  }

  /**
   * 新增堡垒机信息
   *
   * @param fortressMachine 堡垒机信息
   * @return 是否入库成功
   */
  @ApiOperation(value = "新增堡垒机信息")
  @RequestMapping(value = "/insertFortressMachine", method = RequestMethod.POST)
  private Result insertFortressMachine(@RequestBody BdcFortressMachine fortressMachine) {
    logger.info("前端传入参数:{}", JSON.toJSONString(fortressMachine));
    Date date = new Date();
    fortressMachine.setRecordTime(date);
    fortressMachine.setUpdateTime(date);
    bdcFortressMachineService.save(fortressMachine);
    return ResultGenerator.genSuccessResult();
  }

  /**
   * 更新堡垒机信息
   *
   * @param fortressMachine 堡垒机信息
   * @return 是否更新成功
   */
  @ApiOperation(value = "更新堡垒机信息")
  @RequestMapping(value = "/updateFortressMachine", method = RequestMethod.POST)
  private Result updateFortressMachine(@RequestBody BdcFortressMachine fortressMachine) {
    logger.info("前端传入参数:{}", JSON.toJSONString(fortressMachine));
    fortressMachine.setUpdateTime(new Date());
    bdcFortressMachineService.update(fortressMachine);
    return ResultGenerator.genSuccessResult();
  }
}
