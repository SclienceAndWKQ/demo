package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.entity.ChinaArea;
import com.example.demo.entity.ChinaCity;
import com.example.demo.entity.ChinaProvince;
import com.example.demo.entity.ChinaTownship;
import com.example.demo.service.ChinaAreaService;
import com.example.demo.service.ChinaCityService;
import com.example.demo.service.ChinaProvinceService;
import com.example.demo.service.ChinaTownshipService;
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
import java.util.List;

/**
 * @author ： 185
 * @description ：
 * @date ： 2021/7/3 10:23
 */
@Api(value = "地点信息查询接口", tags = "地点信息查询接口")
@RestController
@RequestMapping("/bdc/chinaPlace")
public class ChinaPlaceController {

  private static final Logger logger = LoggerFactory.getLogger(ChinaPlaceController.class);
  @Resource
  private ChinaAreaService areaService;
  @Resource
  private ChinaCityService cityService;
  @Resource
  private ChinaProvinceService provinceService;
  @Resource
  private ChinaTownshipService townshipService;

  /**
   * 根据市区信息获取该市区的所有街道信息
   *
   * @param jsonObject 条件信息
   * @return 该市区的所有街道信息
   */
  @ApiOperation(value = "根据市区信息获取该市区的所有街道信息")
  @RequestMapping(value = "/getAllTownshipByFather", method = RequestMethod.POST)
  public Result<List<ChinaTownship>> getAllTownshipByFather(@RequestBody JSONObject jsonObject) {
    logger.info("------------根据市区code获取该市区的所有街道信息------------");
    logger.info("前端传入参数:{}", jsonObject);
    String father = jsonObject.getString("father");
    if (StringUtils.isEmpty(father)) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(ChinaTownship.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("father", father);
    return ResultGenerator.genSuccessResult(townshipService.findByCondition(condition));
  }

  /**
   * 根据城市信息获取该城市的所有市区信息
   *
   * @param jsonObject 条件信息
   * @return 该城市的所有市区信息
   */
  @ApiOperation(value = "根据城市信息获取该城市的所有市区信息")
  @RequestMapping(value = "/getAllAreaByFather", method = RequestMethod.POST)
  public Result<List<ChinaArea>> getAllAreaByFather(@RequestBody JSONObject jsonObject) {
    logger.info("------------根据城市code获取该城市的所有市区信息------------");
    logger.info("前端传入参数:{}", jsonObject);
    String father = jsonObject.getString("father");
    if (StringUtils.isEmpty(father)) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(ChinaArea.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("father", father);
    return ResultGenerator.genSuccessResult(areaService.findByCondition(condition));
  }

  /**
   * 根据省份信息查询该省份的所有城市
   *
   * @param jsonObject 条件信息
   * @return 该省份的所有城市信息
   */
  @ApiOperation(value = "根据省份信息查询该省份的所有城市")
  @RequestMapping(value = "/getAllCityByFather", method = RequestMethod.POST)
  public Result<List<ChinaCity>> getAllCityByFather(@RequestBody JSONObject jsonObject) {
    logger.info("------------根据省份code获取该省份的所有城市信息------------");
    logger.info("前端传入参数:{}", jsonObject);
    String father = jsonObject.getString("father");
    if (StringUtils.isEmpty(father)) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(ChinaCity.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("father", father);
    return ResultGenerator.genSuccessResult(cityService.findByCondition(condition));
  }

  /**
   * 获取所有省份信息
   *
   * @return 所有省份信息
   */
  @ApiOperation(value = "省份信息查询")
  @RequestMapping(value = "/getAllProvince", method = RequestMethod.POST)
  public Result<List<ChinaProvince>> getAllProvince() {
    logger.info("------------进入所有省份查询------------");
    return ResultGenerator.genSuccessResult(provinceService.findAll());
  }


}
