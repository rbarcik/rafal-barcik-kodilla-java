package com.kodilla.rps;

public class Computer implements Player {
    private int score;

    public Computer(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public WeaponType getWeapon(int userScore){
        //implementation
        return WeaponType.getWeapon(1);
    }
}
