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
 * @description ： 对机器进行远程的信息记录
 * @date ： 2021/8/12 10:20
 */
@Data
@ApiModel(value = "对机器进行远程信息的记录", description = "对机器进行远程信息的记录")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bdc_long_range")
public class BdcLongRange implements Serializable {

  @Column(name = "app_type", columnDefinition = "app类型")
  @ApiModelProperty(value = "APP类型", name = "appType", example = "向日葵/TV/ToDesk", dataType = "String")
  private String appType;
  @Id
  @Column(name = "id", columnDefinition = "设备远程信息id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
  private Integer id;
  @Column(name = "identification_code", columnDefinition = "识别码")
  @ApiModelProperty(value = "识别码", name = "identificationCode", example = "559 975 321", dataType = "String")
  private String identificationCode;
  @Column(name = "machine_id", columnDefinition = "机器ID")
  @ApiModelProperty(value = "机器ID", name = "machineId", example = "1001001", dataType = "String")
  private Integer machineId;
  @Column(name = "psw", columnDefinition = "远程连接密码")
  @ApiModelProperty(value = "远程连接密码", name = "psw", example = "1234", dataType = "String")
  private String psw;
  @Column(name = "record_time", columnDefinition = "记录时间")
  @ApiModelProperty(value = "记录时间", name = "recordTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date recordTime;
  @Column(name = "update_time", columnDefinition = "更新时间")
  @ApiModelProperty(value = "更新时间", name = "updateTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date updateTime;
  @Column(name = "machine_sn", columnDefinition = "机器SN号")
  @ApiModelProperty(value = "机器SN号", name = "machineSn", example = "XT00365", dataType = "String")
  private String machineSn;
  @Column(name = "double_pass", columnDefinition = "是否双通")
  @ApiModelProperty(value = "是否双通", name = "doublePass", example = "0:是  1:否", dataType = "String")
  private String doublePass;


}
