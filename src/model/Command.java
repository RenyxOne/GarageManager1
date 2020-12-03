package model;

public interface Command {
    public void action();
    public int getState();
    public int getType();
}
