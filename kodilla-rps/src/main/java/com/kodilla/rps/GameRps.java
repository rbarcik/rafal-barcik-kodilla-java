package com.kodilla.rps;

import java.util.Scanner;

public class GameRps {
    public String inputUserName(){
        System.out.println("Podaj imię");
        String playerName; //w nim zapiszemy swoje imie
        Scanner getPlayerName = new Scanner(System.in);
        playerName = getPlayerName.nextLine();
        System.out.println("Witaj "+playerName);
        return playerName;
    }
    public int inputNumberOfRounds(){
        System.out.println("Podaj liczbę rund");
        Integer numberOfRounds;
        Scanner getNumberOfRounds = new Scanner(System.in);
        numberOfRounds = Integer.valueOf(getNumberOfRounds.nextLine());
        System.out.println("Wybrano " + numberOfRounds + " rund.");
        return numberOfRounds;
    }
}
