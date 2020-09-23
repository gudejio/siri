package com.qfedu.common;



public class JsonResult {
    private int code;
    private Object info;

    @Override
    public String toString () {
        return "JsonResult{" +
                "code=" + code +
                ", info=" + info +
                '}';
    }

    public JsonResult () {
    }

    public JsonResult (int code, Object info) {
        this.code = code;
        this.info = info;
    }

    public Integer getCode () {
        return code;
    }

    public void setCode (Integer code) {
        this.code = code;
    }

    public Object getInfo () {
        return info;
    }

    public void setInfo (Object info) {
        this.info = info;
    }
}
