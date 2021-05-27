package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author ： 185
 * @description ：
 * @date ： 2021/1/29 11:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "机器部署信息", description = "机器部署相关信息记录")
@Table(name = "bdc_machine_config")
public class BdcServerMsg {
  @Id
  private String id;
  /**
   * 机器所分配的IP地址
   */
  @Column(name = "machine_ip")
  private String machineIp;

  /**
   * 服务部署所在磁盘位置
   */
  private String serverLocation;
  /**
   * 服务器IP
   */
  @Column(name = "server_ip")
  @ApiModelProperty
  private String serverIp;

  @Column(name = "server_name")
  @ApiModelProperty(value = "服务名称", name = "serverName", example = "MK-Background-CDJ", dataType = "String")
  private String serverName;
  /**
   * 远程桌面连接服务器账号
   */
  @Column(name = "server_user_name")
  @ApiModelProperty(value = "远程桌面连接服务器账号", name = "serverUserName", example = "192.168.0.192", dataType = "String")
  private String serverUserName;
  /**
   * 远程桌面连接服务器密码
   */
  @Column(name = "server_password")
  @ApiModelProperty(value = "远程桌面连接服务器密码", name = "serverPassword", example = "BDC@123", dataType = "String")
  private String serverPassword;
  /**
   * 记录信息时的部署进度
   */
  @Column(name = "deploy_progress")
  private String deployProgress;
  /**
   * 部署时间
   */
  @Column(name = "deploy_time")
  private Date deployTime;
  /**
   * 运行代码所在区域
   */
  @Column(name = "code_area")
  private String codeArea;
  /**
   * 服务器部署人员信息记录
   */
  @Column(name = "engineer_id")
  @ApiModelProperty(value = "部署服务器人员id", name = "engineerId", example = "软件工程师:小蓝", dataType = "String")
  private String engineerId;
  @Column(name = "area_id", columnDefinition = "区域ID")
  @ApiModelProperty(value = "区域ID", name = "areaId", example = "001", dataType = "String")
  private String areaId;
}
