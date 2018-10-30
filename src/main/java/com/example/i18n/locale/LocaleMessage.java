package com.example.i18n.locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Created by shining on 2018/10/24.
 */
@Component
public class LocaleMessage {

    private static MessageSource messageSource;
    @Autowired
    public LocaleMessage(MessageSource messageSource) {
        LocaleMessage.messageSource = messageSource;
    }

    /**
     * @param key：对应文本配置的key.
     * @return 对应地区的语言消息字符串
     */
    public static String getMessage(String key) {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(key,new Object[]{},locale);
    }
}