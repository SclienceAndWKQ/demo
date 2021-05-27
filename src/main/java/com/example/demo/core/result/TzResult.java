package com.example.demo.core.result;

import io.swagger.annotations.ApiModelProperty;

/**
 * @program: hzmoko
 * @description: 泰州响应结果封装
 * @author: ZKN
 * @create: 2020-05-11 16:31
 **/
public class TzResult<T> {
  @ApiModelProperty(value = "响应success", name = "success", example = "true")
  private Boolean success;
  @ApiModelProperty(value = "错误消息", name = "message", example = "查询成功")
  private String message;
  @ApiModelProperty(value = "返回对象", name = "data")
  private T data;


  public TzResult(TzResultCode tzResultCode) {
    this.success = tzResultCode.getSuccess();
    this.message = tzResultCode.getMessage();
  }

  public TzResult(Boolean success, String message, T data) {
    this.success = success;
    this.message = message;
    this.data = data;
  }

  public TzResult(TzResultCode tzResultCode, T data) {
    this.success = tzResultCode.getSuccess();
    this.message = tzResultCode.getMessage();
    this.data = data;
  }

  public TzResult() {

  }

  public Boolean getSuccess() {
    return success;
  }

  public TzResult setSuccess(TzResultCode tzResultCode) {
    this.success = tzResultCode.getSuccess();
    this.message = tzResultCode.getMessage();
    return this;
  }

  public String getMessage() {
    return message;
  }

  public TzResult setMessage(String message) {
    this.message = message;
    return this;
  }

  public T getData() {
    return data;
  }

  public TzResult setData(T data) {
    this.data = data;
    return this;
  }


}
