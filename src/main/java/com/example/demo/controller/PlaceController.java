package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.model.Area;
import com.example.demo.model.City;
import com.example.demo.model.Province;
import com.example.demo.service.AreaService;
import com.example.demo.service.CityService;
import com.example.demo.service.ProvinceService;
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
 * @date ： 2021/5/26 19:22
 */

@Api(value = "地点信息查询接口", tags = "地点信息查询接口")
@RestController
@RequestMapping("/bdc/place")
public class PlaceController {

    private static final Logger logger = LoggerFactory.getLogger(PlaceController.class);
    @Resource
    private AreaService areaService;
    @Resource
    private CityService cityService;
    @Resource
    private ProvinceService provinceService;

    /**
     * 根据省份信息查询该省份的所有城市
     *
     * @param jsonObject 条件信息
     * @return 该省份的所有城市信息
     */
    @ApiOperation(value = "根据省份信息查询该省份的所有城市")
    @RequestMapping(value = "/getAllCityByFather", method = RequestMethod.POST)
    public Result<List<City>> getAllCityByFather(@RequestBody JSONObject jsonObject) {
        logger.info("------------根据省份信息获取该省份的所有城市信息------------");
        logger.info("前端传至后台时的参数:{}", jsonObject);
        String father = jsonObject.getString("father");
        if (StringUtils.isEmpty(father)) {
            return ResultGenerator.genFailResult("请核查条件信息!");
        }
        Condition condition = new Condition(City.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.orEqualTo("father", father);
        return ResultGenerator.genSuccessResult(cityService.findByCondition(condition));
    }

  /**
   * 根据城市信息获取该城市的所有市区信息
   *
   * @param jsonObject 条件信息
   * @return 该城市的所有市区信息
   */
  @ApiOperation(value = "根据城市信息获取该城市的所有市区信息")
  @RequestMapping(value = "/getAllAreaByFather", method = RequestMethod.POST)
  public Result<List<Area>> getAllAreaByFather(@RequestBody JSONObject jsonObject) {
    logger.info("------------根据城市信息获取该城市的所有市区信息------------");
    logger.info("前端传至后台时的参数:{}", jsonObject);
    String father = jsonObject.getString("father");
    if (StringUtils.isEmpty(father)) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(Area.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("father", father);
    return ResultGenerator.genSuccessResult(areaService.findByCondition(condition));
  }

    /**
     * 获取所有省份信息
     *
     * @return 所有省份信息
     */
    @ApiOperation(value = "省份信息查询")
    @RequestMapping(value = "/getAllProvince", method = RequestMethod.POST)
    public Result<List<Province>> getAllProvince() {
        logger.info("------------进入所有省份查询------------");
        return ResultGenerator.genSuccessResult(provinceService.findAll());
    }


}
