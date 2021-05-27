package com.example.demo.core.enums;

/**
 * @Description 隆林查档返回中房屋性质枚举
 * @Author ChengJiZe
 * @Date 10:16 2019/7/9
 **/
public enum FWXZEnum {
  FWXZ1("0", "市场化商品房"),
  FWXZ2("1", "动迁房"),
  FWXZ3("2", "配套商品房"),
  FWXZ4("3", "公共租赁住房"),
  FWXZ5("4", "廉租住房"),
  FWXZ6("5", "限价普通商品住房"),
  FWXZ7("6", "经济适用住房"),
  FWXZ8("7", "定销商品房"),
  FWXZ9("8", "集资建房"),
  FWXZ10("9", "福利房"),
  FWXZ11("99", "其它");

  private String code;
  private String string;

  FWXZEnum(String code, String string) {
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
    for (FWXZEnum fwxzEnum : FWXZEnum.values()) {
      if (fwxzEnum.code.equals(code)) {
        return fwxzEnum.string;
      }
    }
    return "无";
  }
}
