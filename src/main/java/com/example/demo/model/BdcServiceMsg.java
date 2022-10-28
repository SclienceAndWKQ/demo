package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author ： 185
 * @description ： 部署服务信息记录
 * @date ： 2021/1/29 11:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "机器部署信息", description = "机器部署相关信息记录")
@Table(name = "bdc_service_msg")
public class BdcServiceMsg implements Serializable {
  @Column(name = "auxiliary_screen_url")
  @ApiModelProperty(value = "副屏地址", name = "auxiliaryScreenUrl", example = "http://192.168.0.61:7070/fp", dataType = "String")
  private String auxiliaryScreenUrl;
  @Column(name = "back_model")
  @ApiModelProperty(value = "后台服务模式", name = "backModel", example = "正式模式 0:正式 1:测试", dataType = "String")
  private String backModel;
  @Column(name = "background_service_location")
  @ApiModelProperty(value = "background服务所在磁盘位置", name = "backgroundServiceLocation", example = "D:\\resources\\MKBackgroundnt", dataType = "String")
  private String backgroundServiceLocation;
  @Column(name = "background_service_name")
  @ApiModelProperty(value = "background服务名称", name = "backgroundServiceName", example = "MK-Background-CDJ", dataType = "String")
  private String backgroundServiceName;
  @Column(name = "background_url")
  @ApiModelProperty(value = "后台地址", name = "backgroundUrl", example = "http://192.168.0.61:8800", dataType = "String")
  private String backgroundUrl;
  @Column(name = "deploy_time")
  @ApiModelProperty(value = "交付时间", name = "deployTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date deployTime;
  @Column(name = "fore_end_url")
  @ApiModelProperty(value = "前端地址", name = "foreEndUrl", example = "http://192.168.0.61:7070/dzj", dataType = "String")
  private String foreEndUrl;
  @Column(name = "front_model")
  @ApiModelProperty(value = "前端服务模式", name = "frontModel", example = "未开启人证 0:开启人证 1:未开启人证", dataType = "String")
  private String frontModel;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
  private Integer id;
  @Column(name = "management_system_url")
  @ApiModelProperty(value = "管理系统登录地址", name = "managementSystemUrl", example = "http://192.168.0.61:7070/htgl", dataType = "String")
  private String managementSystemUrl;
  @Column(name = "mapping_ip", columnDefinition = "服务器映射ip")
  @ApiModelProperty(value = "服务器映射ip", name = "mappingIp", example = "10.9.131.32", dataType = "String")
  private String mappingIp;
  @Column(name = "mapping_port", columnDefinition = "服务器映射端口")
  @ApiModelProperty(value = "服务器映射端口", name = "mappingPort", example = "11903", dataType = "String")
  private String mappingPort;
  @Column(name = "nginx_service_location")
  @ApiModelProperty(value = "nginx服务所在磁盘位置", name = "nginxServiceLocation", example = "D:\\MOKE\\nginx-1.15.0", dataType = "String")
  private String nginxServiceLocation;
  @Column(name = "nginx_service_name")
  @ApiModelProperty(value = "nginx服务名称", name = "nginxServiceName", example = "MK-Nginx", dataType = "String")
  private String nginxServiceName;
  @Column(name = "server_id")
  @ApiModelProperty(value = "服务器id", name = "serverId", example = "1001", dataType = "String")
  private String serverId;
  @Column(name = "update_time", columnDefinition = "更新时间")
  @ApiModelProperty(value = "更新时间", name = "updateTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date updateTime;

}
