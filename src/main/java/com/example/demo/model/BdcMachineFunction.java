package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "机器具备的功能", description = "机器具备的功能")
@Table(name = "bdc_machine_function")
public class BdcMachineFunction {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  /**
   * 机器ID
   */
  @Column(name = "machine_id")
  private String machineId;

  /**
   * 功能编号
   */
  private String code;

  /**
   * 区域ID
   */
  @Column(name = "area_id")
  private String areaId;

  /**
   * 功能描述
   */
  private String details;

  /**
   * 创建时间
   */
  @Column(name = "create_time")
  private String createTime;

}
