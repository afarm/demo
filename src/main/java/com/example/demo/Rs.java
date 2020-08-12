package com.example.demo;

public class Rs {

    private Integer code;

    private String msg;

    public Rs() {
    }

    public Rs(int i, String msg) {
        code = i;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Rs{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
