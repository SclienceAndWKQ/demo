package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bdc_machine_trouble")
@ApiModel(value = "机器故障", description = "机器故障信息记录")
public class BdcMachineTrouble {
  @Id
  @Column(name = "machine_id")
  @ApiModelProperty(value = "id", name = "machineId", example = "cdj1001001", dataType = "String")
  private String machineId;
  private Integer camera;
  @Column(name = "id_card")
  private Integer idCard;
  private Integer ipc;
  private Integer network;
  private Integer printer;
  private Integer scan;
  private Integer seal;
  @Column(name = "describe")
  @ApiModelProperty(value = "问题描述", name = "describe", example = "修改报表,人证比对通过率低", dataType = "String")
  private String describe;
  @Column(name = "resolvent")
  @ApiModelProperty(value = "解决方法", name = "resolvent", example = "修改字段,降低活体阈值", dataType = "String")
  private String resolvent;


}
