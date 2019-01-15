package com.kodilla.rps;

import java.util.Arrays;
import java.util.List;

public enum WeaponType {
    ROCK,
    PAPER,
    SCISSORS,
    LIZARD,
    SPOCK;
    private WeaponType[] winWith;

    static {
        ROCK.winWith = new WeaponType[] {SCISSORS, LIZARD};
        PAPER.winWith = new WeaponType[] {ROCK, SPOCK};
        SCISSORS.winWith = new WeaponType[] {PAPER, LIZARD};
        LIZARD.winWith = new WeaponType[] {PAPER, SPOCK};
        SPOCK.winWith = new WeaponType[] {SCISSORS, ROCK};
    }

    public List<WeaponType> getWinWith(){
        return Arrays.asList(this.winWith);
    }

    private static WeaponType[] list = WeaponType.values();


    public static WeaponType getWeapon(int i) {
        return list[i];
    }


    public int listGetLastIndex() {
        return list.length - 1;
    }

}
