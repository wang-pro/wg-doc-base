package com.wg.doc.base.exception;


import com.wg.doc.base.result.ResultMessage;

public class LogicException extends RuntimeException{

    private int code;

    public LogicException(ResultMessage resultMessage){
        super(resultMessage.getMsg());
        this.setCode(resultMessage.getCode());
    }

    private void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
