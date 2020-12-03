package controller;

import model.*;
import view.*;

public class Controller{
    //main
    MyFrame frame;
    MyPanel panel;
    GarageManager gm;
    GarageLight light;
    GarageDoor door;

    //light
    GarageLightOn lightOn;
    GarageLightOff lightOff;

    //door
    GarageDoorUp doorUp;
    GarageDoorDown doorDown;

    public Controller() {
        //main
        panel = new MyPanel();
        panel.setController(this);
        frame = new MyFrame();

        gm = new GarageManager();

        //light
        light = new GarageLight();
        light.addObserver(panel);
        lightOn = new GarageLightOn(light);
        lightOff = new GarageLightOff(light);

        //door
        door = new GarageDoor();
        door.addObserver(panel);
        doorUp = new GarageDoorUp(door);
        doorDown = new GarageDoorDown(door);

        frame.setPanel(panel);
    }

    //commands
    public void setGarageDoorUp(){
        this.gm.setCommand(doorUp);
    }

    public void setGarageDoorDown(){
        this.gm.setCommand(doorDown);
    }

    public void setGarageLightOn(){
        this.gm.setCommand(lightOn);
    }

    public void setGarageLightOff(){
        this.gm.setCommand(lightOff);
    }

    public void action(){
        this.gm.buttonPressedApply();
    }

    public int getState(){
        return this.gm.getState();
    }

    public int getType(){
        return gm.getType();
    }
}
