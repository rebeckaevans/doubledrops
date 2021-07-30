package com.rebecka.doubledrops.week;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WeekController {
    @Autowired private WeekService weekService;

    @GetMapping("/weeks")
    public String showWeeks(Model model) {

        List<Week> weeks = weekService.findAll();
        model.addAttribute("weeks", weeks);

        return "redirect:/index.html";
    }

    @PostMapping("/")
    public String editStatus(@RequestParam("day") Integer day) {
        weekService.toggleStatus(day);
        return "redirect:/index.html";
    }
}
