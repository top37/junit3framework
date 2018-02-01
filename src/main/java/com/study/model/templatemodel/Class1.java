package com.study.model.templatemodel;

public class Class1 extends ClassPeopleCount {

    private int manCount;
    private int womanCount;

    public Class1(int manCount, int womanCount) {
        this.manCount = manCount;
        this.womanCount = womanCount;
    }

    @Override
    protected int getManCount() {
        return manCount;
    }

    @Override
    protected int getWomanCount() {
        return womanCount;
    }
}
