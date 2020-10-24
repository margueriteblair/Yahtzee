package com.margieblair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScoreBoard {
    public Map<Integer, int[]> onlyOnes = new HashMap<>();

    public void setHashMap() {
        onlyOnes.put(11, new int[] {1, 1, 1, 5, 5});
        System.out.println(onlyOnes);
    }


}
