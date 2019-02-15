package com.fortrue.demo.exception;

public class MyException extends RuntimeException{
    public MyException(){
        super();
    }
    public MyException(String msg, Throwable t){
        super(msg, t);
    }
    public MyException(String msg){
        super(msg);
    }
}
