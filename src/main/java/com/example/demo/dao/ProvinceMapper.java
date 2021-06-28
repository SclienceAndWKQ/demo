package com.example.demo.dao;

import com.example.demo.core.mapper.Mapper;
import com.example.demo.model.Province;

import java.util.List;

public interface ProvinceMapper extends Mapper<Province> {

  /**
   * 获取所有的省市区信息
   * @return 省市区信息
   */
  List<Province> getProvincesAndCitysAndAreas();

}
