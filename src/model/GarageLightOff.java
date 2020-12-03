package model;

public class GarageLightOff implements Command{
    private GarageLight light;
    public GarageLightOff(GarageLight light){
        this.light = light;
    }

    @Override
    public void action() {
        light.off();
    }
}
