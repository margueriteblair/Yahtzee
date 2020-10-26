package com.margieblair;

import java.util.List;
import java.util.ArrayList;


public class YahtzeeConsole extends Console{

    static public void welcome() {
        welcome("Yahtzee!");
    }

    static public void displayDice(List<Die> currentDice) {
        System.out.println("--------------\n");
        for (var die : currentDice) {
            System.out.print(die.getValue() + " ");
        }
        System.out.println("\n");
    }

    static public List<Integer> getChoices() {
        System.out.println("Which die do you want to reroll? 1-5 Ex: 1 2 4. Or enter 0 to pass to the next player." );
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        List<Integer> choices = new ArrayList<>();
        for (String choice : inputArray) {
            choices.add(Integer.parseInt(choice) - 1);
        }
        return choices; //returns List

    }
}
