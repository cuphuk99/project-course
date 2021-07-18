package edu.cuphuk.controller.rest;

import edu.cuphuk.model.Item;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/item")
public class ItemRestController {
    private LocalDateTime time = LocalDateTime.now();
    private List<Item> list = new ArrayList<>(
            Arrays.asList(
                    new Item("1", "name1", "desc1", time, time ),
                    new Item("2", "name2", "desc2", time, time ),
                    new Item("3", "name3", "desc3", time, time ),
                    new Item("4", "name4", "desc4", time, time )
            )
    );
    @RequestMapping("/all")
    public List<Item> getAll(){
        return list;
    }
    @RequestMapping("/{id}")
    public Item get(@PathVariable("id") String id){
        Item item = list.stream().filter(el -> el.getId().equals(id))
                .findAny().get();

        return item;
    }

}
