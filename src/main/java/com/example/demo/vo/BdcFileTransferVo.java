package com.example.demo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author ： 185
 * @description ：向服务器上面传输文件方式信息记录
 * @date ： 2022/4/19 11:39
 */
@Data
@ApiModel(value = "向服务器上面传输文件方式信息记录", description = "向服务器上面传输文件方式信息记录")
public class BdcFileTransferVo {
  @ApiModelProperty(value = "连接地址", name = "connectUrl", example = "ftp://192.168.20.28:23", dataType = "String")
  private String connectUrl;
  @ApiModelProperty(value = "连接方式", name = "connectWay", example = "在文件夹地址栏输入连接地址", dataType = "String")
  private String connectWay;
  @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
  private Integer id;
  @ApiModelProperty(value = "连接密码", name = "psw", example = "123456", dataType = "String")
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
