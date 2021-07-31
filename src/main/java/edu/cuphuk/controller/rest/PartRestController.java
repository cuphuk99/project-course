package edu.cuphuk.controller.rest;

import edu.cuphuk.model.Part;
import edu.cuphuk.model.Shows;
import edu.cuphuk.service.part.impl.IPartServiceImpl;
import edu.cuphuk.service.shows.impl.IShowsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/part")
public class PartRestController {

    @Autowired
    IPartServiceImpl service;

    @RequestMapping("/all")
    public List<Part> getAll(){
        return service.getAll();
    }

    @RequestMapping("/{id}")
    public Part get(@PathVariable("id") String id){


        return service.get(id);
    }

    @RequestMapping("/delete/{id}")
    public Part delete(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create")
    public Part create(@RequestBody Part part){

        return service.create(part);
    }
    @PostMapping("/update")
    public Part update(@RequestBody Part part){
        return service.update(part);
    }




}

