package com.fortrue.demo.constant;

public enum MyExceptionType {
    OPTIMISTIC_LOCK_NOT_UPDATE("OPTIMISTIC_LOCK_NOT_UPDATE", "乐观锁导致更新未成功！");

    private String errorType;
    private String errorNote;
    MyExceptionType(String errorType, String errorNote){
        this.errorType = errorType;
        this.errorNote = errorNote;
    }
    public String mergeCodeNote(){
        return this.errorType + this.errorNote;
    }
}
