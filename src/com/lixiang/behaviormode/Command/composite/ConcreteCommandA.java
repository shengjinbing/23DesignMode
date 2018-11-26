package com.lixiang.behaviormode.Command.composite;

public class ConcreteCommandA implements Command {
    private ReceiverA receiverA;

    public ConcreteCommandA(ReceiverA receiverA) {
        this.receiverA = receiverA;
    }

    @Override
    public void addCommand(Command command) {

    }

    @Override
    public void removeCommand(Command command) {

    }

    @Override
    public Command getCommand(int i) {
        return null;
    }

    @Override
    public void execute() {
       receiverA.action();
    }
}
