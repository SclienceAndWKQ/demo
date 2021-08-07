package com.example.demo.dao;

import com.example.demo.core.mapper.Mapper;
import com.example.demo.entity.ChinaProvince;

import java.util.List;

public interface ChinaProvinceMapper extends Mapper<ChinaProvince> {
  /**
   * 获取所有的省市区信息
   *
   * @return 省市区信息
   */
  List<ChinaProvince> getProvinces();

}
