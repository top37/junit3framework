package com.study.model.commandmodel.commands;

import com.study.model.commandmodel.Command;
import com.study.model.commandmodel.OtherHandler;

public class CommandImpl_2 implements Command {

    private OtherHandler otherHandler;

    public CommandImpl_2(OtherHandler otherHandler) {
        this.otherHandler = otherHandler;
    }

    @Override
    public void excute() {
        otherHandler.run();
    }
}
