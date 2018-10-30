package com.example.i18n.exception;

import com.example.i18n.enumeration.ErrorCodeI;
import com.example.i18n.enumeration.ErrorEnum;
import com.example.i18n.locale.LocaleMessage;

/**
 * @author shining
 * @category 参数异常类
 * @date 2015-12-28
 */
public class ProParamException extends ProRuntimeException {


    private static final long serialVersionUID = -2634813585698684406L;

    public ProParamException() {
        super();
        super.setErrorCode(ErrorEnum.PARAM_ERROR.getCode());
        super.setErrorMsg(LocaleMessage.getMessage(ErrorEnum.PARAM_ERROR.getKey()));
    }

    public ProParamException(String errorMsg) {
        super();
        super.setErrorCode(ErrorEnum.PARAM_ERROR.getCode());
        super.setErrorMsg(errorMsg);
    }

    public ProParamException(ErrorCodeI errorCodeI) {
        super();
        super.setErrorCode(errorCodeI.getCode());
        super.setErrorMsg(LocaleMessage.getMessage(errorCodeI.getKey()));
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

}
