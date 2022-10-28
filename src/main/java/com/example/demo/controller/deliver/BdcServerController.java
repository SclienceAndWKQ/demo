package com.example.demo.controller.deliver;

import com.alibaba.fastjson.JSON;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.model.BdcServer;
import com.example.demo.service.BdcServerService;
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
 * @description ： 设备服务器信息处理
 * @date ： 2022/4/8 13:59
 */
@Api(value = "设备服务器信息", tags = "设备服务器信息处理")
@RestController
@RequestMapping("/bdc/deliver/server")
public class BdcServerController {
  private static final Logger logger = LoggerFactory.getLogger(BdcServerController.class);

  @Resource
  private BdcServerService bdcServerService;

  /**
   * 根据id获取服务器信息
   *
   * @param server 条件信息
   * @return 服务器信息
   */
  @ApiOperation(value = "根据id获取服务器信息")
  @RequestMapping(value = "/getServerById", method = RequestMethod.POST)
  public Result getServerById(@RequestBody BdcServer server) {
    logger.info("------------根据id获取服务器信息------------");
    logger.info("前端传入参数:{}", JSON.toJSONString(server));
    if (StringUtils.isEmpty(server.getId())) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(BdcServer.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("id", server.getId());
    List<BdcServer> serverList = bdcServerService.findByCondition(condition);
    logger.info("获取服务器信息接口响应数据:{}", JSON.toJSONString(serverList));
    return ResultGenerator.genSuccessResult(serverList);
  }

  /**
   * 新增设备服务器信息
   *
   * @param bdcServer 服务器信息
   * @return 是否入库成功
   */
  @ApiOperation(value = "新增设备服务器信息")
  @RequestMapping(value = "/insertServer", method = RequestMethod.POST)
  private Result insertServer(@RequestBody BdcServer bdcServer) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcServer));
    Condition condition = new Condition(BdcServer.class);
    Example.Criteria criteria = condition.createCriteria();
    Date date = new Date();
    bdcServer.setRecordTime(date);
    bdcServer.setUpdateTime(date);
    criteria.orEqualTo("name", bdcServer.getName());
    List<BdcServer> serverList = bdcServerService.findByCondition(condition);
    if (serverList.size() == 0) {
      bdcServerService.save(bdcServer);
      return ResultGenerator.genSuccessResult();
    }
    return ResultGenerator.genFailResult("服务器名称已存在,请核查之后重新添加！");

  }

  /**
   * 更新设备服务器信息
   *
   * @param bdcServer 服务器信息
   * @return 是否更新成功
   */
  @ApiOperation(value = "更新设备服务器信息")
  @RequestMapping(value = "/updateServer", method = RequestMethod.POST)
  private Result updateServer(@RequestBody BdcServer bdcServer) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcServer));
    bdcServer.setUpdateTime(new Date());
    bdcServerService.update(bdcServer);
    return ResultGenerator.genSuccessResult();
  }
}
