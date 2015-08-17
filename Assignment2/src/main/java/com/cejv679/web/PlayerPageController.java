package com.cejv679.web;

import com.cejv679.validators.PlayerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by Carlos Molina.
 */
@Controller
@RequestMapping("/player")
public class PlayerPageController {

    @Autowired
    PlayerValidator playerValidator;

    //Set a form validator
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(playerValidator);
    }

    @RequestMapping(value = "/create", method = GET)
    public String showRegistrationForm(Model model) {

        model.addAttribute("playerForm", new PlayerForm());

        return "createPlayer";
    }

    @RequestMapping(value = "/create", method = POST)
    public String processRegistration(@Valid PlayerForm playerForm, Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "createPlayer";
        }

        model.addAttribute("playerForm", playerForm);

        return "playerPage";

    }

}
