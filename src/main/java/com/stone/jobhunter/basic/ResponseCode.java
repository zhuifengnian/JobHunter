package com.stone.jobhunter.basic;

/**
 * 用于封装响应码<br/>
 * fan 2018/6/13 9:22
 */
public enum ResponseCode {
    OK(200),            //请求正确
    PARAM_EROOR(201),   //参数错误
    PARAM_NOT_COMPAT(202),   //参数类型不匹配
    NETWORK_ERROR(501);     //网络请求出现错误

    private int code;

    ResponseCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ResponseCode{" +
                "code=" + code +
                '}';
    }
}