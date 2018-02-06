package com.study.model.compositemodel;

public class MyCase implements Case {
    @Override
    public void run() {
        System.out.println(this+" sqCase");
    }
}
