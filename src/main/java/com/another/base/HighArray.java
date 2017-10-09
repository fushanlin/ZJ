package com.another.base;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Zero on 2016/10/19.
 */
public class HighArray {

    private final static int OFFSET = 538309;

    public static String MobileVfCode() {
        long seed = System.currentTimeMillis() + OFFSET;
        SecureRandom secureRandom = null; // 安全随机类
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(seed);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        String codeList = "1234567890"; // 验证码数字取值范围
        String sRand = ""; // 定义一个验证码字符串变量

        for (int i = 0; i < 6; i++) {
            int code = secureRandom.nextInt(codeList.length() - 1); // 随即生成一个0-9之间的整数
            String rand = codeList.substring(code, code + 1);
            sRand += rand; // 将生成的随机数拼成一个六位数验证码
        }
        return sRand; // 返回一个六位随机数验证码

    }

    //随机生成十位数ValidCode码，用于邮件的验证
    public static String generateMailValidCode() {
        long seed = System.currentTimeMillis() + OFFSET;
        SecureRandom secureRandom = null; // 安全随机类
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(seed);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        String codeList = "ABCDEFGHIJKLMNOPQRSTUVWXYZabckefghijklmnopqrstuvwxyz1234567890"; // 验证码数字取值范围
        String sRand = new String(""); // 定义一个验证码字符串变量

        for (int i = 0; i < 10; i++) {
            int code = secureRandom.nextInt(codeList.length() - 1); // 随即生成一个整数
            String rand = codeList.substring(code, code + 1);
            sRand += rand; // 将生成的随机数拼成一个十位数验证码
        }
        return sRand; // 返回一个六位随机数验证码
    }

    //检查是不是符合为合法的中国的手机号码
    public static boolean isMobileNO(String mobiles) {
        if (mobiles == null) {
            return false;
        }
        Pattern p = Pattern.compile("^((13[0-9])|(14[0-9])|(17[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
        Matcher m = p.matcher(mobiles);
        return m.matches();
    }

}
