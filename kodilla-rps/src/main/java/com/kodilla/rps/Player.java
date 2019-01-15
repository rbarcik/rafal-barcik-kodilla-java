package com.kodilla.rps;

public interface Player {
    //WeaponType getWeapon();
    int getScore();

    WeaponType getWeapon(int userScore);
}
