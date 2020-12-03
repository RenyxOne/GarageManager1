package model;

public class GarageLightOff implements Command{
    private GarageLight light;
    private int type;
    public GarageLightOff(GarageLight light){
        this.light = light;
        type = 2;
    }

    @Override
    public void action() {
        light.off();
    }
    @Override
    public int getState(){
        return light.getState();
    }
    @Override
    public int getType(){
        return type;
    }
}
