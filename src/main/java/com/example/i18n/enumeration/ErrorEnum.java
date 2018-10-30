package com.example.i18n.enumeration;

/**
 * Created by shining on 2018/5/11.
 */
public enum ErrorEnum implements ErrorCodeI{
    SUCCESS("success",200),
    PARAM_ERROR("param",400),
    ERROR("error",500);

    private String key;
    private int code;

    ErrorEnum(String key,int code) {
        this.key = key;
        this.code = code;
    }

    public String getKey() {
        return key;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static ErrorEnum stateOf(String key){
        for (ErrorEnum state :values()){
            if(state.getKey().equals(key)){
                return state;
            }
        }
        return null;
    }

}
