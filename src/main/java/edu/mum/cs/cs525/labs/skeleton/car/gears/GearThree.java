package edu.mum.cs.cs525.labs.skeleton.car.gears;

import edu.mum.cs.cs525.labs.skeleton.car.Lab08;

public class GearThree implements GearState {
    Lab08 lab08;
    String gear = "Gear 3";
    public GearThree(Lab08 lab08){
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
        if (speed < 10) {
            lab08.setState(lab08.getGear2());
            lab08.getGearState().changeSpeed(speed);
        }
        if (speed > 10 && speed < 30) {
            lab08.setState(lab08.getGear3());
        }
        if (speed > 30) {
            lab08.setState(lab08.getGear4());
            lab08.getGearState().changeSpeed(speed);
        }
    }
}
