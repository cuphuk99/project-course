package edu.cuphuk.controller.gui;


import edu.cuphuk.form.ActorsCreateForm;
import edu.cuphuk.form.ActorsUpdateForm;
import edu.cuphuk.form.ShowsCreateForm;
import edu.cuphuk.form.ShowsUpdateForm;
import edu.cuphuk.model.Actors;
import edu.cuphuk.model.Shows;
import edu.cuphuk.service.actors.impls.IActorsServiceImpl;
import edu.cuphuk.service.shows.impl.IShowsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/gui/shows")
public class ShowsGuiController {
    @Autowired
    IShowsServiceImpl service;

    @RequestMapping("/all")
    public String getAll(Model model){
        List<Shows> shows = service.getAll();
        model.addAttribute("shows", shows);
        return "shows";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(Model model, @PathVariable("id") String id){
        service.delete(id);

        return "redirect:/gui/shows/all";
    }

    @GetMapping("/create")
    public String create(Model model){
        ShowsCreateForm formToCreate = new ShowsCreateForm();
        model.addAttribute("form", formToCreate);
        return "shows-create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute("form") ShowsCreateForm form){
        Shows shows = new Shows();
        shows.setName(form.getName());
        shows.setDescription(form.getDescription());
        shows.setCreatedAt(LocalDateTime.now());
        shows.setUpdatedAt(LocalDateTime.now());
        shows.setBudget(form.getBudget());
        shows.setYear(form.getYear());

        service.create(shows);
        return "redirect:/gui/shows/all";
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") String id){
        Shows shows = service.get(id);
        ShowsUpdateForm formToUpdate = new ShowsUpdateForm();
        formToUpdate.setId(shows.getId());
        formToUpdate.setName(shows.getName());
        formToUpdate.setDescription(shows.getDescription());
        formToUpdate.setCreatedAt(shows.getCreatedAt());
        formToUpdate.setUpdatedAt(shows.getUpdatedAt());
        formToUpdate.setBudget(shows.getBudget());
        formToUpdate.setYear(shows.getYear());


        model.addAttribute("form", formToUpdate);
        return "shows-update";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute("form") ShowsUpdateForm form,  @PathVariable("id") String id){
        Shows shows = service.get(id);
        shows.setId(form.getId());
        shows.setName(form.getName());
        shows.setBudget(form.getBudget());
        shows.setYear(form.getYear());
        shows.setUpdatedAt(LocalDateTime.now());
        service.update(shows);
        ///shows.setDescription(form.getDescription());
        return "redirect:/gui/shows/all";
    }

}
