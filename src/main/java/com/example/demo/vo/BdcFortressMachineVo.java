package com.example.demo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author ： 185
 * @description ： 堡垒机
 * @date ： 2022/4/19 11:39
 */
@Data
@ApiModel(value = "客户提供堡垒机信息记录", description = "客户提供堡垒机信息记录")
public class BdcFortressMachineVo {
  @ApiModelProperty(value = "连接方式", name = "connectWay", example = "使用谷歌登录", dataType = "String")
  private String connectWay;
  @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
  private Integer id;
  @ApiModelProperty(value = "堡垒机登录地址", name = "loginUrl", example = "https://192.168.0.1/admin.php?controller=user_index&action=login", dataType = "String")
  private String loginUrl;
  @ApiModelProperty(value = "登录密码", name = "psw", example = "123456", dataType = "String")
  private String psw;
  @ApiModelProperty(value = "记录时间", name = "recordTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date recordTime;
  @ApiModelProperty(value = "备注信息", name = "remarks", example = "1", dataType = "String")
  private String remarks;
  @ApiModelProperty(value = "服务器id", name = "serverId", example = "1001", dataType = "String")
  private String serverId;
  @ApiModelProperty(value = "更新时间", name = "updateTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date updateTime;
  @ApiModelProperty(value = "登录账号", name = "userName", example = "admin", dataType = "String")
  private String userName;
}
