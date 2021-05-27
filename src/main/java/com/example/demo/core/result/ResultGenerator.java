package com.example.demo.core.result;


/**
 * 响应结果生成工具
 */
public class ResultGenerator {
  private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

  public static TzResult genTzSuccessResult() {
    return new TzResult()
        .setSuccess(TzResultCode.SUCCESS)
        .setMessage(DEFAULT_SUCCESS_MESSAGE);
  }

  public static TzResult genTzSuccessResult(Object data) {
    return new TzResult()
        .setSuccess(TzResultCode.SUCCESS)
        .setMessage(DEFAULT_SUCCESS_MESSAGE)
        .setData(data);
  }

  public static TzResult genTzFailResult(String message) {
    return new TzResult()
        .setSuccess(TzResultCode.FAULT)
        .setMessage(message);
  }

  public static HzResult genHzSuccessResult() {
    return new HzResult()
        .setResultcode(HzResultCode.SUCCESS)
        .setResultmsg(DEFAULT_SUCCESS_MESSAGE);
  }

  public static HzResult genHzSuccessResult(Object result) {
    return new HzResult()
        .setResultcode(HzResultCode.SUCCESS)
        .setResultmsg(DEFAULT_SUCCESS_MESSAGE)
        .setResult(result);
  }

  public static HzResult genHzFailResult(String message) {
    return new HzResult()
        .setResultcode(HzResultCode.FAULT)
        .setResultmsg(message);
  }

  public static Result genSuccessResult() {
    return new Result()
        .setCode(ResultCode.SUCCESS)
        .setMessage(DEFAULT_SUCCESS_MESSAGE);
  }

  public static Result genSuccessMessage(String message) {
    return new Result()
        .setCode(ResultCode.SUCCESS)
        .setMessage(message);
  }

  public static Result genSuccessResult(Object data) {
    return new Result()
        .setCode(ResultCode.SUCCESS)
        .setMessage(DEFAULT_SUCCESS_MESSAGE)
        .setData(data);
  }

  public static Result genSuccessResult(Object data, String message) {
    return new Result()
        .setCode(ResultCode.SUCCESS_MESSAGE)
        .setMessage(message)
        .setData(data);
  }

  public static Result genFailResult(String message) {
    return new Result()
        .setCode(ResultCode.FAIL)
        .setMessage(message);
  }


  public static Result genTimeOutResult(String message) {
    return new Result()
        .setCode(ResultCode.CONNTIMEOYT)
        .setMessage(message);
  }
}
