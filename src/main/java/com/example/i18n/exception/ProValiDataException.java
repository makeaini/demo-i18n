package com.example.i18n.exception;


import com.example.i18n.enumeration.ErrorCodeI;
import com.example.i18n.enumeration.ErrorEnum;
import com.example.i18n.locale.LocaleMessage;

/**
 * @author shining
 * @date 2015-12-28
 * @category 数据异常类
 */
public class ProValiDataException extends ProException {

    private static final long serialVersionUID = -7368646284079457427L;

    public ProValiDataException(Integer errorCode) {
        super();
        super.setErrorCode(errorCode);
        super.setErrorMsg(LocaleMessage.getMessage(ErrorEnum.ERROR.getKey()));
    }

    public ProValiDataException(Integer errorCode,String errorMsg) {
        super();
        super.setErrorCode(errorCode);
        super.setErrorMsg(errorMsg);
    }

    public ProValiDataException(ErrorCodeI errorCodeI) {
        super();
        super.setErrorCode(errorCodeI.getCode());
        super.setErrorMsg(LocaleMessage.getMessage(errorCodeI.getKey()));
    }

    public ProValiDataException() {
        this.setErrorCode(ErrorEnum.ERROR.getCode());
        this.setErrorMsg(LocaleMessage.getMessage(ErrorEnum.ERROR.getKey()));
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }


}
