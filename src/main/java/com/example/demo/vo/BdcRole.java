package com.example.demo.vo;

import javax.persistence.*;

@Table(name = "bdc_role")
public class BdcRole {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  /**
   * 角色名字，职位
   */
  @Column(name = "role_name")
  private String roleName;

  /**
   * 角色代号
   */
  @Column(name = "role_code")
  private Integer roleCode;

  /**
   * @return id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 获取角色名字，职位
   *
   * @return role_name - 角色名字，职位
   */
  public String getRoleName() {
    return roleName;
  }

  /**
   * 设置角色名字，职位
   *
   * @param roleName 角色名字，职位
   */
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  /**
   * 获取角色代号
   *
   * @return role_code - 角色代号
   */
  public Integer getRoleCode() {
    return roleCode;
  }

  /**
   * 设置角色代号
   *
   * @param roleCode 角色代号
   */
  public void setRoleCode(Integer roleCode) {
    this.roleCode = roleCode;
  }
}
