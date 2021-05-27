package com.example.demo.dao;


import com.example.demo.core.mapper.Mapper;
import com.example.demo.model.BdcArea;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdcAreaMapper extends Mapper<BdcArea> {

  /**
   * 根据区域ID获取区域信息
   *
   * @param areaId
   * @return
   */

  BdcArea getAreaInfoByAreaId(@Param("areaId") Integer areaId);


  /**
   * 获取所有的区域
   *
   * @return
   */
  List<BdcArea> getAllArea();


  /**
   * 更新区域的typeId
   *
   * @param areaId
   * @param typeId
   */
  void updateAreaTypeIdByAreaId(@Param("areaId") Integer areaId, @Param("typeId") String typeId);

  /**
   * 根据区域名称获取区域信息
   *
   * @param areaName
   * @return
   */
  BdcArea findAreaInfoByAreaName(@Param("areaName") String areaName);

  /**
   * 获取区域下所有的功能
   *
   * @param areaId
   * @return
   */
  String getAreaAllFunction(String areaId);
}
