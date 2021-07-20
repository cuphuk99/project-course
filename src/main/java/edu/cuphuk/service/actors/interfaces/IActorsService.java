package edu.cuphuk.service.actors.interfaces;

import edu.cuphuk.model.Actors;

import java.util.List;

public interface IActorsService {

    Actors create(Actors actors);
    Actors get(String id);
    Actors update(Actors actors);
    Actors delete(String id);
    List<Actors> getAll();
}
