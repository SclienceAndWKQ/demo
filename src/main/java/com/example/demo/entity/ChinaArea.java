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
 * @description ：
 * @date ： 2021/7/2 15:21
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "china_area")
public class ChinaArea implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "aid")
  @ApiModelProperty(value = "区唯一标识", name = "aid", example = "1001001")
  private Integer aid;
  @ApiModelProperty(value = "区编号", name = "code", example = "100100101")
  @Column(name = "code")
  private String code;
  @ApiModelProperty(value = "市编号", name = "father", example = "1001001")
  @Column(name = "father")
  private String father;
  @ApiModelProperty(value = "区名称", name = "name", example = "南门区")
  @Column(name = "name")
  private String name;
  private List<ChinaTownship> townships;
}
