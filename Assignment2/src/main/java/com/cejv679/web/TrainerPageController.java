package com.cejv679.web;

import com.cejv679.beans.Trainer;
import com.cejv679.validators.TrainerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by Carlos Molina.
 */
@Controller
@RequestMapping("/trainer")
public class TrainerPageController {

    @Autowired
    TrainerValidator trainerValidator;

    //Set a form validator
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(trainerValidator);
    }

    @RequestMapping(value = "/create", method = GET)
    public String showRegistrationForm(Model model) {

        model.addAttribute("trainerForm", new TrainerForm());

        return "createTrainer";
    }

    @RequestMapping(value = "/create", method = POST)
    public String processRegistration(@Valid TrainerForm trainerForm, Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "createTrainer";
        }

        model.addAttribute("trainerForm", trainerForm);

        return "trainerPage";

    }

}
