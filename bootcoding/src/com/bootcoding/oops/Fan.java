package com.bootcoding.oops;

public class Fan {
    final int MAX_SPEED=5;
    final int MINIMUM_SPEED=1;
    int speed;

    public int regulator(int newspeed) {
        if (newspeed > MAX_SPEED) {
            speed = MAX_SPEED;
        }else if (newspeed<MINIMUM_SPEED){
            speed = MINIMUM_SPEED;
        }

        else {
            speed = newspeed;
        }

        return speed;
    }
}
