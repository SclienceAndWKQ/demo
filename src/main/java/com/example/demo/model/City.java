package com.example.demo.model;

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
 * @date ： 2021/5/19 14:15
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "hat_city")
public class City implements Serializable {
  private List<Area> areas;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cid")
  @ApiModelProperty(value = "市唯一标识", name = "cid", example = "100100101")
  private Integer cid;
  @ApiModelProperty(value = "市名称", name = "city", example = "商丘市")
  @Column(name = "city")
  private String city;
  @Column(name = "cityid")
  @ApiModelProperty(value = "市id", name = "cityId", example = "10010010101")
  private String cityId;
  //所属省份
  @ApiModelProperty(value = "市所属省份", name = "father", example = "河南省")
  private String father;
}
