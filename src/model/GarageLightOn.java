package model;

public class GarageLightOn implements Command{
    private GarageLight light;
    private int type;
    public GarageLightOn(GarageLight light){
        this.light = light;
        type = 2;
    }

    @Override
    public void action() {
        light.on();
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
