package com.margieblair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScoreBoard {
    public Map<Integer, int[]> onlyOnes = new HashMap<>();
    private int upperScore = 0;

    public void setHashMap() {
        onlyOnes.put(11, new int[] {1, 1, 1, 5, 5});
        System.out.println(onlyOnes);
    }

    public int upperSectionScore(int[] finalDie) {
        for (var die : finalDie) {
            upperScore += die;
        }
        return upperScore;
    }

    public int threeOfAKind(int[] finalDie) {
        return upperScore;
    }

    public int fourOfAKind(int[] finalDie) {
        return upperScore;
    }

    public int fullHouse(int[] finalDie) {
        for (var die : finalDie) {
            if (die)
        }
    }



}
