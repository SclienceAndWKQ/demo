package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ： 185
 * @description ： 乡镇/街道 信息
 * @date ： 2021/7/2 15:21
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "china_township")
public class ChinaTownship implements Serializable {

  @ApiModelProperty(value = "街道/乡镇编号", name = "code", example = "100100101")
  @Column(name = "code")
  private String code;
  @ApiModelProperty(value = "街道/乡镇名称", name = "name", example = "中央大街")
  @Column(name = "name")
  private String name;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "tid")
  @ApiModelProperty(value = "街道/乡镇唯一标识", name = "tid", example = "1001001")
  private Integer tid;
  @ApiModelProperty(value = "区编号", name = "father", example = "1001001")
  @Column(name = "father")
  private String father;
}
