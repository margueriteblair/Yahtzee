package com.margieblair;

import java.util.Random;
import java.security.SecureRandom;

public class Die {
    //this is our die class for java
    private int value;
//    private int sides; DND would use more sided dies
    //doesn't need to be dynamic for Yahtzee
    private int sides = 6;

    public Die() {
        value = 1;
        //by default, if there is no method level variable
        //it will then go to the class level var
    }
//    public Die(int sides) {
//        value = 1;
//        this.sides = sides;
//    }
    //in the instance that we're getting a different
    //type of die

    public void roll(Random rand) {
        value = rand.nextInt(sides) + 1;
        //there'll also be a roll method in the hand class
    }


}
