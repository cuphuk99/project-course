package edu.cuphuk.service.part.impl;

import edu.cuphuk.model.Part;
import edu.cuphuk.model.Shows;
import edu.cuphuk.repository.FakePartRepository;
import edu.cuphuk.repository.FakeShowsRepository;
import edu.cuphuk.repository.PartMongoRepository;
import edu.cuphuk.repository.ShowsMongoRepository;
import edu.cuphuk.service.part.interfaces.IPartService;
import edu.cuphuk.service.shows.interfaces.IShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class IPartServiceImpl implements IPartService {
    @Autowired
    FakePartRepository repository;
    @Autowired
    PartMongoRepository mongoRepository;

    @PostConstruct
    void init(){
        List<Part> part = mongoRepository.findAll();
        if(part.isEmpty()) {
            part = repository.getAll();
            mongoRepository.saveAll(part);
        }

    }
    @Override
    public Part create(Part part) {
        part.setCreatedAt(LocalDateTime.now());
        part.setUpdatedAt(LocalDateTime.now());
        return mongoRepository.save(part);
    }



    @Override
    public Part get(String id) {
        return mongoRepository.findById(id).orElse(null);
    }


    @Override
    public Part update(Part part) {
        part.setUpdatedAt(LocalDateTime.now());
        return mongoRepository.save(part);
    }

    @Override
    public Part delete(String id) {

        Part part = mongoRepository.findById(id).get();
        mongoRepository.deleteById(id);
        return part;
    }

    @Override
    public List<Part> getAll() {
        return mongoRepository.findAll();
    }
}
