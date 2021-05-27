package com.example.demo.service;


import com.example.demo.core.result.Result;
import com.example.demo.core.service.Service;
import com.example.demo.model.BdcArea;

import java.util.List;


/**
 * Created by CodeGenerator on 2019/11/19.
 */
public interface BdcAreaService extends Service<BdcArea> {

  /**
   * 新增区域
   *
   * @param bdcArea
   * @return
   */
  Result<List<BdcArea>> addAreaInfo(BdcArea bdcArea);

  /**
   * 根据区域名获取区域信息
   *
   * @param areaName
   * @return
   */
  BdcArea findAreaInfoByAreaName(String areaName);

  /**
   * 获取区域下的typeId
   *
   * @param areaId
   * @return
   */
  String getAreaAllFunction(String areaId);

}
