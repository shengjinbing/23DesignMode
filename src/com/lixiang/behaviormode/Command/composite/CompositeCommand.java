package com.lixiang.behaviormode.Command.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    List<Command> list = new ArrayList();

    @Override
    public void addCommand(Command command) {
        list.add(command);
    }

    @Override
    public void removeCommand(Command command) {
        list.remove(command);
    }

    @Override
    public Command getCommand(int i) {
        return list.get(i);
    }

    @Override
    public void execute() {
        for (Command command : list) {
            command.execute();
        }
    }
}
