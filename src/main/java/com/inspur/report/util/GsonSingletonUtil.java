package com.inspur.report.util;

import com.google.gson.Gson;

/**
 * @ClassName GsonSingletonUtil
 * @Description 谷歌的gson工具，单态类实现
 * @Author 周秀娟
 * @Date 2018-10-14 19:35
 * @Version 1.0
 **/
public class GsonSingletonUtil {

    private static class SingletonHolder {

        private static Gson instance = new Gson();

    }

    public static Gson getInstance() {
        return SingletonHolder.instance;
    }

}
