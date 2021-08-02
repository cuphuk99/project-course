package edu.cuphuk.form;

import edu.cuphuk.model.Part;

import java.time.LocalDateTime;

public class PartUpdateForm {
    private String id;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String actor;
    private String show;

    public PartUpdateForm() {
    }

    public PartUpdateForm(Part part) {
        this.id = part.getId();
        this.description = part.getDescription();
        this.createdAt = part.getCreatedAt();
        this.updatedAt = part.getUpdatedAt();
        this.actor = part.getActor().getName() + " " + part.getActor().getSurname() + " " + part.getActor().getPatronymic();
        this.show = part.getShow().getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }
}
