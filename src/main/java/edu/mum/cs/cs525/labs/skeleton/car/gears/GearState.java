package edu.mum.cs.cs525.labs.skeleton.car.gears;

import edu.mum.cs.cs525.labs.skeleton.car.Lab08;

public interface GearState {
    public Lab08 getLab08();
    public String getShift();
    public void changeSpeed(int speed);
}

