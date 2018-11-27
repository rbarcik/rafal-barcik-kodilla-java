package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal peapleQuantity;

    public Country(final String countryName, final BigDecimal peapleQuantity) {
        this.countryName = countryName;
        this.peapleQuantity = peapleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeapleQuantity() {
        return peapleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peapleQuantity=" + peapleQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return countryName.equals(country.countryName);
    }

    @Override
    public int hashCode() {
        return countryName.hashCode();
    }
}
