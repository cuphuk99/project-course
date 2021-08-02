package edu.cuphuk.repository;

import edu.cuphuk.model.Actors;
import org.springframework.data.mongodb.core.MongoAdmin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorsMongoRepository extends MongoRepository<Actors, String> {
    List<Actors> findByNameAndSurnameAndPatronymic(String name, String surname, String patronymic);
}
