package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author ： 185
 * @description ： 客户提供服务器信息记录
 * @date ： 2021/8/12 10:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "客户提供服务器信息记录", description = "客户提供服务器信息记录")
@Table(name = "bdc_server")
public class BdcServer implements Serializable {
  @Column(name = "area_id", columnDefinition = "网点ID")
  @ApiModelProperty(value = "网点ID", name = "areaId", example = "1001001", dataType = "String")
  private Integer areaId;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
  private Integer id;
  @Column(name = "is_local_machine_deploy", columnDefinition = "是否本机部署 0:是  1:否")
  @ApiModelProperty(value = "是否本机部署", name = "isLocalMachineDeploy", example = "1", dataType = "String")
  private String isLocalMachineDeploy;
  @Column(name = "name", columnDefinition = "服务器命名")
  @ApiModelProperty(value = "服务器命名", name = "name", example = "抚州查档机服务器", dataType = "String")
  private String name;
  @Column(name = "psw", columnDefinition = "服务器连接密码")
  @ApiModelProperty(value = "服务器连接密码", name = "psw", example = "bdc@123", dataType = "String")
  private String psw;
  @Column(name = "record_time", columnDefinition = "记录时间")
  @ApiModelProperty(value = "记录时间", name = "recordTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date recordTime;
  @Column(name = "remarks", columnDefinition = "备注信息 记录连接服务器堡垒机相关信息")
  @ApiModelProperty(value = "备注信息", name = "remarks", example = "1", dataType = "String")
  private String remarks;
  @Column(name = "server_ip", columnDefinition = "服务器ip")
  @ApiModelProperty(value = "服务器ip", name = "serverIp", example = "10.9.131.32", dataType = "String")
  private String serverIp;
  @Column(name = "update_time", columnDefinition = "更新时间")
  @ApiModelProperty(value = "更新时间", name = "updateTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date updateTime;
  @Column(name = "username", columnDefinition = "服务器连接账号")
  @ApiModelProperty(value = "服务器连接账号", name = "userName", example = "bdc@123", dataType = "String")
  private String userName;

}
