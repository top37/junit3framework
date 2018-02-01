package com.study.model.templatemodel;

public abstract class ClassPeopleCount {
    protected abstract int getManCount();
    protected abstract int getWomanCount();
    protected int getAllCount(){
        return getManCount()+getWomanCount();
    }
}
