import controller.Controller;
import model.*;

public class Main {

    public static void main(String[] args){
        /*GarageManager gm = new GarageManager();
        GarageLight light = new GarageLight();
        GarageDoor door = new GarageDoor();

        //light
        GarageLightOn lightOn = new GarageLightOn(light);
        GarageLightOff lightOff = new GarageLightOff(light);

        //door
        GarageDoorUp doorUp = new GarageDoorUp(door);
        GarageDoorDown doorDown = new GarageDoorDown(door);

        //light on
        gm.setCommand(lightOn);
        gm.buttonPressedApply();

        //light off
        gm.setCommand(lightOff);
        gm.buttonPressedApply();

        //door up
        gm.setCommand(doorUp);
        gm.buttonPressedApply();

        //door down
        gm.setCommand(doorDown);
        gm.buttonPressedApply();
        */

        new Controller();
    }
}
