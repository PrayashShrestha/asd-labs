package edu.mum.cs.cs525.labs.skeleton.car.gears;

import edu.mum.cs.cs525.labs.skeleton.car.Lab08;

public class GearOne implements GearState {
    Lab08 lab08;
    String gear = "Gear 1";
    public GearOne(Lab08 lab08){
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
        if (speed == 0) {
            lab08.setState(lab08.getParkedState());
        } else if (speed > 0 && speed < 5) {
            lab08.setState(lab08.getGear1());
        }else{
            lab08.setState(lab08.getGear2());
            lab08.getGearState().changeSpeed(speed);
        }
    }
}