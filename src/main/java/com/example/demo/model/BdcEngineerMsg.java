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
 * @description ： 机器部署工程师相关信息记录
 * @date ： 2021/1/29 14:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "机器部署工程师信息", description = "机器部署工程师相关信息记录")
@Table(name = "bdc_engineer_msg")
public class BdcEngineerMsg implements Serializable {

  @Column(name = "engineer_name", columnDefinition = "工程师")
  @ApiModelProperty(value = "工程师", name = "engineerName", example = "工程师姓名", dataType = "String")
  private String engineerName;
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
  @Column(name = "machine_sn", columnDefinition = "设备SN号")
  @ApiModelProperty(value = "设备SN号", name = "machineSn", example = "赵六", dataType = "String")
  private String machineSn;
  @Column(name = "record_time", columnDefinition = "记录时间")
  @ApiModelProperty(value = "记录时间", name = "recordTime", example = "2022-04-12 17:30:56", dataType = "String")
  private Date recordTime;
  @Column(name = "update_time", columnDefinition = "更新时间")
  @ApiModelProperty(value = "更新时间", name = "updateTime", example = "2022-04-12 17:30:56", dataType = "String")
  private Date updateTime;
  @Column(name = "duty", columnDefinition = "工程师职责")
  @ApiModelProperty(value = "工程师职责", name = "duty", example = "0:软件交付 1:硬件交付 2:后台开发 3:UI", dataType = "String")
  private String duty;


}
