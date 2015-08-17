package com.cejv679.validators;

import com.cejv679.web.TrainerForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by carlos.molina.
 */
@Component
public class TrainerValidator implements Validator {

    public boolean supports(Class clazz) {
        return TrainerForm.class.equals(clazz);
    }

    public void validate(Object target, Errors errors) {
        TrainerForm trainerForm = (TrainerForm) target;

        if (!trainerForm.getFirstName().matches("[a-zA-Z]+")) {
            errors.rejectValue("firstName", "first.name.error");
        }

        if (!trainerForm.getLastName().matches("[a-zA-Z]+")) {
            errors.rejectValue("lastName", "last.name.error");
        }

        if (!trainerForm.getAge().matches("[0-9]+") || Integer.parseInt(trainerForm.getAge()) < 40) {
            errors.rejectValue("age", "trainer.age.error");
        }

        if (!trainerForm.getSalary().matches("[0-9.]+") || Double.parseDouble(trainerForm.getSalary()) < 0) {
            errors.rejectValue("salary", "salary.error");
        }

        if (trainerForm.getCurrency().length() == 0) {
            errors.rejectValue("currency", "currency.error");
        }


    }

}
