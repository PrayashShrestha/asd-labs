package edu.mum.cs.cs525.labs.skeleton.car.gears;

import edu.mum.cs.cs525.labs.skeleton.car.Lab08;

public class GearTwo implements GearState {
    Lab08 lab08;
    String gear = "Gear 2";
    public GearTwo(Lab08 lab08){
        this.lab08 = lab08;
    }
    public Lab08 getLab08() {
        return lab08;
    }
    @Override
    public String getShift() {
        return gear;
    }

    @Override
    public void changeSpeed(int speed) {
        if (speed < 5) {
            lab08.setState(lab08.getGear1());
            lab08.getGearState().changeSpeed(speed);
        }
        if (speed > 5 && speed < 10) {
            lab08.setState(lab08.getGear2());
        }
        if (speed > 10) {
            lab08.setState(lab08.getGear3());
            lab08.getGearState().changeSpeed(speed);
        }
    }
}