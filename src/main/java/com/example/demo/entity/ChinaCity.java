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
 * @description ： 城市信息
 * @date ： 2021/7/2 15:21
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "china_city")
public class ChinaCity implements Serializable {

  private List<ChinaArea> areas;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cid")
  @ApiModelProperty(value = "市唯一标识", name = "cid", example = "1001001")
  private Integer cid;
  @ApiModelProperty(value = "市编号", name = "code", example = "1001001")
  @Column(name = "code")
  private String code;
  @ApiModelProperty(value = "省编号", name = "father", example = "1001")
  @Column(name = "father")
  private String father;
  @ApiModelProperty(value = "市名称", name = "name", example = "商丘市")
  @Column(name = "name")
  private String name;
}
