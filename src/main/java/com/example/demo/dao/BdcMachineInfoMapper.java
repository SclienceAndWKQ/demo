package com.example.demo.dao;

import com.example.demo.core.mapper.Mapper;
import com.example.demo.model.BdcMachineInfo;

public interface BdcMachineInfoMapper extends Mapper<BdcMachineInfo> {

  /**
   * 添加机器
   *
   * @param bdcMachineInfo
   */
//  void addMachineInfo(BdcMachineInfo bdcMachineInfo);

  /**
   * 删除机器信息
   *
   * @param machineId
   */
//  void deleteMachineByMachineId(@Param("machineId") String machineId);

  /**
   * 获取所有的机器信息
   *
   * @return
   */
//  List<BdcMachineInfo> findAllMachineInfo();

  /**
   * 获取区域下该功能的所有机器
   *
   * @param areaId;
   * @param functionValue;
   * @return BdcMachineInfo
   */
//  List<BdcMachineInfo> findMachineNumber(@Param("areaId") Integer areaId, @Param("functionValue") Integer functionValue);

  /**
   * 获取区域下的所有机器
   *
   * @param areaId
   * @return
   */
//  List<BdcMachineInfo> findProofMachineNumber(@Param("areaId") String areaId);

  /**
   * 获取所有的function
   *
   * @return
   */
//  String getAllMachineFunction();


  /**
   * 根据机器ID获取机器所有功能
   *
   * @param machineId
   * @return
   */
//  String getMachineFunctionByMachineId(@Param("machineId") String machineId);

  /**
   * 获取该区域下所有的机器信息
   *
   * @param areaId
   * @return
   */
//  List<BdcMachineInfo> getMachineInfoByAreaId(@Param("areaId") String areaId);

  /**
   * 更新机器ip和mac
   *
   * @return
   */
//  int insertMachineIpAndMac(@Param("machineId") String machineId, @Param("mac") String mac, @Param("ip") String ip, @Param("compareThreshold") String compareThreshold);

  /**
   * 根据区域ID去获取该区域下面的功能
   *
   * @param areaId
   * @return
   */
//  String selectFunctionByAreaId(@Param("areaId") Integer areaId);

  /**
   * 更新机器信息
   *
   * @param bdcMachineInfo
   */
//  void updateMachineInfo(BdcMachineInfo bdcMachineInfo);

  /**
   * 更新继电器IP
   *
   * @param machineId
   * @param newIp
   */
//  void updateMachineInfoOfRelayIp(@Param("machineId") String machineId, @Param("newIp") String newIp);

  /**
   * 修改机器的备注信息
   *
   * @param machineId
   * @param remark
   */
//  void updateMachineRemarkInfo(@Param("machineId") String machineId, @Param("remark") String remark);

  /**
   * 跟新机器的状态为启用
   *
   * @param machineId
   */
//  void updateMachineStateToStart(@Param("machineId") String machineId);

  /**
   * 更改机器状态为停用
   *
   * @param machineId
   */
//  void updateMachineStateToStop(@Param("machineId") String machineId);


}
