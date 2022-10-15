package com.devapptodo.ToDo.repositories;

import com.devapptodo.ToDo.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
