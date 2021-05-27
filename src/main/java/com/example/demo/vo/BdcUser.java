package com.example.demo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@ApiModel(value = "用户信息", description = "用户信息")
@Table(name = "bdc_user")
@Data
public class BdcUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "主键id", name = "id", example = "122")
  private Integer id;

  /**
   * 用户账号
   */
  @ApiModelProperty(value = "用户账户", name = "account", required = true)
  private String account;

  /**
   * 用户真实姓名
   */
  @ApiModelProperty(value = "真实姓名", name = "name")
  private String name;

  /**
   * 密码
   */
  @ApiModelProperty(value = "密码", name = "password")
  private String password;

  /**
   * 手机
   */
  @ApiModelProperty(value = "手机", name = "phone")
  private String phone;

  /**
   * 所属区域
   */
  @ApiModelProperty(value = "区域ID", name = "areaId")
  @Column(name = "area_id")
  private Integer areaId;

  /**
   * 视频通话状态，//0：在线;1:离线;2:繁忙
   */
  @ApiModelProperty(value = "视频通话状态", name = "state")
  private Integer state;

  /**
   * 账户创建时间
   */
  @ApiModelProperty(value = "账户创建时间", name = "createTime")
  @Column(name = "create_time")
  private Date createTime;

  /**
   * 最后登录时间
   */
  @ApiModelProperty(value = "最后登录时间", name = "lastLoginTime")
  @Column(name = "last_login_time")
  private Date lastLoginTime;

  /**
   * 账户信息更新时间
   */
  @ApiModelProperty(value = "账户信息更新时间", name = "updateTime")
  @Column(name = "update_time")
  private Date updateTime;

  /**
   * 密码或职位输错次数，默认0
   */
  @ApiModelProperty(value = "密码或职位输错次数", name = "wrongTimes")
  @Column(name = "wrong_times")
  private Integer wrongTimes;

  /**
   * 锁定账户，默认 0正常，1 被锁定
   */
  @ApiModelProperty(value = "锁定账户", name = "isKey")
  @Column(name = "is_key")
  private Integer isKey;

  /**
   * 是否被删除，默认 0 正常， 1 删除
   */
  @ApiModelProperty(value = "是否被删除", name = "isDel")
  @Column(name = "is_del")
  private Integer isDel;


}
