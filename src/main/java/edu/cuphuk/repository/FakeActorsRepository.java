package edu.cuphuk.repository;

import edu.cuphuk.model.Actors;
import edu.cuphuk.service.actors.interfaces.IActorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeActorsRepository {

        private LocalDateTime time = LocalDateTime.now();
        private List<Actors> list = new ArrayList<>(
                Arrays.asList(
                        new Actors("1", "Andry", "Rudnichenko", "Ivanovich", "1 year", "rank", time, time, "desc" ),
                        new Actors("2", "Katerina", "Tarasenko", "Valentynivna", "4 year", "rank", time, time, "desc" ),
                        new Actors("3", "Anna", "Brovchenko", "Volodymyrivna", "3 year", "rank", time, time, "desc" ),
                        new Actors("4", "Roman", "Mischeryakov", "Semenovych", "1.5 year", "rank", time, time, "desc" ),
                        new Actors("5", "Robert", "Patinson", "Odinson", "0 year", "rank", time, time, "desc" ),
                        new Actors("6", "Hanna", "Kyrychenko", "Olegyvna", "10 year", "rank", time, time, "desc" )
                )
        );


        public Actors create(Actors actors) {
            System.out.println("actors has been accepted "+actors.toString());
            list.add(actors);
            return actors;
        }


        public Actors get(String id) {
            Actors actors = list.stream().filter(el -> el.getId().equals(id))
                    .findAny().get();

            return actors;
        }


        public Actors update(Actors actors) {
            String id = actors.getId();
            Actors actorToUpdate = this.get(id);
            int index = list.indexOf(actorToUpdate);
            actors.setUpdatedAt(LocalDateTime.now());
            list.remove(actorToUpdate);
            list.add(actors);

            return actors;
        }




        public Actors delete(String id) {
            Actors actors = this.get(id);
            list.remove(actors);

            return actors;
        }


        public List<Actors> getAll() {
            return null;
        }

}



