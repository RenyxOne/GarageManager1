package model;

public class GarageDoorDown implements Command{
    private GarageDoor door;
    public GarageDoorDown(GarageDoor door){
        this.door = door;
    }
    @Override
    public void action(){
        door.down();
    }
}

