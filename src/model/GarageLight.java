package model;

import java.util.Observable;

public class GarageLight extends Observable {
    private int state;
    public GarageLight(){
        state = 0;
    }
    public void on(){
        state = 1;
        System.out.println("State " + state + "\tLight on");
        setChanged();
        notifyObservers();
    }
    public void off(){
        state = 0;
        System.out.println("State " + state + "\tLight off");
        setChanged();
        notifyObservers();
    }

    public int getState(){
        return state;
    }
}
