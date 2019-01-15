package com.kodilla.rps;

public class RpsRunner {
    public static void main (String[] args){

        GameRps gameRps = new GameRps();
        Player computer = new Computer(0);

        Player user = new User(gameRps.inputUserName(), 0);

        int numberOfRounds = gameRps.inputNumberOfRounds();

        boolean end = false;
        while(!end){
            WeaponType weaponU;
            weaponU = user.getWeapon(1);

            if( weaponU == null){
                break;
            }
            System.out.println(weaponU);

            System.out.println("weapon " + weaponU + "win with " + weaponU.getWinWith());
            WeaponType weaponC = computer.getWeapon(user.getScore());
            if(weaponU.equals(weaponC)){
                System.out.println("remis");
            }
            if(weaponC.getWinWith().contains(weaponU)){
                System.out.println("wygrał komputer");
            }
            if(weaponU.getWinWith().contains(weaponC)){
                System.out.println("wygrał user");
            }
        }
    }
}
