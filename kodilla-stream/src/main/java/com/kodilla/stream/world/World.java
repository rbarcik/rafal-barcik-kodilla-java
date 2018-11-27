package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    private final String worldName;
    private final Set<Continent> continents = new HashSet<>();

    public World(final String worldName) {
        this.worldName = worldName;
    }

    public String getWorldName() {
        return worldName;
    }

    public Set<Continent> getContinents() {
        return continents;
    }

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeapleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
    public Set<String> getCountries(){
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getCountryName)
                .collect(Collectors.toSet());
    }
}
