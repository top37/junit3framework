package com.study.model.commandmodel.commands;

import com.study.model.commandmodel.Command;
import com.study.model.commandmodel.Handler;

public class CommandImpl_1 implements Command {

    private Handler handler;

    public CommandImpl_1(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void excute() {
        handler.action();
    }
}
