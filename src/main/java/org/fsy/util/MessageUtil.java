package org.fsy.util;


import org.fsy.exception.AppException;
import org.fsy.service.MessagePlatformServiceImpl;
import org.fsy.service.MessagePlatformServiceImplProxy;

import java.util.Random;

/**
 * Created by fushiyong on 2017/11/2.
 */
public class MessageUtil {

    private  static final String messageplatformurl =  "https://mic.efivestar.com/MessagePlatform/services/MessagePlatformServiceImpl";

    private  static final String MESSAGE_SOURCE = "EEP";

    private  static final String MESSAGE_BUSSNIESSTYPE = "XG00020101";

    /**
     * 获取动态验证随即码
     *
     * @author wanglei
     * @param length
     * @return
     * @since JDK 1.8
     */
    public String getRandomString(int length)
    { //length表示生成字符串的长度
        String base = "0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++)
        {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 利用消息平台发送短信验证码
     *
     * @param mobile
     *           手机号
     * @param message
     *           消息
     * @throws AppException
     * @since JDK 1.8
     */
    public static void sendVerificationCode(String mobile, String message) throws AppException
    {
        message = "{\"content\":\"您的手机验证码：" + 888888 + "，请勿泄露。五星赋能app，给生活加一种可能。\"}";
        String target = "{\"phoneNum\":\"" + mobile + "\"}";
        sendMessage(MESSAGE_SOURCE, MESSAGE_BUSSNIESSTYPE, message, target);
    }

    /**
     * 利用消息平台发送短信验证码
     *
     * @param mobile
     *           手机号
     * @param codesize
     *           验证码位数
     * @throws AppException
     * @since JDK 1.8
     */
    public void sendVerificationCode(String mobile, int codesize) throws AppException
    {
        String message = "{\"content\":\"您的手机验证码：" + getRandomString(codesize) + "，请勿泄露。\"}";
        String target = "{\"phoneNum\":\"" + mobile + "\"}";
        sendMessage(MESSAGE_SOURCE, MESSAGE_BUSSNIESSTYPE, message, target);
    }

    public String sendVerificationCode(String mobile) throws AppException
    {
        String code = getRandomString(6);
        String message = "{\"content\":\"您的手机验证码：" + code + "，请勿泄露。\"}";
        String target = "{\"phoneNum\":\"" + mobile + "\"}";
        sendMessage(MESSAGE_SOURCE, MESSAGE_BUSSNIESSTYPE, message, target);

        return code;
    }

    /**
     *
     * 根据传入的业务类型，选择相应的发送策略和发送媒介，发送传入的消息，并返回发送结果
     *
     * @author shidong
     * @param source
     *           消息来源[必填]
     * @param bussnissType
     *           业务类型[必填]
     * @param message
     *           消息[和微信消息两者必填一个]
     * @param target
     *           目标[必填]
     * @return
     * @since JDK 1.8
     */
    private static String sendMessage(String source, String bussnissType, String message, String target) throws AppException
    {
        MessagePlatformServiceImpl mps = new MessagePlatformServiceImplProxy(messageplatformurl);
        try
        {
            return mps.sendMessage(source, bussnissType, message, target);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new IllegalArgumentException("发送消息异常!!!");
        }

    }

    public static void main(String[] args) {
        for(int i = 0 ;i< 10 ;i ++ ){
            sendVerificationCode("13951635674","hello");
        }

    }
}
