package edu.cuphuk.service.item.interfaces;

import edu.cuphuk.model.Item;

import java.util.List;

public interface IItemService {

    Item create(Item item);
    Item get(String id);
    Item update(Item item);
    Item delete(String id);
    List<Item> getAll();
}
