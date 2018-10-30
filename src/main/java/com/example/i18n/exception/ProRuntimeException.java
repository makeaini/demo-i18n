package com.example.i18n.exception;

/**
 * Created by shining on 2018/10/24.
 */
public class ProRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -4720455406482839391L;
    /**
     * 错误码
     */
    private Integer errorCode;
    /**
     * 错误信息，可选
     */
    private String errorMsg;


    public ProRuntimeException() {
        super();
    }

    public ProRuntimeException(String message, Throwable cause,
                        boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ProRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProRuntimeException(String message) {
        super(message);
    }

    public ProRuntimeException(Throwable cause) {
        super(cause);
    }


    public String getErrorMsg() {
        return errorMsg;
    }

    protected void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }



    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }


    public ProRuntimeException(Integer errorCode, String errorMsg) {
        super();
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    @Override
    public String toString() {
        return this.getClass().getName()+" [errorCode=" + errorCode + ", errorMsg="
                + errorMsg + "]";
    }
}
