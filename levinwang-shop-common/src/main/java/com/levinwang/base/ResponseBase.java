package com.levinwang.base;

public class ResponseBase {
    private Integer rtnCode;
    private String rtnMsg;
    private Object data;

    public ResponseBase() {
    }

    public Integer getRtnCode() {
        return rtnCode;
    }

    public String getRtnMsg() {
        return rtnMsg;
    }

    public Object getData() {
        return data;
    }

    public void setRtnCode(Integer rtnCode) {
        this.rtnCode = rtnCode;
    }

    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseBase(Integer rtnCode, String rtnMsg, Object data) {
        this.rtnCode = rtnCode;
        this.rtnMsg = rtnMsg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseBase{" +
                "rtnCode=" + rtnCode +
                ", rtnMsg='" + rtnMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
