package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ： 185
 * @description ：记录联系方式
 * @date ： 2021/1/29 11:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bdc_contact_msg")
@ApiModel(value = "联系方式记录", description = "记录接口方,客户,销售等人联系方式")
public class BdcContactMsg {
  @Id
  private String id;
  private String name;
  /**
   * 职业类型
   */
  @Column(name = "job_type")
  private String jobType;
  /**
   * 联系途径
   */
  private String channel;
  /**
   * 联系方式
   */
  @ApiModelProperty(value = "联系方式", name = "phone", example = "15836476299", dataType = "String")
  private String phone;
  /**
   * 是否离职
   */
  @ApiModelProperty(value = "是否离职", name = "quit", example = "0:在职,1:离职", dataType = "Integer")
  private Integer quit;
  @Column(name = "area_id")
  @ApiModelProperty(value = "网点id", name = "areaId", example = "10001", dataType = "String")
  private String areaId;
}
