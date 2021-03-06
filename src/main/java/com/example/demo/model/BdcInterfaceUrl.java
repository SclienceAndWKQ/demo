package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author ： 185
 * @description ：接口地址信息记录
 * @date ： 2021/1/25 10:18
 */
@Data
@ApiModel(value = "接口地址信息", description = "接口地址信息记录")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bdc_interface_url")
public class BdcInterfaceUrl {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
  private Integer id;

  @Column(name = "flag", columnDefinition = "是否为正式接口,true:正式接口地址,false:测试接口地址")
  @ApiModelProperty(value = "是否为正式接口,0:正式接口地址,1:测试接口地址", name = "flag", example = "正式接口地址", dataType = "Integer")
  private Integer flag;

  @Column(name = "machine_type", columnDefinition = "机器ID")
  @ApiModelProperty(value = "机器类型", name = "machineType", example = "查档机", dataType = "String")
  private String machineType;

  @Column(name = "name", columnDefinition = "接口名称")
  @ApiModelProperty(value = "接口名称", name = "name", example = "有房无房接口", dataType = "String")
  private String name;

  @Column(name = "url", columnDefinition = "接口地址")
  @ApiModelProperty(value = "接口地址", name = "url", example = "http://192.168.0.192:8888/bdc/getYfwfInfo", dataType = "String")
  private String url;

  @Column(name = "server_id")
  @ApiModelProperty(value = "服务器信息", name = "serverId", example = "1001", dataType = "String")
  private String serverId;

}
