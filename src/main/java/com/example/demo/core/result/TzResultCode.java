package com.example.demo.core.result;

/**
 * @program: hzmoko
 * @description: 泰州响应码枚举
 * @author: ZKN
 * @create: 2020-05-11 16:34
 **/
public enum TzResultCode {
  SUCCESS(true, "SUCCESS"),//成功
  FAULT(false, "FAILURE"),
  ;//失败
  private Boolean success;
  private String message;

  TzResultCode(Boolean success, String message) {
    this.success = success;
    this.message = message;
  }

  public Boolean getSuccess() {
    return success;
  }

  public String getMessage() {
    return message;
  }
}
