package edu.cuphuk.repository;

import edu.cuphuk.model.Actors;
import edu.cuphuk.model.Shows;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowsMongoRepository extends MongoRepository<Shows, String> {
}
