package com.cejv679.beans;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by Carlos Molina.
 */
public class Player extends Person {

    private String countryOfBirth;
    private PositionEnum position;
    private Stats stats;

    public Player(String firstName, String lastName, int age, BigDecimal salary, Currency currency, String countryOfBirth, PositionEnum position, Stats stats) {
        super(firstName, lastName, age, salary, currency);
        this.countryOfBirth = countryOfBirth;
        this.position = position;
        this.stats = stats;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public PositionEnum getPosition() {
        return position;
    }

    public void setPosition(PositionEnum position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "countryOfBirth='" + countryOfBirth + '\'' +
                ", position=" + position +
                ", stats=" + stats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Player player = (Player) o;

        if (!getCountryOfBirth().equals(player.getCountryOfBirth())) return false;
        if (getPosition() != player.getPosition()) return false;
        return !(getStats() != null ? !getStats().equals(player.getStats()) : player.getStats() != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getCountryOfBirth().hashCode();
        result = 31 * result + getPosition().hashCode();
        result = 31 * result + (getStats() != null ? getStats().hashCode() : 0);
        return result;
    }
}
