package edu.mum.cs.cs525.labs.skeleton.car;

import edu.mum.cs.cs525.labs.skeleton.car.gears.GearState;

public class Car{
    GearState gearState;

    public void setGearState(GearState gearState){
        this.gearState = gearState;
    }

    public int changeSpeed(int speed){

        gearState.setGear(speed);
    }
}
