package com.mahdi20.structural.bridge.example2;///


/// The ConcreteImplementor class
public class WebAPIEmailSender implements IEmailSender {

    @Override
    public void SendEmail(String subject, String body) {
        System.out.println("WebAPIEmailSender");
    }

}