package com.edu.nbu.email.exception;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by Administrator on 2017/10/18 0018.
 */
public class AccountEmailException extends RuntimeException {

    public  AccountEmailException(String message){
        super(message);
    }

    public AccountEmailException(String message, Throwable cause){
        super(message,cause);
    }

    public AccountEmailException(Throwable cause){
        super(cause);
    }
}
