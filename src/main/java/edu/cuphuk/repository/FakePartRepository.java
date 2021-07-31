package edu.cuphuk.repository;

import edu.cuphuk.model.Actors;
import edu.cuphuk.model.Part;
import edu.cuphuk.model.Shows;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class FakePartRepository {

        private LocalDateTime time = LocalDateTime.now();
        private List<Part> list = new ArrayList<>(
                Arrays.asList(
                        new Part("1", "First actor to show", time, time,
                                new Actors("1", "Andry", "Rudnichenko", "Ivanovich", "1 year", "rank", time, time, "desc" ),
                                new Shows("1", "Romeo and Juliet", "Love stoty", time, time, 15908.00, 2011 ) ),
                        new Part("2",  "Second actor to show", time, time,
                                new Actors("6", "Hanna", "Kyrychenko", "Olegyvna", "10 year", "rank", time, time, "desc" ),
                                new Shows("3", "Little prince", "Philosophy", time, time, 25000.00, 2011 )  )


                )
        );


        public Part create(Part part) {
            String id = UUID.randomUUID().toString();
            part.setId(id);
            part.setCreatedAt(LocalDateTime.now());
            part.setUpdatedAt(LocalDateTime.now());
            list.add(part);
            return part;
        }


        public Part get(String id) {
            Part part = list.stream().filter(el -> el.getId().equals(id))
                    .findAny().get();

            return part;
        }


        public Part update(Part part) {
            String id = part.getId();
            Part partToUpdate = this.get(id);
            part.setCreatedAt(partToUpdate.getCreatedAt());
            int index = list.indexOf(partToUpdate);
            part.setUpdatedAt(LocalDateTime.now());
            list.remove(partToUpdate);
            list.add(index, part);

            return part;
        }




        public Part delete(String id) {
            Part part = this.get(id);
            list.remove(part);

            return part;
        }


        public List<Part> getAll() {
            return list;
        }

}



