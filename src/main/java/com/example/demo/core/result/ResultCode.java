package com.example.demo.core.result;

/**
 * 响应码枚举，参考HTTP状态码的语义
 */
public enum ResultCode {
  SUCCESS(1, "SUCCESS"),//成功
  SUCCESS_MESSAGE(1, "SUCCESS"),//成功需要返回数据
  FAULT(0, "账号或密码错误"),
  FAIL(400, "访问失败"),//失败
  UNAUTHORIZED(401, "签名错误"),//未认证（签名错误）
  NOT_FOUND(404, "此接口不存在"),//接口不存在
  INTERNAL_SERVER_ERROR(500, "系统繁忙,请稍后再试"),//服务器内部错误
  INVALID_PARAM(10000, "参数错误"),
  INVALID_TOKEN(30006, "Invalid token"),
  CONNTIMEOYT(408, "请求超时"),
  ;
  private int code;
  private String message;

  ResultCode(int code, String message) {
    this.code = code;
    this.message = message;
  }


  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
