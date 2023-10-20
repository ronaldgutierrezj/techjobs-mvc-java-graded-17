package org.launchcode.techjobsmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
public class HomeController  extends TechJobsController{

    @GetMapping(value = "/")
    public String index () {

//        HashMap<String, String> actionChoices = new HashMap<>();
//        actionChoices.put("search", "Search");
//        actionChoices.put("list", "List");

//        model.addAttribute("actions", TechJobsController.getActionChoices());

        return "index";
    }

}

