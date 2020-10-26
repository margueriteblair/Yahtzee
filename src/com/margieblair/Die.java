package com.margieblair;

import java.util.Random;
import java.security.SecureRandom;

public class Die {
    private int value;

    private int sides = 6;

    public Die() {
        this.sides = 6;
        value = 1;
    }

    //in the instance we have a different sided die that we want to use
    public Die(int sides) {
        this.sides = sides;
        this.value = value;

    }

    public void roll(Random rand) {
        value = rand.nextInt(sides) + 1;
    }

    public int getValue() {
        return value;
    }


}
