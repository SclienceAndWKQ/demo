package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author ： 185
 * @description ： 省份信息
 * @date ： 2021/7/2 15:21
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "china_province")
public class ChinaProvince implements Serializable {

  private List<ChinaCity> cities;
  @ApiModelProperty(value = "省编号", name = "code", example = "1001")
  @Column(name = "code")
  private String code;
  @ApiModelProperty(value = "省名称", name = "name", example = "河南省")
  @Column(name = "name")
  private String name;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "pid")
  @ApiModelProperty(value = "省唯一标识", name = "pid", example = "100100101")
  private Integer pid;
}
