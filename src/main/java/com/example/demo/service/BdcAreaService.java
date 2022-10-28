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
   * 根据网点名称和账户名查询网点信息
   * @param areaName 网点名称
   * @param userName 账户名
   * @return 网点信息
   */
  List<BdcArea> findAreaByAreaNameAndUserName(String areaName,String userName);

  /**
   * 获取区域下的typeId
   *
   * @param areaId
   * @return
   */
  String getAreaAllFunction(String areaId);

}
