package edu.cuphuk.controller.rest;

import edu.cuphuk.model.Actors;

import edu.cuphuk.service.actors.impls.IActorsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actors")
public class ActorsRestController {

    @Autowired
    IActorsServiceImpl service;

    @RequestMapping("/all")
    public List<Actors> getAll(){
        return service.getAll();
    }
    @RequestMapping("/{id}")
    public Actors get(@PathVariable("id") String id){


        return service.get(id);
    }

    @RequestMapping("/delete/{id}")
    public Actors delete(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create")
    public Actors create(@RequestBody Actors actors){

        return service.create(actors);
    }
    @PostMapping("/update")
    public Actors update(@RequestBody Actors actors){
        return service.update(actors);
    }




}

