package com.example.i18n.controller;

import com.example.i18n.enumeration.BusinessEnum;
import com.example.i18n.enumeration.ErrorEnum;
import com.example.i18n.enumeration.ParamEnum;
import com.example.i18n.exception.ProParamException;
import com.example.i18n.locale.LocaleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

/**
 * Created by shining on 2018/10/24.
 */
@Controller
public class TestController {
    @RequestMapping("/")
    @ResponseBody
    public String hello(String id) {
        if (StringUtils.isEmpty(id)){
            throw new ProParamException(ParamEnum.ID);
        }
        return "welcome";
    }
}
