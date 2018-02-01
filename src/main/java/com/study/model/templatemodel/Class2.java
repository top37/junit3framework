package com.study.model.templatemodel;

public class Class2 extends ClassPeopleCount {

    private int manCount;
    private int womanCount;

    public Class2(int manCount, int womanCount) {
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
