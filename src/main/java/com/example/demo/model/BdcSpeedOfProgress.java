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
 * @description ： 项目部署进度信息
 * @date ： 2021/8/12 10:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "项目部署进度信息", description = "项目部署进度信息")
@Table(name = "bdc_speed_of_progress")
public class BdcSpeedOfProgress implements Serializable {
  @Column(name = "accept_time", columnDefinition = "验收时间")
  @ApiModelProperty(value = "验收时间", name = "acceptTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date acceptTime;
  @Column(name = "deliver_time", columnDefinition = "交付时间")
  @ApiModelProperty(value = "交付时间", name = "deliverTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date deliverTime;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
  private Integer id;
  @Column(name = "is_use", columnDefinition = "是否使用 0:已使用  1:未使用")
  @ApiModelProperty(value = "是否使用", name = "isUse", example = "1", dataType = "String")
  private String isUse;
  @Column(name = "machine_id", columnDefinition = "设备ID")
  @ApiModelProperty(value = "设备ID", name = "machineId", example = "1001001", dataType = "Integer")
  private Integer machineId;
  @Column(name = "machine_sn", columnDefinition = "设备Sn")
  @ApiModelProperty(value = "设备Sn", name = "machineSn", example = "XT00654", dataType = "String")
  private String machineSn;
  @Column(name = "record_time", columnDefinition = "记录时间")
  @ApiModelProperty(value = "记录时间", name = "recordTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date recordTime;
  @Column(name = "speed_of_progress", columnDefinition = "部署进度 0:对接中  1:进行中 2:异常  3:搁置")
  @ApiModelProperty(value = "部署进度", name = "speedOfProgress", example = "1", dataType = "String")
  private String speedOfProgress;
  @Column(name = "update_time", columnDefinition = "修改时间")
  @ApiModelProperty(value = "修改时间", name = "updateTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date updateTime;

}
