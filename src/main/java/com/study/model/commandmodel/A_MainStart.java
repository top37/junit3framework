package com.study.model.commandmodel;

import com.study.model.commandmodel.commands.CommandImpl_1;
import com.study.model.commandmodel.commands.CommandImpl_2;
import com.study.model.commandmodel.handlers.HandlerImpl_1;
import com.study.model.commandmodel.handlers.HandlerImpl_2;

public class A_MainStart {
    /**
     * 可以看出作为调用者而言，只需要传递一个实现Command的类，调用call()
     */
    public static void main(String[] args) {
        //可以通过Handler接口松耦合的方式设置执行者
        new Invoker(new CommandImpl_1(new HandlerImpl_1())).call();
        new Invoker(new CommandImpl_1(new HandlerImpl_2())).call();
        //也可以直接注入需要的类作为执行者
        new Invoker(new CommandImpl_2(new OtherHandler())).call();
    }
}
