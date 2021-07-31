package edu.cuphuk.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActorsUpdateForm {

    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private String experience;
    private String rank;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String description;

}
