package com.devapptodo.ToDo.dtos;

import com.devapptodo.ToDo.entities.Task;
import lombok.Data;
import java.time.LocalDateTime;


public class TaskDTO {


    private Long id;
    private String title;

    private String description;

    private LocalDateTime deadLine;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    public TaskDTO(){

    }

    public TaskDTO(Long id, String title, String description, LocalDateTime deadLine, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadLine = deadLine;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public TaskDTO(Task entity) {
        title = entity.getTitle();
        description = entity.getDescription();
        deadLine = entity.getDeadLine();
        createdAt = entity.getCreatedAt();
        updateAt = entity.getUpdateAt();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDateTime deadLine) {
        this.deadLine = deadLine;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
