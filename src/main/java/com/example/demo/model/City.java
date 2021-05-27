package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

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
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "市唯一标识", name = "cid", example = "100100101")
  private Integer cid;
  @ApiModelProperty(value = "市名称", name = "city", example = "商丘市")
  private String city;
  @Column(name = "city_id")
  @ApiModelProperty(value = "市id", name = "cityId", example = "10010010101")
  private String cityId;
  //所属省份
  @ApiModelProperty(value = "市所属省份", name = "father", example = "河南省")
  private String father;


}
