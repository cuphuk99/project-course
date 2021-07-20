package edu.cuphuk.service.actors.impls;


import edu.cuphuk.model.Actors;
import edu.cuphuk.repository.FakeActorsRepository;
import edu.cuphuk.service.actors.interfaces.IActorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class IActorsServiceImpl implements IActorsService {
@Autowired
    FakeActorsRepository repository;

    @Override
    public Actors create(Actors actors) {

        return repository.create(actors);
    }

    @Override
    public Actors get(String id) {

        return repository.get(id);
    }

    @Override
    public Actors update(Actors actors) {
        return repository.update(actors);
    }

    @Override
    public Actors delete(String id) {


        return repository.delete(id);
    }

    @Override
    public List<Actors> getAll() {
        return repository.getAll();
    }
}


