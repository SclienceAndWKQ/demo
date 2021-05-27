package com.example.demo.core.enums;

/**
 * @Description 隆林查档返回中规划用途枚举
 * @Author ChengJiZe
 * @Date 9:42 2019/7/9
 **/
public enum GHYTEnum {
  GYYT1("10", "住宅"), GYYT2("11", "成套住宅"), GYYT3("111", "别墅"), GYYT4("112", "高档公寓"), GYYT5("12", "非成套住宅"),
  GYYT6("13", "集体宿舍"), GYYT7("20", "工业、交通、仓储"), GYYT8("21", "工业"), GYYT9("22", "公共设施"), GYYT10("23", "铁路"),
  GYYT11("24", "民航"), GYYT12("25", "航运"), GYYT13("26", "公共运输"), GYYT14("27", "仓储"), GYYT15("30", "商业、金融、信息"),
  GYYT16("31", "商业服务"), GYYT17("32", "经营"), GYYT18("33", "旅游"), GYYT19("34", "金融保险"), GYYT20("35", "电讯信息"),
  GYYT21("40", "教育、医疗、卫生、科研"), GYYT22("41", "教育"), GYYT23("42", "医疗卫生"), GYYT24("43", "科研"), GYYT25("50", "文化、娱乐、体育"),
  GYYT26("51", "文化"), GYYT27("52", "新闻"), GYYT28("53", "娱乐"), GYYT29("54", "园林绿化"), GYYT30("55", "体育"),
  GYYT31("60", "办公"), GYYT32("70", "军事"), GYYT33("80", "其它"), GYYT34("81", "涉外"), GYYT35("82", "宗教"),
  GYYT36("83", "监狱"), GYYT37("84", "物管用房");


  private String code;
  private String string;

  GHYTEnum(String code, String string) {
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
    for (GHYTEnum ghytEnum : GHYTEnum.values()) {
      if (ghytEnum.code.equals(code)) {
        return ghytEnum.string;
      }
    }
    return "无";
  }
}
