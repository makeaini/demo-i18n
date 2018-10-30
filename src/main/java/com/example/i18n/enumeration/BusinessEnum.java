package com.example.i18n.enumeration;

/**
 * Created by shining on 2018/5/11.
 */
public enum BusinessEnum implements ErrorCodeI{
    ID("id",1001);

    private String key;
    private int code;

    BusinessEnum(String key,int code) {
        this.key = key;
        this.code = code;

    }

    public String getKey() {
        return key;
    }

    public int getCode() {
        return code;
    }

}
