package model;

public class GarageManager {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonPressedApply(){
        command.action();
    }
}
