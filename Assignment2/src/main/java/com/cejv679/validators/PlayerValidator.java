package com.cejv679.validators;

import com.cejv679.web.PlayerForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

/**
 * Created by Carlos Molina.
 */
@Component
public class PlayerValidator implements Validator {

    public boolean supports(Class clazz) {
        return PlayerForm.class.equals(clazz);
    }

    public void validate(Object target, Errors errors) {
        PlayerForm playerForm = (PlayerForm) target;

        if (!playerForm.getFirstName().matches("[a-zA-Z]+")) {
            errors.rejectValue("firstName", "first.name.error");
        }

        if (!playerForm.getLastName().matches("[a-zA-Z]+")) {
            errors.rejectValue("lastName", "last.name.error");
        }

        if (playerForm.getCountry().length() == 0 || !playerForm.getCountry().matches("[a-zA-Z]+")) {
            errors.rejectValue("country", "country.error");
        }

        if (!playerForm.getAge().matches("[0-9]+") || Integer.parseInt(playerForm.getAge()) < 20 || Integer.parseInt(playerForm.getAge()) > 23) {
            errors.rejectValue("age", "player.age.error");
        }

        if (!playerForm.getSalary().matches("[0-9.]+") || Double.parseDouble(playerForm.getSalary()) < 0) {
            errors.rejectValue("salary", "salary.error");
        }

        if (playerForm.getCurrency().length() == 0) {
            errors.rejectValue("currency", "currency.error");
        }

        if (!playerForm.getGoals().matches("[0-9]+") || Integer.parseInt(playerForm.getGoals()) < 0) {
            errors.rejectValue("goals", "goals.error");
        }

        if (!playerForm.getBookings().matches("[0-9]+") || Integer.parseInt(playerForm.getBookings()) < 0) {
            errors.rejectValue("bookings", "bookings.error");
        }

    }

}
