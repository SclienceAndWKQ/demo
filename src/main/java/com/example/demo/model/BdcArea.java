package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "区域信息", discriminator = "区域信息")
@Table(name = "bdc_area")
public class BdcArea {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "id", name = "id", example = "1")
  private Integer id;

  /**
   * 地区id
   */
  @Column(name = "area_id")
  @ApiModelProperty(value = "区域ID", name = "areaId", example = "1")
  private Integer areaId;

  /**
   * 地区名字
   */
  @Column(name = "area_name")
  @ApiModelProperty(value = "区域名称", name = "areaName", example = "市民中心")
  private String areaName;

  @Column(name = "area_address")
  @ApiModelProperty(value = "区域地址", name = "areaAddress", example = "市民中心")
  private String areaAddress;

  /**
   * 展示机型id拼接
   */
  @Column(name = "type_id")
  @ApiModelProperty(value = "展示机型id拼接", name = "typeId", example = "1,2,3,4,5")
  private String typeId;

  @Column(name = "address_id")
  @ApiModelProperty(value = "网点具体地址", name = "addressId", example = "河南省郑州市")
  private String addressId;


}
