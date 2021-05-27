package com.example.demo.core.result;

/**
 * @program: hzmoko-background
 * @description: 惠州响应结果封装
 * @author: ZKN
 * @create: 2019-11-01 10:16
 **/
public class HzResult {
  private String resultcode;
  private String resultmsg;
  private Object result;


  public HzResult(HzResultCode hzResultCode) {
    this.resultcode = hzResultCode.getResultcode();
    this.resultmsg = hzResultCode.getResultmsg();
  }

  public HzResult(String resultcode, String resultmsg, Object result) {
    this.resultcode = resultcode;
    this.resultmsg = resultmsg;
    this.result = result;
  }

  public HzResult(HzResultCode hzResultCode, Object result) {
    this.resultcode = hzResultCode.getResultcode();
    this.resultmsg = hzResultCode.getResultmsg();
    this.result = result;
  }

  public HzResult() {

  }

  public String getResultcode() {
    return resultcode;
  }

  public HzResult setResultcode(HzResultCode hzResultCode) {
    this.resultcode = hzResultCode.getResultcode();
    this.resultmsg = hzResultCode.getResultmsg();
    return this;
  }

  public String getResultmsg() {
    return resultmsg;
  }

  public HzResult setResultmsg(String resultmsg) {
    this.resultmsg = resultmsg;
    return this;
  }

  public Object getResult() {
    return result;
  }

  public HzResult setResult(Object result) {
    this.result = result;
    return this;
  }
}
