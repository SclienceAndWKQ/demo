package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author ： 185
 * @description ：
 * @date ： 2021/1/28 16:57
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "客戶端对象", description = "客戶端信息记录")
@Table(name = "bdc_pc_client")
public class BdcPcClient {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "客户端id", name = "id", example = "1001", dataType = "Integer")
  private Integer id;
  @Column(name = "activation_code", columnDefinition = "激活码")
  @ApiModelProperty(value = "激活码", name = "activationCode", example = "083Z-114N-P2BY-43KN", dataType = "String")
  private String activationCode;
  @Column(name = "dual_sensor", columnDefinition = "人脸识别算法")
  @ApiModelProperty(value = "人脸识别算法", name = "dualSensor", example = "虹软算法", dataType = "String")
  private String dualSensor;
  @Column(name = "edition", columnDefinition = "客户端版本")
  @ApiModelProperty(value = "客户端版本", name = "edition", example = "1.0.9.4", dataType = "String")
  private String edition;
  @Column(name = "machine_id", columnDefinition = "机器ID")
  @ApiModelProperty(value = "机器ID", name = "machineId", example = "cdj1001001", dataType = "String")
  private String machineId;


}
