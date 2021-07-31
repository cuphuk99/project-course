package edu.cuphuk.controller.rest;

import edu.cuphuk.model.Actors;
import edu.cuphuk.model.Shows;
import edu.cuphuk.service.actors.impls.IActorsServiceImpl;
import edu.cuphuk.service.shows.impl.IShowsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowsRestController {

    @Autowired
    IShowsServiceImpl service;

    @RequestMapping("/all")
    public List<Shows> getAll(){
        return service.getAll();
    }
    @RequestMapping("/{id}")
    public Shows get(@PathVariable("id") String id){


        return service.get(id);
    }

    @RequestMapping("/delete/{id}")
    public Shows delete(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create")
    public Shows create(@RequestBody Shows shows){

        return service.create(shows);
    }
    @PostMapping("/update")
    public Shows update(@RequestBody Shows shows){
        return service.update(shows);
    }




}

