package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @author ： 185
 * @description ：
 * @date ： 2021/1/29 10:59
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@ApiModel(value = "网点所在省市区", description = "记录网点具体地址")
@Table(name = "bdc_address")
public class BdcAddress {
  @Id
  @Column(name = "id")
  @ApiModelProperty(value = "id", name = "id", example = "0001", dataType = "String")
  private String id;
  @ApiModelProperty(value = "省份", name = "province", example = "河南省", dataType = "String")
  private String province;
  @ApiModelProperty(value = "城市", name = "city", example = "郑州市", dataType = "String")
  private String city;
  @ApiModelProperty(value = "市区或县城", name = "country", example = "余杭区或桐庐县", dataType = "String")
  private String country;
  @ApiModelProperty(value = "乡镇", name = "town", example = "白坭镇", dataType = "String")
  private String town;
  @Column(name = "area_id")
  @ApiModelProperty(value = "网点id", name = "areaId", example = "郑州市不动产登记中心", dataType = "String")
  private String areaId;
  private List<BdcArea> areas;
}
