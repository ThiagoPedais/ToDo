package com.devapptodo.ToDo.dtos;

import com.devapptodo.ToDo.entities.Task;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
import java.time.LocalDateTime;


@Getter
@Setter
@ToString
public class TaskDTO {


    private Long id;
    private String title;

    private String description;

   // @Column(nullable = false)
   // private LocalDateTime deadLine;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;
    public TaskDTO(){

    }

    public TaskDTO(Long id, String title, String description, Instant date, LocalDateTime deadLine, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.title = title;
        this.description = description;
     //   this.deadLine = deadLine;
        this.createdAt = createdAt;
        this.updateAt = updateAt;

    }

    public TaskDTO(Task entity) {
        title = entity.getTitle();
        description = entity.getDescription();
      //  deadLine = entity.getDeadLine();
        createdAt = entity.getCreatedAt();
        updateAt = entity.getUpdateAt();
    }



}
