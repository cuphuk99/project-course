package edu.cuphuk.service.part.interfaces;

import edu.cuphuk.model.Part;
import edu.cuphuk.model.Shows;

import java.util.List;

public interface IPartService {
    Part create(Part part);
    Part get(String id);
    Part update(Part part);
    Part delete(String id);
    List<Part> getAll();
}
