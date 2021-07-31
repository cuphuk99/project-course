package edu.cuphuk.repository;

import edu.cuphuk.model.Actors;
import edu.cuphuk.model.Part;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartMongoRepository extends MongoRepository<Part, String> {
}
