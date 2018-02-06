package com.study.model.compositemodel;

public class A_MainStart {
    public static void main(String[] args) {
        Case c1 = new MyCase();

        Case c2 = new MyCase();
        Case c3 = new MyCase();
        MyCases lstc = new MyCases();
        lstc.addCase(c2,c3);

        MyCases all = new MyCases();
        all.addCase(c1,lstc);

        all.run();

    }
}
