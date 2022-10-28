package com.example.demo.controller.deliver;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.model.BdcArea;
import com.example.demo.service.BdcAreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author ： 185
 * @description ： 设备网点信息处理
 * @date ： 2022/4/8 13:59
 */
@Api(value = "设备网点信息", tags = "设备网点信息处理")
@RestController
@CrossOrigin
@RequestMapping("/bdc/deliver/area")
public class BdcAreaController {
  private static final Logger logger = LoggerFactory.getLogger(BdcAreaController.class);

  @Resource
  private BdcAreaService bdcAreaService;

  /**
   * 根据登录账号信息获取该登录账户名下所有网点信息 或某具体网点信息
   *
   * @param jsonObject 条件信息
   * @return 该登录账户名下所有网点信息 或某具体网点信息
   */
  @ApiOperation(value = "根据城市信息获取该登录账户名下所有网点信息")
  @RequestMapping(value = "/getAllAreaByUserName", method = RequestMethod.POST)
  public Result<List<BdcArea>> getAllAreaByUserName(@RequestBody JSONObject jsonObject) {
    logger.info("------------根据UserName获取该账户下的所有网点信息------------");
    logger.info("前端传入参数:{}", jsonObject);
    String userName = jsonObject.getString("userName");
    String areaName = jsonObject.getString("areaName");
    if (StringUtils.isEmpty(userName)) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    if (StringUtils.isEmpty(areaName)) {
      Condition condition = new Condition(BdcArea.class);
      Example.Criteria criteria = condition.createCriteria();
      criteria.orEqualTo("userName", userName);
      return ResultGenerator.genSuccessResult(bdcAreaService.findByCondition(condition));
    }
    Condition condition = new Condition(BdcArea.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("user_name", userName);
    return ResultGenerator.genSuccessResult(bdcAreaService.findByCondition(condition));
  }

  /**
   * 获取所有网点信息
   *
   * @return 网点信息
   */
  @ApiOperation(value = "获取所有网点信息")
  @RequestMapping(value = "/getAllArea", method = RequestMethod.POST)
  private Result getAllArea() {
    logger.info("-----------获取所有网点信息开始-----------");
    List<BdcArea> all = bdcAreaService.findAll();
    logger.info("网点信息响应至前端:{}", JSON.toJSONString(all));
    return ResultGenerator.genSuccessResult(all);
  }

  /**
   * 新增设备网点信息
   *
   * @param bdcArea 交付网点信息
   * @return 是否入库成功
   */
  @ApiOperation(value = "新增设备网点信息")
  @RequestMapping(value = "/insertArea", method = RequestMethod.POST)
  private Result insertArea(@RequestBody BdcArea bdcArea) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcArea));
    Condition condition = new Condition(BdcArea.class);
    Example.Criteria criteria = condition.createCriteria();
    Date date = new Date();
    bdcArea.setCreateTime(date);
    bdcArea.setUpdateTime(date);
    criteria.orEqualTo("areaName", bdcArea.getAreaName());
    List<BdcArea> areaList = bdcAreaService.findByCondition(condition);
    if (areaList.size() == 0) {
      bdcAreaService.save(bdcArea);
      return ResultGenerator.genSuccessResult();
    }
    return ResultGenerator.genFailResult("网点名称已存在,请重新添加！");

  }

  /**
   * 根据ID更新设备网点信息
   *
   * @param bdcArea 交付网点信息
   * @return 是否更新成功
   */
  @ApiOperation(value = "根据ID更新设备网点信息")
  @RequestMapping(value = "/updateArea", method = RequestMethod.POST)
  private Result updateArea(@RequestBody BdcArea bdcArea) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcArea));
    bdcArea.setUpdateTime(new Date());
    bdcAreaService.update(bdcArea);
    return ResultGenerator.genSuccessResult();
  }
}
