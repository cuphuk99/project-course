package edu.cuphuk.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Part {
    private String id;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Actors actor;
    private Shows show;

    public Part() {
    }

    public Part(String description, Actors actor, Shows show) {
        this.description = description;
        this.actor = actor;
        this.show = show;
    }

    public Part(String id,  String description, LocalDateTime createdAt, LocalDateTime updatedAt, Actors actor, Shows show) {
        this.id = id;

        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.actor = actor;
        this.show = show;
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

    public Actors getActor() {
        return actor;
    }

    public void setActor(Actors actor) {
        this.actor = actor;
    }

    public Shows getShow() {
        return show;
    }

    public void setShow(Shows show) {
        this.show = show;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Part that = (Part) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Participation{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", actor=" + actor +
                ", show=" + show +
                '}';
    }
}
