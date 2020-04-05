package com.zeus.plate.utils;

import java.util.Random;

/**
 * @author smile
 * @date 2020/4/5 0005 下午 1:40
 * @desc 获取随机字符串，避免图片资源重复,仅供娱乐
 */
public class StringUtils {

    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
}
