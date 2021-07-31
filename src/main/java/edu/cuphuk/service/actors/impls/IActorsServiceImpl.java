package edu.cuphuk.service.actors.impls;


import edu.cuphuk.model.Actors;
import edu.cuphuk.repository.ActorsMongoRepository;
import edu.cuphuk.repository.FakeActorsRepository;
import edu.cuphuk.service.actors.interfaces.IActorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class IActorsServiceImpl implements IActorsService {
@Autowired
    FakeActorsRepository repository;
@Autowired
    ActorsMongoRepository mongoRepository;

@PostConstruct
void init(){
    List<Actors> actors = mongoRepository.findAll();
    if(actors.isEmpty()) {
        actors = repository.getAll();
        mongoRepository.saveAll(actors);
    }


}

    @Override
    public Actors create(Actors actors) {
        actors.setCreatedAt(LocalDateTime.now());
        actors.setUpdatedAt(LocalDateTime.now());
        return mongoRepository.save(actors);
    }



    @Override
    public Actors get(String id) {
        return mongoRepository.findById(id).orElse(null);

    }

    @Override
    public Actors update(Actors actors) {
        actors.setUpdatedAt(LocalDateTime.now());
        return mongoRepository.save(actors);
    }

    @Override
    public Actors delete(String id) {

        Actors actors = mongoRepository.findById(id).get();
        mongoRepository.deleteById(id);
        return actors;
    }

    @Override
    public List<Actors> getAll() {
        return mongoRepository.findAll();
    }
}


