package com.example.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.service.AbstractService;
import com.example.demo.dao.ProvinceMapper;
import com.example.demo.model.Province;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ： 185
 * @description ：
 * @date ： 2021/5/26 19:57
 */
@Service("ProvinceServiceImpl")
public class ProvinceServiceImpl extends AbstractService<Province> implements ProvinceService {

  @Autowired(required = false)
  private ProvinceMapper provinceMapper;

  /**
   * 获取省市区的信息
   * @return 省市区信息(json格式)
   */
  @Override
  public Result getProvincesAndCitysAndAreas() {
    List<Province> allAreas = provinceMapper.getProvincesAndCitysAndAreas();
    return ResultGenerator.genSuccessResult(allAreas);
  }
}
