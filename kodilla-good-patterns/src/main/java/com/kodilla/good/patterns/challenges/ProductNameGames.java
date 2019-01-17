package com.kodilla.good.patterns.challenges;

public class ProductNameGames implements ProductName{
    private String tittle;
    private String type;

    public ProductNameGames(String tittle, String type) {
        this.tittle = tittle;
        this.type = type;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Game " +
                tittle +
                " dla platformy " + type;
    }
}
