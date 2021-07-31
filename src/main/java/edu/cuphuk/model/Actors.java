package edu.cuphuk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;



/*
 * @author Vlad Ishtukin
 * @project Modeling
 * @class Actors
 * @version 1.0.0
 * @since 17.07.2021 - 18.18
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Actors {
    @Id
    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private String experience;
    private String rank;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String description;


    public Actors(String name, String surname, String patronymic, String experience, String rank) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.experience = experience;
        this.rank = rank;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actors actors = (Actors) o;
        return getId().equals(actors.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Actors{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", experience=" + experience +
                ", rank='" + rank + '\'' +
                '}';
    }
}

