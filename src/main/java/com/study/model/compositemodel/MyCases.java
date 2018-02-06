package com.study.model.compositemodel;

import java.util.Arrays;
import java.util.Vector;

public class MyCases implements Case {

    private Vector<Case> lstCase = new Vector<>();

    public void addCase(Case... cs){
        lstCase.addAll(Arrays.asList(cs));
    }

    public Vector<Case> getAll()
    {
        return this.lstCase;
    }

    @Override
    public void run() {
        for(Case c : lstCase){
            c.run();
        }
    }
}
