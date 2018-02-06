package com.study.model.collectingparametermodel;

public class A_MainStart {
    public static void main(String[] args) {
        TResult tr = new TResult();
        Tcase tc1 = new Tcase();
        Tcase tc2 = new Tcase();
        tc1.run(tr);tc2.run(tr);tc2.run(tr);
        System.out.println(tr.getfRunTcase());
    }
}
