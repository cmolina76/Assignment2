package com.cejv679.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by carlos molina.
 */
@Controller
@RequestMapping("/")
public class HomePageController {

    @RequestMapping(method = GET)
    public String home(Model model) {
        return "homePage";
    }
}
