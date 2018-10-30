package com.example.i18n.bean;


import com.example.i18n.enumeration.ErrorEnum;
import com.example.i18n.locale.LocaleMessage;

public class ReturnBean implements IEntity {


    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 5761386302316325878L;

    /**
     * returnCode 返回码
     */
    private Integer returnCode = ErrorEnum.SUCCESS.getCode();

    /**
     * ReturnMsg 错误描述
     */
    private String returnMsg = LocaleMessage.getMessage(ErrorEnum.SUCCESS.getKey());

    /**
     * data 返回值
     */
    private Object data;


    private ReturnBean() {

    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public ReturnBean setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
        return this;
    }


    public ReturnBean setData(Object data) {
        this.data = data;
        return this;
    }

    public Object getData() {
        return data;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public ReturnBean setReturnMsg(String ReturnMsg) {
        this.returnMsg = ReturnMsg;
        return this;
    }

    public static ReturnBean returnBeanBuild() {
        ReturnBean bean = new ReturnBean();
        return bean;
    }

    @Override
    public String toString() {
        return "ReturnBean [returnCode=" + returnCode + ", returnMsg="
                + returnMsg + ", data=" + data + "]";
    }

}
