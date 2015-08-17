package com.cejv679.web;

import com.cejv679.service.SoccerLeagueService;

import com.cejv679.service.impl.SoccerLeagueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by Carlos Molina.
 */
public class PersonForm {

    @NotNull
    String firstName;

    @NotNull
    String lastName;

    String age;
    String currency;
    String salary;

    @Autowired
    protected SoccerLeagueService soccerLeagueService;;

    public PersonForm() {
        soccerLeagueService = new SoccerLeagueServiceImpl();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
