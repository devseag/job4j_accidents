package ru.job4j.accidents.controller;

import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import ru.job4j.accidents.service.*;
import ru.job4j.accidents.model.*;

import java.util.*;

@Controller
@RequestMapping("/accidents")
@AllArgsConstructor
public class AccidentController {

    private final AccidentService accidentService;

    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("accidents", accidentService.findAll());
        return "accidents/all";
    }

    @GetMapping("/createAccident")
    public String viewCreateAccident(Model model) {
        model.addAttribute("types", accidentService.getAccidentTypes());
        return "accidents/createAccident";
    }

    @PostMapping("/saveAccident")
    public String save(@ModelAttribute Accident accident, Model model) {
        accidentService.save(accident);
        return "redirect:/accidents/all";
    }

    @GetMapping("/formUpdateAccident")
    public String edit(@RequestParam("id") int id, Model model) {
        var accident = accidentService.findById(id);
        if (accident.isEmpty()) {
            model.addAttribute("message", "Incident ne najden.");
            return "errors/404";
        }
        model.addAttribute("accident", accident.get());
        model.addAttribute("types", accidentService.getAccidentTypes());
        return "accidents/editAccident";
    }

    @PostMapping("/updateAccident")
    public String update(@ModelAttribute Accident accident, Model model) {
        accidentService.update(accident);
        return "redirect:/accidents/all";
    }

}