package edu.mum.cs.cs525.labs.skeleton.car.gears;

import edu.mum.cs.cs525.labs.skeleton.car.Lab08;

public class GearFour implements GearState {
    Lab08 lab08;
    String gear = "Gear 4";
    public GearFour(Lab08 lab08){
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
        if (speed < 30) {
            lab08.setState(lab08.getGear3());
            lab08.getGearState().changeSpeed(speed);
        }
        if (speed > 30 && speed < 55) {
            lab08.setState(lab08.getGear4());
        }
        if (speed > 55 ) {
            lab08.setState(lab08.getGear5());
            lab08.getGearState().changeSpeed(speed);
        }
    }
}
