package edu.cuphuk.controller.gui;


import edu.cuphuk.form.ActorsCreateForm;
import edu.cuphuk.form.ActorsUpdateForm;
import edu.cuphuk.model.Actors;
import edu.cuphuk.service.actors.impls.IActorsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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

    @RequestMapping(value = "/delete/{id}")
    public String delete(Model model, @PathVariable("id") String id){
        service.delete(id);

        return "redirect:/gui/actors/all";
    }

    @GetMapping("/create")
    public String create(Model model){
        ActorsCreateForm formToCreate = new ActorsCreateForm();
        model.addAttribute("form", formToCreate);
        return "actors-create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute("form") ActorsCreateForm form){
        Actors actors = new Actors();
        actors.setName(form.getName());
        actors.setSurname(form.getSurname());
        actors.setPatronymic(form.getPatronymic());
        actors.setExperience(form.getExperience());
        actors.setRank(form.getRank());
        actors.setCreatedAt(LocalDateTime.now());
        actors.setUpdatedAt(LocalDateTime.now());
        actors.setDescription(form.getDescription());
        service.create(actors);
        return "redirect:/gui/actors/all";
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") String id){
        Actors actors = service.get(id);
        ActorsUpdateForm formToUpdate = new ActorsUpdateForm();
        formToUpdate.setId(actors.getId());
        formToUpdate.setName(actors.getName());
        formToUpdate.setSurname(actors.getSurname());
        formToUpdate.setPatronymic(actors.getPatronymic());
        formToUpdate.setExperience(actors.getExperience());
        formToUpdate.setRank(actors.getRank());
        formToUpdate.setCreatedAt(actors.getCreatedAt());
        formToUpdate.setUpdatedAt(actors.getUpdatedAt());
        formToUpdate.setDescription(actors.getDescription());

        model.addAttribute("form", formToUpdate);
        return "actors-update";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute("form") ActorsUpdateForm form,  @PathVariable("id") String id){
        Actors actors = service.get(id);
        actors.setId(form.getId());
        actors.setName(form.getName());
        actors.setSurname(form.getSurname());
        actors.setPatronymic(form.getPatronymic());
        actors.setExperience(form.getExperience());
        actors.setRank(form.getRank());
        actors.setUpdatedAt(LocalDateTime.now());
        service.update(actors);
        return "redirect:/gui/actors/all";
    }

}
