package com.mahdi20.behavioral.strategy;

public class Mellat implements Getway {

    protected String info;

    @Override
    public void setInfo(String info) {

        this.info = info;

    }

    @Override
    public String pay() {

        return info;

    }
}
