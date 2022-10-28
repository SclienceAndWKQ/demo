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
 * @description ：向服务器上面传输文件方式信息记录
 * @date ： 2022/4/19 11:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "向服务器上面传输文件方式信息记录", description = "向服务器上面传输文件方式信息记录")
@Table(name = "bdc_file_transfer")
public class BdcFileTransfer {
  @Column(name = "connect_url", columnDefinition = "连接地址")
  @ApiModelProperty(value = "连接地址", name = "connectUrl", example = "ftp://192.168.20.28:23", dataType = "String")
  private String connectUrl;
  @Column(name = "connect_way", columnDefinition = "连接方式")
  @ApiModelProperty(value = "连接方式", name = "connectWay", example = "在文件夹地址栏输入连接地址", dataType = "String")
  private String connectWay;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
  private Integer id;
  @Column(name = "psw", columnDefinition = "连接密码")
  @ApiModelProperty(value = "连接密码", name = "psw", example = "123456", dataType = "String")
  private String psw;
  @Column(name = "record_time", columnDefinition = "记录时间")
  @ApiModelProperty(value = "记录时间", name = "recordTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date recordTime;
  @Column(name = "remarks", columnDefinition = "备注信息 记录向服务器传输文件相关信息")
  @ApiModelProperty(value = "备注信息", name = "remarks", example = "1", dataType = "String")
  private String remarks;
  @Column(name = "server_ip")
    @ApiModelProperty(value = "服务器ip", name = "serverIp", example = "1001", dataType = "String")
  private String serverIp;
  @Column(name = "update_time", columnDefinition = "更新时间")
  @ApiModelProperty(value = "更新时间", name = "updateTime", example = "2021-08-12 21:02:26", dataType = "Date")
  private Date updateTime;
  @Column(name = "user_name", columnDefinition = "登录账号")
  @ApiModelProperty(value = "登录账号", name = "userName", example = "admin", dataType = "String")
  private String userName;
}
