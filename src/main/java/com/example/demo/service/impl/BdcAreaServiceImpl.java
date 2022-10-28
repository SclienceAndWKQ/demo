package com.example.demo.service.impl;

import com.example.demo.core.result.Result;
import com.example.demo.core.service.AbstractService;
import com.example.demo.model.BdcArea;
import com.example.demo.service.BdcAreaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ： 185
 * @description ：
 * @date ： 2021/5/26 19:57
 */
@Service
@Transactional
public class BdcAreaServiceImpl extends AbstractService<BdcArea> implements BdcAreaService {
  @Override
  public Result<List<BdcArea>> addAreaInfo(BdcArea bdcArea) {
    return null;
  }

  @Override
  public List<BdcArea> findAreaByAreaNameAndUserName(String areaName, String userName) {
    return null;
  }

  @Override
  public BdcArea findAreaInfoByAreaName(String areaName) {
    return null;
  }

  @Override
  public String getAreaAllFunction(String areaId) {
    return null;
  }
}
