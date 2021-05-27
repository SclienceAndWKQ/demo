package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Table(name = "bdc_machine_info")
@ApiModel(value = "机器对象", description = "机器信息")
@Data
public class BdcMachineInfo {
  /**
   * id
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "id", name = "id", example = "1")
  private Integer id;

  /**
   * 机器设备Id
   */
  @Column(name = "machine_id")
  @ApiModelProperty(value = "机器ID", name = "machineId", example = "111111")
  private String machineId;


  /**
   * 设备功能
   */
  @Column(name = "machine_function", columnDefinition = "")
  @ApiModelProperty(value = "机器功能", name = "machineFunction", example = "1,2,3,4,5,6")
  private String machineFunction;

  /**
   * 安装部署时间
   */
  @Column(name = "install_time")
  @ApiModelProperty(value = "部署时间", name = "installTime", example = "2019-11-21")
  private String installTime;

  /**
   * 设备所在区域(网点)
   */
  @Column(name = "area_id")
  @ApiModelProperty(value = "区域ID", name = "areaId", example = "1")
  private Integer areaId;

  /**
   * 设备状态。0:正常;1：故障;2:报废
   */
  @ApiModelProperty(value = "设备状态(0:正常;1：故障;2:报废)", name = "state", example = "0")
  private String state;

  /**
   * 安装人信息
   */
  @Column(name = "engineer_id")
  @ApiModelProperty(value = "安装人", name = "engineerId", example = "张三")
  private String engineerId;


  /**
   * 机器型号
   */
  @Column(name = "machine_type")
  @ApiModelProperty(value = "机器型号", name = "machineType", example = "8086")
  private String machineType;

  /**
   * 备注
   */
  @ApiModelProperty(value = "备注", name = "remark", example = "机器运行良好！")
  private String remark;

  /**
   * 打印机类型
   */
  @Column(name = "machine_printer_type")
  @ApiModelProperty(value = "打印机类型", name = "machinePrinterType", example = "惠普")
  private String machinePrinterType;

  /**
   * 盖章机型号
   */
  @Column(name = "machine_stamp_type")
  @ApiModelProperty(value = "盖章机类型", name = "machineStampType", example = "兆伟")
  private String machineStampType;
  /**
   * 机器ip
   */
  @Column(name = "machine_ip")
  @ApiModelProperty(value = "机器ip", name = "machineIp", example = "192.168.0.1")
  private String machineIp;

}
