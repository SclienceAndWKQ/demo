package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ： 185
 * @description ： 机器部署工程师相关信息记录
 * @date ： 2021/1/29 14:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "机器部署工程师信息", description = "机器部署工程师相关信息记录")
@Table(name = "bdc_engineer_msg")
public class BdcEngineerMsg implements Serializable {

  @Column(name = "back_developer", columnDefinition = "后端开发工程师")
  @ApiModelProperty(value = "后端开发工程师", name = "backDeveloper", example = "张三", dataType = "String")
  private String backDeveloper;
  @Column(name = "hardware_deliver", columnDefinition = "硬件交付工程师")
  @ApiModelProperty(value = "硬件交付工程师", name = "hardwareDeliver", example = "王五", dataType = "String")
  private String hardwareDeliver;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
  private Integer id;
  @Column(name = "machine_id", columnDefinition = "机器ID")
  @ApiModelProperty(value = "机器ID", name = "machineId", example = "1001001", dataType = "String")
  private String machineId;
  @Column(name = "remarks", columnDefinition = "备注信息")
  @ApiModelProperty(value = "备注信息", name = "remarks", example = "现场人员为广电人员", dataType = "String")
  private String remarks;
  @Column(name = "software_deliver", columnDefinition = "软件交付工程师")
  @ApiModelProperty(value = "软件交付工程师", name = "softwareDeliver", example = "赵六", dataType = "String")
  private String softwareDeliver;
  @Column(name = "ui_developer", columnDefinition = "UI开发工程师")
  @ApiModelProperty(value = "UI开发工程师", name = "uiDeveloper", example = "李四", dataType = "String")
  private String uiDeveloper;


}
