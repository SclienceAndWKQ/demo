package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ： 185
 * @description ：
 * @date ： 2022/4/19 11:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "客户提供堡垒机信息记录", description = "客户提供堡垒机信息记录")
@Table(name = "bdc_fortress_machine")
public class BdcFortressMachine {
  @Column(name = "connect_way", columnDefinition = "连接方式")
  @ApiModelProperty(value = "连接方式", name = "connectWay", example = "使用谷歌登录", dataType = "String")
  private String connectWay;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
  private Integer id;
    @Column(name = "login_url", columnDefinition = "堡垒机登录地址")
  @ApiModelProperty(value = "堡垒机登录地址", name = "loginUrl", example = "https://192.168.0.1/admin.php?controller=user_index&action=login", dataType = "String")
  private String loginUrl;
  @Column(name = "psw", columnDefinition = "登录密码")
  @ApiModelProperty(value = "登录密码", name = "psw", example = "123456", dataType = "String")
  private String psw;
  @Column(name = "record_time", columnDefinition = "记录时间")
  @ApiModelProperty(value = "记录时间", name = "recordTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date recordTime;
    @Column(name = "remarks", columnDefinition = "备注信息 记录连接服务器堡垒机相关信息")
  @ApiModelProperty(value = "备注信息", name = "remarks", example = "1", dataType = "String")
  private String remarks;
  @Column(name = "server_id")
  @ApiModelProperty(value = "服务器id", name = "serverId", example = "1001", dataType = "String")
  private String serverId;
  @Column(name = "update_time", columnDefinition = "更新时间")
  @ApiModelProperty(value = "更新时间", name = "updateTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date updateTime;
  @Column(name = "user_name", columnDefinition = "登录账号")
  @ApiModelProperty(value = "登录账号", name = "userName", example = "admin", dataType = "String")
  private String userName;
}
