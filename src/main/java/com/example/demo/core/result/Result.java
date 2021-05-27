package com.example.demo.core.result;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 统一API响应结果封装
 */
@ApiModel(value = "统一响应类", discriminator = "接口返回统一封装")
public class Result<T> {
  @ApiModelProperty(value = "响应code码", name = "code", example = "200")
  private int code;

  @ApiModelProperty(value = "错误消息", name = "message", example = "查询成功")
  private String message;

  @ApiModelProperty(value = "返回对象", name = "data")
  private T data;

  public Result() {
  }

  public Result(ResultCode resultCode) {
    this.code = resultCode.getCode();
    this.message = resultCode.getMessage();
  }

  public Result(int code, String message, T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public Result(ResultCode resultCode, T data) {
    this.code = resultCode.getCode();
    this.message = resultCode.getMessage();
    this.data = data;
  }


  public Result setCode(ResultCode resultCode) {
    this.code = resultCode.getCode();
    this.message = resultCode.getMessage();
    return this;
  }

  public int getCode() {
    return code;
  }

  public Result setCode(int code) {
    this.code = code;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public Result setMessage(String message) {
    this.message = message;
    return this;
  }

  public T getData() {
    return data;
  }

  public Result setData(T data) {
    this.data = data;
    return this;
  }

  @Override
  public String toString() {
    return JSON.toJSONString(this);
  }
}
