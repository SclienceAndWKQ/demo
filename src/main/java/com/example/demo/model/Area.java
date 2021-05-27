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
 * @date ： 2021/5/19 15:36
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "hat_area")
public class Area implements Serializable {
  @ApiModelProperty(value = "市区名称", name = "area", example = "睢县")
  private String area;
  @Column(name = "area_id")
  @ApiModelProperty(value = "市区id", name = "areaId", example = "1001001010101")
  private String areaId;
  @ApiModelProperty(value = "市区所属城市", name = "father", example = "10010010101")
  private String father;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "市区唯一标识", name = "rid", example = "10010010101")
  private Integer rid;


}
