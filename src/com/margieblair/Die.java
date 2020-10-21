package com.margieblair;

public class Die {
    //this is our die class for java
    private int value;
//    private int sides; DND would use more sided dies
    //doesn't need to be dynamic for Yahtzee
    private int sides = 6;

    public Die() {
        value = 1;
    }
    public Die(int sides) {
        value = 1;
        this.sides = sides;
    }
    //in the instance that we're getting a different
    //type of die


}
