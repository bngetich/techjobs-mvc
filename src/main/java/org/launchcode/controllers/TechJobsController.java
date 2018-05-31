package org.launchcode.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {

    public static HashMap<String, String> actionChoices = new HashMap<>();
    public static HashMap<String, String> columnChoices = new HashMap<>();

    @ModelAttribute("actions")
    public static HashMap<String, String> getActionChoices() {
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        return actionChoices;
    }

    @ModelAttribute("columns")
    public static HashMap<String, String> getColumnChoices() {
        columnChoices.put("core competency", "Skill");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("position type", "Position Type");
        columnChoices.put("all", "All");

        return columnChoices;
    }
}
