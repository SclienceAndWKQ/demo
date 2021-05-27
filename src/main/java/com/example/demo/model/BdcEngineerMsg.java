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
 * @description ：
 * @date ： 2021/1/29 14:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "机器部署工程师信息", description = "机器部署工程师相关信息记录")
@Table(name = "bdc_engineer_msg")
public class BdcEngineerMsg {

  @Id
  @Column(name = "machine_id")
  private String machineId;
  /**
   * 工程师类别
   * 1:软件交付工程师
   * 2:硬件交付工程师
   * 3:前端开发工程师
   * 4:后台开发工程师
   */
  @Column(name = "type", columnDefinition = "1:软件交付工程师,2:硬件交付工程师,3:前端开发工程师,4:后台开发工程师")
  @ApiModelProperty(value = "工程师类别")
  private Integer type;
  @ApiModelProperty(value = "工程师姓名")
  private String name;
  @Column(name = "flag", columnDefinition = "0:新机部署,1:后期维护")
  private Integer flag;


}
