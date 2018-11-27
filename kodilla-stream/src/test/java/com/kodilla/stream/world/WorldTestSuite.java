package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country("Poland", new BigDecimal("211111110903703703670"));
        Country germany = new Country("Germany", new BigDecimal("852369741456987123852"));
        Country china = new Country("China", new BigDecimal("987654321987654321987"));
        Country turkey = new Country("Turkey", new BigDecimal("564987321654987321258"));
        Country tunisia = new Country ("Tunisia", new BigDecimal("123456799258369"));
        Country egipt = new Country ("Egipt", new BigDecimal("456789369258"));
        Country australia = new Country ("Australia", new BigDecimal("789654321258963147"));
        Country usa = new Country("USA", new BigDecimal("987987987654654654321"));
        Country canada = new Country ("Canada", new BigDecimal("654321654987321852123"));
        Country chile = new Country("Chile", new BigDecimal("987654654321852"));
        Country brazil = new Country("Brazil", new BigDecimal("98798765432165498725"));
        Country antarkticaCountry = new Country("Antarktica", new BigDecimal("4000"));

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Continent australiaCont = new Continent("Australia");
        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");
        Continent antarctica = new Continent("Antarctica");

        World earth = new World("Earth");

        europe.addCountry(poland);
        europe.addCountry(germany);
        asia.addCountry(china);
        asia.addCountry(turkey);
        africa.addCountry(tunisia);
        africa.addCountry(egipt);
        australiaCont.addCountry(australia);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        southAmerica.addCountry(chile);
        southAmerica.addCountry(brazil);
        antarctica.addCountry(antarkticaCountry);

        earth.addContinent(europe);
        earth.addContinent(asia);
        earth.addContinent(africa);
        earth.addContinent(australiaCont);
        earth.addContinent(northAmerica);
        earth.addContinent(southAmerica);
        earth.addContinent(antarctica);

        //When
        BigDecimal totalWorldPeopleQuantity = earth.getPeopleQuantity();
        int countriesCounter = earth.getCountries().size();

        //Then
        BigDecimal expectedWorldPeopleQuantity = new BigDecimal("4358021669966976392562");
        Assert.assertEquals(expectedWorldPeopleQuantity, totalWorldPeopleQuantity);
        Assert.assertEquals(12, countriesCounter);
    }
}
