package com.example.i18n.exception;

import com.example.i18n.bean.ReturnBean;
import com.example.i18n.enumeration.ErrorEnum;
import com.example.i18n.locale.LocaleMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shining on 2017-11-23.
 *
 * @author shining
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<ReturnBean> exceptionHandler(Exception e) {
        ReturnBean returnBean = ReturnBean.returnBeanBuild();
        //记录日志
        ResponseEntity responseEntity = null;
        if (e instanceof ProRuntimeException) {
            ProRuntimeException exception = (ProRuntimeException) e;
            LOGGER.info("参数错误---> code码:{},message:{}",exception.getErrorCode().toString(), exception.getErrorMsg());
            returnBean.setReturnCode(exception.getErrorCode());
            returnBean.setReturnMsg(exception.getErrorMsg());
            responseEntity = new ResponseEntity(returnBean, HttpStatus.OK);
            return responseEntity;
        }
        if (e instanceof ProException) {
            ProException exception = (ProException) e;
            LOGGER.info("业务异常---> code码:{},message:{}",exception.getErrorCode().toString(), exception.getErrorMsg());
            returnBean.setReturnCode(exception.getErrorCode());
            returnBean.setReturnMsg(exception.getErrorMsg());
            responseEntity = new ResponseEntity(returnBean, HttpStatus.OK);
            return responseEntity;
        }
        LOGGER.error(e.getMessage(), e);
        returnBean.setReturnCode(ErrorEnum.ERROR.getCode()).setReturnMsg(LocaleMessage.getMessage(ErrorEnum.ERROR.getKey()));
        responseEntity = new ResponseEntity(returnBean, HttpStatus.INTERNAL_SERVER_ERROR);
        return responseEntity;
    }
}
