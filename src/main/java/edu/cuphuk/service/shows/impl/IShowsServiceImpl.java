package edu.cuphuk.service.shows.impl;
import edu.cuphuk.model.Actors;
import edu.cuphuk.model.Shows;
import edu.cuphuk.repository.ActorsMongoRepository;
import edu.cuphuk.repository.FakeActorsRepository;
import edu.cuphuk.repository.FakeShowsRepository;
import edu.cuphuk.repository.ShowsMongoRepository;

import edu.cuphuk.service.shows.interfaces.IShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class IShowsServiceImpl implements IShowsService {
    @Autowired
    FakeShowsRepository repository;
    @Autowired
    ShowsMongoRepository mongoRepository;

    //@PostConstruct
    void init(){
        List<Shows> shows = mongoRepository.findAll();
        if(shows.isEmpty()) {
            shows = repository.getAll();
            mongoRepository.saveAll(shows);
        }

    }
    @Override
    public Shows create(Shows shows) {
        shows.setCreatedAt(LocalDateTime.now());
        shows.setUpdatedAt(LocalDateTime.now());
        return mongoRepository.save(shows);
    }



    @Override
    public Shows get(String id) {
        return mongoRepository.findById(id).orElse(null);
    }



    @Override
    public Shows update(Shows shows) {
        shows.setUpdatedAt(LocalDateTime.now());
        return mongoRepository.save(shows);
    }

    @Override
    public Shows delete(String id) {

        Shows shows = mongoRepository.findById(id).get();
        mongoRepository.deleteById(id);
        return shows;
    }

    @Override
    public List<Shows> getAll() {
        return mongoRepository.findAll();
    }
}
