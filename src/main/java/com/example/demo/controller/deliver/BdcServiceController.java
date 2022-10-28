package com.example.demo.controller.deliver;

import com.alibaba.fastjson.JSON;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.model.BdcServiceMsg;
import com.example.demo.service.BdcServiceService;
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
 * @description ：设备服务信息处理
 * @date ： 2022/4/12 11:26
 */
@Api(value = "设备服务信息", tags = "设备服务信息处理")
@RestController
@RequestMapping("/bdc/deliver/service")
public class BdcServiceController {
  private static final Logger logger = LoggerFactory.getLogger(BdcServiceController.class);

  @Resource
  private BdcServiceService bdcServiceService;

  /**
   * 根据id获取服务信息
   *
   * @param serviceMsg 条件信息
   * @return 服务信息
   */
  @ApiOperation(value = "根据id获取服务信息")
  @RequestMapping(value = "/getServiceById", method = RequestMethod.POST)
  public Result getServiceById(@RequestBody BdcServiceMsg serviceMsg) {
    logger.info("------------根据id获取服务信息------------");
    logger.info("前端传入参数serviceId:{}", JSON.toJSONString(serviceMsg));
    if (StringUtils.isEmpty(serviceMsg.getId())) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(BdcServiceMsg.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("id", serviceMsg.getId());
    List<BdcServiceMsg> serviceList = bdcServiceService.findByCondition(condition);
    logger.info("获取服务信息接口响应数据:{}", JSON.toJSONString(serviceList));
    return ResultGenerator.genSuccessResult(serviceList);
  }

  /**
   * 新增设备服务信息
   *
   * @param bdcService 服务信息
   * @return 是否入库成功
   */
  @ApiOperation(value = "新增设备服务信息")
  @RequestMapping(value = "/insertService", method = RequestMethod.POST)
  private Result insertService(@RequestBody BdcServiceMsg bdcService) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcService));
    Date date = new Date();
    bdcService.setDeployTime(date);
    bdcService.setUpdateTime(date);
    bdcServiceService.save(bdcService);
    return ResultGenerator.genSuccessResult();
  }

  /**
   * 根据id更新设备服务信息
   *
   * @param bdcService 服务信息
   * @return 是否更新成功
   */
  @ApiOperation(value = "根据id更新设备服务信息")
  @RequestMapping(value = "/updateService", method = RequestMethod.POST)
  private Result updateService(@RequestBody BdcServiceMsg bdcService) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcService));
    bdcService.setUpdateTime(new Date());
    bdcServiceService.update(bdcService);
    return ResultGenerator.genSuccessResult();
  }
}
