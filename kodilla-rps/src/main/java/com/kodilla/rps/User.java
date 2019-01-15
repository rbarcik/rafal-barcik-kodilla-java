package com.kodilla.rps;

import java.util.Scanner;

public class User implements Player {
    private String name;
    private int score;

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {

        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public WeaponType getWeapon(int userScore){
        String selectedWeapon;
        Scanner getSelectedWeapon = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Wybierz broń \n 1 - Rock \n 2 - Paper \n 3 - Scissors \n 4 - Lizard \n 5 - Spock");

            selectedWeapon = getSelectedWeapon.nextLine();

            if (selectedWeapon.equals("1") || selectedWeapon.equals("2") || selectedWeapon.equals("3")
            || selectedWeapon.equals("4") || selectedWeapon.equals("5")){
                return WeaponType.getWeapon(Integer.parseInt(selectedWeapon)-1) ;

            }
            if (selectedWeapon.toLowerCase().equals("x")){
                System.out.println("Koniec");
                return null;
            }
            } catch(Exception e) {

            }
        }
    }
}
