package edu.cuphuk.controller.gui;


import edu.cuphuk.model.Actors;
import edu.cuphuk.service.actors.impls.IActorsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/gui/actors")
public class ActorsGuiController {
    @Autowired
    IActorsServiceImpl service;

    @RequestMapping("/all")
    public String getAll(Model model){
        List<Actors> actors = service.getAll();
        model.addAttribute("actors", actors);
        return "actors";
    }




}
