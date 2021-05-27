package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "机器配置信息", description = "机器配置相关信息记录")
@Table(name = "bdc_machine_config")
public class BdcMachineConfig {
  /**
   * 机器ID
   */
  @Id
  @Column(name = "machine_id")
  @ApiModelProperty(value = "机器id", name = "machineId", example = "cdj1001001", dataType = "String")
  private String machineId;

  /**
   * 启动浏览器显示的页面地址
   */
  @Column(name = "start_url")
  private String startUrl;

  /**
   * 读取后台配置接口地址
   */
  @Column(name = "config_url")
  private String configUrl;

  /**
   * 后台管理系统地址
   */
  @Column(name = "admin_system_url")
  private String adminSystemUrl;

  /**
   * 启动浏览器的副屏地址
   */
  @Column(name = "sec_screen_url")
  private String secScreenUrl;

  /**
   * 离线监测WebSocket地址
   */
  @Column(name = "offline_url")
  private String offlineUrl;
}
