package com.study.model.collectingparametermodel;

public class Tcase {

    public void mt1(){
        System.out.println(this+" sq666");
    }

    public void run(TResult tresult){
        tresult.start(this);
    }
}
