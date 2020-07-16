package com.thilaka.design.patterns.behavioural.command.head.first.simpleundo;

public class RemoteControlWithUndo {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0 ; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control -------\n");
        for(int i = 0; i <onCommands.length;i++){
            stringBuilder.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("     ").append(offCommands[i].getClass()
                    .getName()).append("\n");
        }
        stringBuilder.append("[undo] ").append(undoCommand.getClass().getName())
                .append("\n");

        return stringBuilder.toString();
    }

    private class NoCommand implements Command {
        @Override
        public void execute() {
            //do nothing
        }

        @Override
        public void undo() {
            //do nothing
        }
    }
}
