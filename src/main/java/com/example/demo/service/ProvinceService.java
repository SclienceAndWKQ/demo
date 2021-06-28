package com.example.demo.service;

import com.example.demo.core.result.Result;
import com.example.demo.core.service.Service;
import com.example.demo.model.Province;

import java.util.List;

public interface ProvinceService extends Service<Province> {

  /**
   * 获取所有的省市区信息
   * @return 省市区信息
   */
  Result getProvincesAndCitysAndAreas();
}
