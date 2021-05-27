package com.example.demo.dao;

import com.example.demo.core.mapper.Mapper;
import com.example.demo.model.BdcAddress;
import com.example.demo.model.BdcArea;

import java.util.List;


public interface BdcAddressMapper extends Mapper<BdcAddress> {
  /**
   * 根据网点id获取网点具体地址
   *
   * @param areaId 网点id
   * @return 网点具体地址
   */
  BdcAddress getAddressByAreaId(String areaId);

  /**
   * 根据地址信息获取区域
   *
   * @param addressId 地址id
   * @return 区域信息
   */
  List<BdcArea> getAreasByAddressId(String addressId);
}
