package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@ApiModel(value = "不动产类型对象", description = "描述")
@Table(name = "bdc_type")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BdcType {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  @ApiModelProperty(value = "id", name = "id", example = "122")
  private Integer id;
  /**
   * 类型编号
   */
  @ApiModelProperty(value = "代码标识0-查档，1-打证....")
  private String code;

  /**
   * 类型描述
   */
  @ApiModelProperty(value = "详细描述")
  private String details;

}
