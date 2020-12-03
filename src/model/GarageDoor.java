package model;

public class GarageDoor {
    private int state;
    public GarageDoor(){
        state = 0;
    }
    public void up(){
        state = 1;
        System.out.println("State " + state + "\tGarage Door is open");
    }
    public void down(){
        state = 0;
        System.out.println("State " + state + "\tGarage Door is down");
    }
}
