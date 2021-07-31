package edu.cuphuk.service.shows.interfaces;

import edu.cuphuk.model.Actors;
import edu.cuphuk.model.Shows;

import java.util.List;

public interface IShowsService {
    Shows create(Shows shows);
    Shows get(String id);
    Shows update(Shows shows);
    Shows delete(String id);
    List<Shows> getAll();
}
