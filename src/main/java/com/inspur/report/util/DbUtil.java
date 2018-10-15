package com.inspur.report.util;

/**
 * @ClassName DbUtil
 * @Description  数据库相关的工具类
 * @Author 周秀娟
 * @Date 2018-10-14 19:35
 * @Version 1.0
 **/
public class DbUtil {

    /**
     * 属性名转字段名
     *
     * @param property
     * @return
     */
    public static String property2column(String property) {
        StringBuffer column = new StringBuffer(property.length());
        for (int i = 0; i < property.length(); i++) {
            char c = property.charAt(i);
            if (c >= 65 && c <= 90) {
                column.append('_');
            }
            if (c >= 97 && c <= 122) {
                column.append((char) ((int) c - 32));
            } else {
                column.append(c);
            }
        }
        return column.toString();
    }

    /**
     * 字段名转属性名
     *
     * @param column
     * @return
     */
    public static String column2property(String column) {
        StringBuffer property = new StringBuffer(column.length());
        boolean flag = false;
        for (int i = 0; i < column.length(); i++) {
            char c = column.charAt(i);
            if ('_' == c) {
                flag = true;
                continue;
            } else {
                int ascii = (int) c;
                if (c >= 65 && c <= 90) {
                    ascii += 32;
                }
                ascii = flag ? ascii - 32 : ascii;
                property.append((char) ascii);
                flag = false;
            }
        }
        return property.toString();
    }

}
