package com.devapptodo.ToDo.services;

import com.devapptodo.ToDo.controllers.TaskController;
import com.devapptodo.ToDo.dtos.TaskDTO;
import com.devapptodo.ToDo.entities.Task;
import com.devapptodo.ToDo.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TaskService {

    @Autowired
    private TaskController taskController;

    @Autowired
    private TaskRepository taskRepository;

    @Transactional
    public Page<TaskDTO> findAllPaged(Pageable pageable){
        Page<Task> obj = taskRepository.findAll(pageable);

        return obj.map(x -> new TaskDTO(x));
    }
}
