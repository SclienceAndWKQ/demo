package com.example.demo.core.utils;


import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * @author code
 */
public class StringUtils {

    public static String dataToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            //该步即不会第一位有逗号，也防止最后一位拼接逗号！
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public static String delNull(String str){
        return str==null?"":str;
    }
    /**
     * @param IdCardNO
     * @return String
     * @author
     */
    public static String transIDCard15to18(String IdCardNO) {
        String cardNo = null;
        if (null != IdCardNO && IdCardNO.trim().length() == 15) {
            IdCardNO = IdCardNO.trim();
            StringBuffer sb = new StringBuffer(IdCardNO);
            sb.insert(6, "19");
            sb.append(transCardLastNo(sb.toString()));
            cardNo = sb.toString();
        }
        return cardNo;
    }

    /**
     * 方法用途：15位补全‘19’位后的身份证号码
     *
     * @param newCardId
     * @return String
     * @author
     */
    private static String transCardLastNo(String newCardId) {
        char[] ch = newCardId.toCharArray();
        int m = 0;
        int[] co = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] verCode = new char[]{'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        for (int i = 0; i < newCardId.length(); i++) {
            m += (ch[i] - '0') * co[i];
        }
        int residue = m % 11;
        return String.valueOf(verCode[residue]);
    }

    /**
     * 判断字符串是否为 null 或全为空白字符
     * @param chkStr
     * @return boolean
     * */
    public   static  boolean isSpace(String chkStr){
        if (chkStr == null) {
            return true;
        } else {
            return "".equals(chkStr.trim());
        }
    }
    /**
     * <p>
     * 进行toString操作，如果传入的是null，返回空字符串。
     * </p>
     *
     * <pre>
     * ObjectUtils.toString(null)         = ""
     * ObjectUtils.toString("")           = ""
     * ObjectUtils.toString("bat")        = "bat"
     * ObjectUtils.toString(Boolean.TRUE) = "true"
     * </pre>
     *
     * @param obj
     *            源
     * @return String
     */
    public static String toString(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    /**
     * 判断对象是否为空<br>
     * 1,字符串(null或者"")都返回true<br>
     * 2,数字类型(null或者0)都返回true<br>
     * 3,集合类型(null或者不包含元素都返回true)<br>
     * 4,数组类型不包含元素返回true(包含null元素返回false)<br>
     * 5,其他对象仅null返回true
     *
     * @param obj
     * @return boolean
     */
    public static boolean isEmpty(Object obj) {
        if (obj == null) { return true; }
        if (obj instanceof Number) {
            Number num = (Number) obj;
            if (num.intValue() == 0) {
                return true;
            } else {
                return false;
            }
        } else if (obj instanceof String) {
            String str = (String) obj;
            return "".equals(str);
        } else if (obj instanceof Collection<?>) {
            Collection<?> c = (Collection<?>) obj;
            return c.isEmpty();
        } else if (obj instanceof Map<?, ?>) {
            Map<?, ?> m = (Map<?, ?>) obj;
            return m.isEmpty();
        } else if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            return length == 0;
        } else {
            return false;
        }
    }

    /**
     * 字符编码自定义转换类型
     *
     * @param str string
     * @param fEncode from
     * @param tEncode to
     * @return String
     */
    public static String convertEncode(String str, String fEncode, String tEncode) {
        if (str == null) {
            return null;
        } else {
            try {
                return new String(str.getBytes(fEncode), tEncode);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /**
     *
     * 获取UUID
     *
     * @return String
     */
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    /**
     * 获得一个4位UUID
     *
     * @return String UUID
     */
    public static String getFourUUID() {
        String s = UUID.randomUUID().toString();
        // 去掉“-”符号
        return s.substring(0, 4);
    }

    /**
     * 获得一个15位UUID
     *
     * @return String UUID
     */
    public static String getFifteenUUID() {
        String s = getNoSpUUID().toString();
        // 去掉“-”符号
        return s.substring(0, 15);
    }

    public static String getNoSpUUID() {
        UUID uuid = UUID.randomUUID();
        String uid = uuid.toString();
        uid = uid.replace("-", "");
        return uid;
    }

    /***
     * MD5加码 生成32位md5码
     */
    public static String string2MD5(String inStr) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            byteArray[i] = (byte) charArray[i];
        }
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuilder hexValue = new StringBuilder();
        for (byte md5Byte : md5Bytes) {
            int val = ((int) md5Byte) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
    /**
     * MD5 加密
     *
     * @param signStr string
     * @return String
     */
    public static String getMd5Sign(String signStr) {
        StringBuilder buf = new StringBuilder("");
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(signStr.getBytes());
            byte[] b= md.digest();
            int i;
            for (byte aB : b) {
                i = aB;
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return buf.toString();
    }

    public static String genRandomStr(int size){
        if (size<1|| size>500){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randNum = random.nextInt(62);
            if (randNum<10){
                sb.append(randNum);
            }else if (randNum<36){
                randNum-=10;
                sb.append((char)(randNum+65));
            }else {
                randNum-=36;
                sb.append((char)(randNum+97));
            }
        }
        return sb.toString();
    }
    public static  String replaceLastSymbol(String str,String symbol ){
        int lastIndexOf = str.lastIndexOf(symbol);
        return str.substring(0,lastIndexOf);
    }

    public static void main(String[] args) {
        System.out.println(genRandomStr(100));
    }
}
