package com.lixiang.behaviormode.Command.composite;

public class Invoker {
    private Command commandA;
    private Command commandB;
    private Command compositeCommand;

    public Invoker(Command commandA, Command commandB, Command compositeCommand) {
        this.commandA = commandA;
        this.commandB = commandB;
        this.compositeCommand = compositeCommand;
    }


    public void actionA(){
        commandA.execute();
    }

    public void actionB(){
        commandB.execute();
    }

    public void actionComposite(){
        compositeCommand.execute();
    }
}
