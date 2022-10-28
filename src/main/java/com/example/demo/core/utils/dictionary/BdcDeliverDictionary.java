package com.example.demo.core.utils.dictionary;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ： 185
 * @description ： 吉奥业务协同共享统一接口规范
 * @date ： 2022/3/21 15:30
 */

public class BdcDeliverDictionary {
  /**
   * 1.11. 表 A1 人员职责
   *
   * @param code code值
   * @return 人员职责
   */
  public static String getEngineerDuty(String code) {
    Map<String, String> dutyMap = new HashMap<>();
    dutyMap.put("0", "软件交付工程师");
    dutyMap.put("1", "硬件交付工程师");
    dutyMap.put("2", "后台开发工程师");
    dutyMap.put("3", "前端开发工程师");
    return dutyMap.get(code);
  }

  /**
   * 1.12 表 A2 激活码类型
   * @param code code值
   * @return 激活码类型
   */
  public static String getActivationType(String code){
    Map<String, String> typeMap = new HashMap<>();
    typeMap.put("0", "人证比对虹软算法");
    typeMap.put("1", "人证比对百度算法");
    typeMap.put("2", "人证比对加密狗");
    typeMap.put("3", "OCR百度算法");
    typeMap.put("4", "OCR之元算法");
    return typeMap.get(code);
  }
  /**
   * 1.13 表 A3 功能状态
   * @param code code值
   * @return 功能使用情况
   */
  public static String getFunctionState(String code){
    Map<String, String> stateMap = new HashMap<>();
    stateMap.put("0", "未使用");
    stateMap.put("1", "已使用");
    return stateMap.get(code);
  }
  /**
   * 1.14 表 A4 设备状态
   * @param code code值
   * @return 设备状态
   */
  public static String getMachineState(String code){
    Map<String, String> stateMap = new HashMap<>();
    stateMap.put("0", "正常");
    stateMap.put("1", "故障");
    stateMap.put("2", "报废");
    return stateMap.get(code);
  }
}
