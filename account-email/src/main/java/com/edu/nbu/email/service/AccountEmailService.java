package com.edu.nbu.email.service;

/**
 * Created by Administrator on 2017/10/18 0018.
 */
public interface AccountEmailService {
    public void sendMail(String to,String subject,String htmlText);
}
