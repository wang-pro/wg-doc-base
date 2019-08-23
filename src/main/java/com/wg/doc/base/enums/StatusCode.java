package com.wg.doc.base.enums;

public enum StatusCode {

    SUCCESS(20000, "成功"),
    FAIL(50000, "失败"),
    REQUEST_PARAM_ERROR(50001, "请求参数错误");

    private int code;

    private String message;

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
