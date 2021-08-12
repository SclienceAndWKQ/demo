package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author ： 185
 * @description ： 对机器进行的操作记录信息,eg:新机安装 升级 扩增 维护
 * @date ： 2021/8/12 9:17
 */
@Table(name = "bdc_operation_msg")
@ApiModel(value = "对机器的操作信息", description = "对机器进行的操作信息")
@Data
public class BdcOperationMsg implements Serializable {
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
   * 操作内容
   */
  @Column(name = "operation_content")
  @ApiModelProperty(value = "操作内容", name = "operationContent", example = "升级百度OCR和虹软算法")
  private String operationContent;
  /**
   * 操作时间
   */
  @Column(name = "operation_date")
  @ApiModelProperty(value = "操作时间", name = "operationDate", example = "2021-08-12 12:23:56", dataType = "Date")
  private Date operationDate;
  /**
   * 操作ID
   */
  @Column(name = "operation_id")
  @ApiModelProperty(value = "操作ID", name = "operationId", example = "新机安装")
  private String operationId;
  /**
   * 操作类型
   */
  @Column(name = "operation_type")
  @ApiModelProperty(value = "新机安装", name = "operationType", example = "新机部署安装")
  private String operationType;

}
