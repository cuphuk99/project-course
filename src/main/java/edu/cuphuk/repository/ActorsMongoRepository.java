package edu.cuphuk.repository;

import edu.cuphuk.model.Actors;
import org.springframework.data.mongodb.core.MongoAdmin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorsMongoRepository extends MongoRepository<Actors, String> {
}
