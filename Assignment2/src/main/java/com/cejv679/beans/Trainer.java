package com.cejv679.beans;


import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

/**
 * Created by Carlos Molina.
 */
public class Trainer extends Person {

    private List<Team> teams;

    public Trainer(String firstName, String lastName, int age, BigDecimal salary, Currency currency) {
        super(firstName, lastName, age, salary, currency);
    }
}
