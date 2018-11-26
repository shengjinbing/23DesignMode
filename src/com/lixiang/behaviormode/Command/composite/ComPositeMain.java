package com.lixiang.behaviormode.Command.composite;

public class ComPositeMain  {
    public static void main(String[] args) {
        ConcreteCommandA concreteCommandA = new ConcreteCommandA(new ReceiverA());
        ConcreteCommandB concreteCommandB = new ConcreteCommandB(new ReceiverB());

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.addCommand(concreteCommandA);
        compositeCommand.addCommand(concreteCommandB);

        Invoker invoker = new Invoker(concreteCommandA, concreteCommandB, compositeCommand);
        invoker.actionA();
        invoker.actionB();
        invoker.actionComposite();

    }
}
