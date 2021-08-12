package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author ： 185
 * @description ： 工程师与操作信息的联合主键对象
 * @date ： 2021/8/12 10:08
 */
@Data
@ApiModel(value = "工程师与操作信息的联合主键对象", description = "对机器进行某次维护的工程师人员记录")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "engineer_operation")
public class engineerAndOperation implements Serializable {
  @Column(name = "engineer_id", columnDefinition = "工程师相关人员id")
  @ApiModelProperty(value = "工程师相关人员id", name = "engineerId", example = "1202", dataType = "String")
  private String engineerId;
  @Column(name = "operation_id", columnDefinition = "对机器进行操作记录ID")
  @ApiModelProperty(value = "对机器进行操作记录ID", name = "operationId", example = "1001001", dataType = "String")
  private String operationId;
}
