package com.example.demo.core.enums;

/**
 * @Description 隆林查档返回中权力性质枚举
 * @Author ChengJiZe
 * @Date 10:19 2019/7/9
 **/
public enum QLXZEnum {
  QLXZ1("100", "国有土地"),
  QLXZ2("101", "划拨"),
  QLXZ3("102", "出让"),
  QLXZ4("103", "作价出资（入股）"),
  QLXZ5("104", "国有土地租赁"),
  QLXZ6("105", "授权经营"),
  QLXZ7("106", "家庭承包"),
  QLXZ8("107", "其它方式承包"),
  QLXZ9("200", "集体土地"),
  QLXZ10("201", "家庭承包"),
  QLXZ11("202", "其它方式承包"),
  QLXZ12("203", "批准拨用"),
  QLXZ13("204", "入股"),
  QLXZ14("205", "联营");

  private String code;
  private String string;

  QLXZEnum(String code, String string) {
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
    for (QLXZEnum qlxzEnum : QLXZEnum.values()) {
      if (qlxzEnum.code.equals(code)) {
        return qlxzEnum.string;
      }
    }
    return "无";
  }
}
