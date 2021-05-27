package com.example.demo.core.result;

/**
 * @program: hzmoko-background
 * @description: 惠州响应码枚举
 * @author: ZKN
 * @create: 2019-11-01 10:26
 **/
public enum HzResultCode {
  SUCCESS("1", "SUCCESS"),//成功
  FAULT("0", "FAILURE"),
  ;//失败
  private String resultcode;
  private String resultmsg;

  HzResultCode(String resultcode, String resultmsg) {
    this.resultcode = resultcode;
    this.resultmsg = resultmsg;
  }

  public String getResultcode() {
    return resultcode;
  }

  public String getResultmsg() {
    return resultmsg;
  }
}
