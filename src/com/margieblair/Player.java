package com.margieblair;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Player {
    //.add() methods are useful
    private List<Die> dice;

    public Player() {
        dice = new ArrayList<>();
        //resets arraylist to a brand new clean arraylist
        for (int count = 0; count < 5; count++) {
            dice.add(new Die());
        }
    }

    //we want to roll die in the hand

    public void roll(Random rand) {
        for (var die: dice) {
            die.roll(rand);
        }
    }

    public void roll(Random rand, int choice) {
        dice.get(choice).roll(rand);
    }

    public int getDieValue(int pos) {
        return dice.get(pos).getValue();
    }

    public List<Die> getDice() {
        return dice;
    }



}
