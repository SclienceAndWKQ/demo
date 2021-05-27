package com.example.demo.service.impl;


import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.service.AbstractService;
import com.example.demo.dao.BdcAreaMapper;
import com.example.demo.model.BdcArea;
import com.example.demo.service.BdcAreaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2019/11/19.
 */
@Service
@Transactional
public class BdcAreaServiceImpl extends AbstractService<BdcArea> implements BdcAreaService {

  @Resource
  private BdcAreaMapper bdcAreaMapper;

  @Override
  @SuppressWarnings("unchecked")
  public Result<List<BdcArea>> addAreaInfo(BdcArea bdcArea) {
    bdcArea.setAreaId(Integer.parseInt(String.valueOf(System.nanoTime() / 1000000000)));
    if (bdcAreaMapper.insertSelective(bdcArea) > 0) {
      List<BdcArea> allAreaList = bdcAreaMapper.getAllArea();
      return ResultGenerator.genSuccessResult(allAreaList);
    } else {
      return ResultGenerator.genFailResult("区域添加失败！");
    }
  }


  @Override
  public BdcArea findAreaInfoByAreaName(String areaName) {
    return bdcAreaMapper.findAreaInfoByAreaName(areaName);

  }


  @Override
  public String getAreaAllFunction(String areaId) {
    return bdcAreaMapper.getAreaAllFunction(areaId);
  }
}
