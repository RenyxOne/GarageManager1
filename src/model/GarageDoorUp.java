package model;

public class GarageDoorUp implements Command{
    private GarageDoor door;
    private int type;
    public GarageDoorUp(GarageDoor door){
        this.door = door;
        type = 1;
    }
    @Override
    public void action(){
        door.up();
    }
    @Override
    public int getState(){
        return door.getState();
    }
    @Override
    public int getType(){
        return type;
    }
}
