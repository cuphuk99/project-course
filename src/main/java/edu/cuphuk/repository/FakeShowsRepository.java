package edu.cuphuk.repository;

import edu.cuphuk.model.Actors;
import edu.cuphuk.model.Shows;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeShowsRepository {

        private LocalDateTime time = LocalDateTime.now();
        private List<Shows> list = new ArrayList<>(
                Arrays.asList(
                        new Shows("1", "Romeo and Juliet", "Love stoty", time, time, 15908.00, 2011 ),
                        new Shows("2", "Hamlet", "Tragedy", time, time, 10755.00, 2011 ),
                        new Shows("3", "Little prince", "Philosophy", time, time, 25000.00, 2011 )

                )
        );


        public Shows create(Shows shows) {
            String id = UUID.randomUUID().toString();
            shows.setId(id);
            shows.setCreatedAt(LocalDateTime.now());
            shows.setUpdatedAt(LocalDateTime.now());
            list.add(shows);
            return shows;
        }


        public Shows get(String id) {
            Shows shows = list.stream().filter(el -> el.getId().equals(id))
                    .findAny().get();

            return shows;
        }


        public Shows update(Shows shows) {
            String id = shows.getId();
            Shows showToUpdate = this.get(id);
            shows.setCreatedAt(showToUpdate.getCreatedAt());
            int index = list.indexOf(showToUpdate);
            shows.setUpdatedAt(LocalDateTime.now());
            list.remove(showToUpdate);
            list.add(index, shows);

            return shows;
        }




        public Shows delete(String id) {
            Shows shows = this.get(id);
            list.remove(shows);

            return shows;
        }


        public List<Shows> getAll() {
            return list;
        }

}



