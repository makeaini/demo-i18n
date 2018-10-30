package com.example.i18n.enumeration;

/**
 * Created by shining on 2018/5/11.
 */
public enum ParamEnum implements ErrorCodeI{
    ID("id");
    private String key;


    ParamEnum(String key) {
        this.key = key;
    }

    @Override
    public int getCode() {
        return ErrorEnum.PARAM_ERROR.getCode();
    }
    @Override
    public String getKey() {
        return key;
    }


}
