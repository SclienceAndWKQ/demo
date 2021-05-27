package com.example.demo.core.enums;

/**
 * @Description 隆林查询接口返回code枚举
 * @Author ChengJiZe
 * @Date 10:19 2019/7/8
 **/
public enum CodeEnum {
  code1("0000", "正确 "),
  code2("0100", "查无信息"),
  code3("0200", "单位验证失败，该原因由于双方约定用户名及密码错误，校验未通过无法反馈"),
  code4("1000", "数据查询失败，可能因网络问题导致超时或其他原因"),
  code5("1010", "用户名密码验证错误"),
  code6("1020", "报文解析失败"),
  code7("9010", "保存失败,请检查报文或者重新请求"),
  code8("9020", "回话已经过期,请重新申请"),
  code9("9030", "该账号今日请求已被限制"),
  code10("9999", "查询服务内部异常,请检查数据或请求方式");
  private String code;
  private String string;

  CodeEnum(String code, String string) {
    this.code = code;
    this.string = string;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public static String hqString(String code) {
    for (CodeEnum codeEnum : CodeEnum.values()) {
      if (codeEnum.code.equals(code)) {
        return codeEnum.string;
      }
    }
    return "无";
  }
}
