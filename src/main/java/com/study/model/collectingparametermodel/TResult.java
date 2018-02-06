package com.study.model.collectingparametermodel;

public class TResult {
    private int fRunTcase = 0;

    public synchronized void start(Tcase tcase){
        fRunTcase++;
        tcase.mt1();
    }

    public int getfRunTcase(){
        return fRunTcase;
    }

}
