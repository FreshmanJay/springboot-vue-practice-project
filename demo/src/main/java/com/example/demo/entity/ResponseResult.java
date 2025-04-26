package com.example.demo.entity;

public class ResponseResult<T> {
    private T data;
    private String msg;
    private int retCode;

    public ResponseResult(T data, String msg, int retCode) {
        this.data = data;
        this.msg = msg;
        this.retCode = retCode;
    }

    // Getters and Setters
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public int getRetCode() {
        return retCode;
    }
    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }
}