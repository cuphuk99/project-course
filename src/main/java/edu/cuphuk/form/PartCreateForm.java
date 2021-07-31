package edu.cuphuk.form;

import edu.cuphuk.model.Actors;
import edu.cuphuk.model.Shows;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartCreateForm {
    private String description;
    private String actor;
    private String show;

}
