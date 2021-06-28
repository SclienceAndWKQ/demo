package com.example.demo.model;

import io.swagger.annotations.ApiModel;
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
 * @date ： 2021/5/18 17:35
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@ApiModel(value = "省份信息实体", description = "省份信息实体")
@Table(name = "hat_province")
public class Province implements Serializable {
  private List<City> cities;
  @ApiModelProperty(value = "省份名称", name = "province", example = "河南省")
  private String province;
  @Column(name = "province_id")
  @ApiModelProperty(value = "省份id", name = "provinceId", example = "1001001")
  private String provinceId;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "唯一标识id", name = "sid", example = "1001")
  private Integer sid;


}
