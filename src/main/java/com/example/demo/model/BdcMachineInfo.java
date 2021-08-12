package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ： 185
 * @description ： 对机器相关信息记录
 * @date ： 2021/8/12 9:17
 */
@Table(name = "bdc_machine_info")
@ApiModel(value = "机器对象", description = "机器信息")
@Data
public class BdcMachineInfo implements Serializable {
  /**
   * 设备所在区域(网点)
   */
  @Column(name = "area_id")
  @ApiModelProperty(value = "区域ID", name = "areaId", example = "1")
  private Integer areaId;
  /**
   * 硬件指纹码（用于激活OCR算法）
   */
  @Column(name = "fingerprint_code")
  @ApiModelProperty(value = "硬件指纹码", name = "fingerprintCode", example = "RD21FRSXRSRD21FRSXRSFD42HNFD42HN")
  private String fingerprintCode;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "id", name = "id", example = "1")
  private Integer id;
  /**
   * 安装部署时间
   */
  @Column(name = "install_time")
  @ApiModelProperty(value = "部署时间", name = "installTime", example = "2019-11-21")
  private String installTime;
  /**
   * 有无自动门
   */
  @Column(name = "is_have_automaticdoor")
  @ApiModelProperty(value = "硬件指纹码", name = "isHaveAutomaticDoor", example = "无")
  private String isHaveAutomaticDoor;
  /**
   * 机器设备Id
   */
  @Column(name = "machine_id")
  @ApiModelProperty(value = "机器ID", name = "machineId", example = "111111")
  private String machineId;
  /**
   * 机器ip
   */
  @Column(name = "machine_ip")
  @ApiModelProperty(value = "机器ip", name = "machineIp", example = "192.168.0.1")
  private String machineIp;
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
   * 机器型号
   */
  @Column(name = "machine_type")
  @ApiModelProperty(value = "机器型号", name = "machineType", example = "8086")
  private String machineType;
  /**
   * OCR激活码
   */
  @Column(name = "ocr_code")
  @ApiModelProperty(value = "OCR激活码", name = "ocrCode", example = "RD21-FRSX-RSFD-42HN")
  private String ocrCode;
  /**
   * OCR类型（百度、之元）
   */
  @Column(name = "ocr_type")
  @ApiModelProperty(value = "OCR类型（百度、之元）", name = "ocrType", example = "RD21-FRSX-RSFD-42HN")
  private String ocrType;
  /**
   * 备注
   */
  @ApiModelProperty(value = "备注", name = "remark", example = "机器运行良好！")
  private String remark;
  /**
   * 人证比对激活码
   */
  @Column(name = "rzbd_code")
  @ApiModelProperty(value = "人证比对激活码", name = "rzbdCode", example = "RD21-FRSX-RSFD-42HN")
  private String rzbdCode;
  /**
   * 人证比对类型（搜狗、百度、虹软）
   */
  @Column(name = "rzbd_type")
  @ApiModelProperty(value = "人证比对类型（搜狗、百度、虹软）", name = "rzbdType", example = "虹软")
  private String rzbdType;
  /**
   * 所属服务ID
   */
  @Column(name = "service_id")
  @ApiModelProperty(value = "部署的服务ID", name = "serviceId", example = "1001")
  private String serviceId;
  /**
   * 机器唯一标识 SN
   */
  @Column(name = "sn")
  @ApiModelProperty(value = "机器唯一标识 SN", name = "sn", example = "YT1026561")
  private String sn;
  /**
   * 设备状态。0:正常;1：故障;2:报废
   */
  @ApiModelProperty(value = "设备状态(0:正常;1：故障;2:报废)", name = "state", example = "0")
  private String state;


}
