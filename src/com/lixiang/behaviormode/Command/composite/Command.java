package com.lixiang.behaviormode.Command.composite;

public interface Command {
    void addCommand(Command command);
    void removeCommand(Command command);
    Command getCommand(int i);
    void execute();
}
