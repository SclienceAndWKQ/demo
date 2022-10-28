package com.example.demo.dao;

import com.example.demo.core.mapper.Mapper;
import com.example.demo.entity.ChinaArea;
import com.example.demo.model.BdcArea;

import java.util.List;

/**
 * 机器部署网点信息
 */
public interface BdcAreaMapper extends Mapper<BdcArea> {
  /**
   * 根据网点名称和账户名查询网点信息
   * @param areaName 网点名称
   * @param userId 账户名
   * @return 网点信息
   */
  List<BdcArea> findAreaByAreaNameAndUserName(String areaName, String userId);
}
