package model;

import java.util.Observable;

public class GarageDoor extends Observable {
    private int state;
    public GarageDoor(){
        state = 0;
    }
    public void up(){
        state = 1;
        System.out.println("State " + state + "\tGarage Door is open");
        setChanged();
        notifyObservers();
    }
    public void down(){
        state = 0;
        System.out.println("State " + state + "\tGarage Door is down");
        setChanged();
        notifyObservers();
    }

    public int getState() {
        return state;
    }
}
