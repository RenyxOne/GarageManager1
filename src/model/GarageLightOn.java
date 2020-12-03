package model;

public class GarageLightOn implements Command{
    private GarageLight light;
    public GarageLightOn(GarageLight light){
        this.light = light;
    }

    @Override
    public void action() {
        light.on();
    }
}
