package com.lixiang.behaviormode.Command.composite;

public class ConcreteCommandB implements Command {
    private ReceiverB receiverB;

    public ConcreteCommandB(ReceiverB receiverB) {
        this.receiverB = receiverB;
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
        receiverB.action();
    }
}
