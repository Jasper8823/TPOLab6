package org.example.tpolab6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DataController {
    private final DataService dataService;

    public DataController(DataService dataService) {
        this. dataService = dataService;
    }

    @GetMapping("/start")
    public String show() {
        return "data";
    }
    @RequestMapping("/generate")
    public String generate(@RequestParam("count") int count,@RequestParam("language") String language,@RequestParam(value = "choice",required = false,defaultValue = "")List<String> choice,@ModelAttribute("dto") DTO dto,@ModelAttribute("header") Headers header) {
        if (choice == null) {
            choice = new ArrayList<>();
        }
        if(count<0){
            return "error";
        }
        header.setLanguage(language);
        dto.addToList(dataService.generateData(count, language, choice));
        return "res";
    }
}

