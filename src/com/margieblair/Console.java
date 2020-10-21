package com.margieblair;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    static public void welcome(String game) {
        System.out.println("Welcome to " + game);
    }

    static public void log(String output) {
        System.out.println(output);
    }
    static public void log(int output) {
        System.out.println(output);
    }


}
