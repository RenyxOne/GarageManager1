package model;

public class GarageLight {
    private int state;
    public GarageLight(){
        state = 0;
    }
    public void on(){
        state = 1;
        System.out.println("State " + state + "\tLight on");
    }
    public void off(){
        state = 0;
        System.out.println("State " + state + "\tLight off");
    }
}
