package com.devapptodo.ToDo.services;

import com.devapptodo.ToDo.controllers.TaskController;
import com.devapptodo.ToDo.dtos.TaskDTO;
import com.devapptodo.ToDo.entities.Task;
import com.devapptodo.ToDo.repositories.TaskRepository;
import com.devapptodo.ToDo.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

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

    @Transactional
    public TaskDTO insert(TaskDTO dto){
        Task entity = new Task();

        copyToEntity(dto, entity);
        entity = taskRepository.save(entity);

        return new TaskDTO(entity);
    }

    @Transactional
    public TaskDTO findById(Long id){
        Optional<Task> obj = taskRepository.findById(id);
        Task entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));

        return new TaskDTO(entity);
    }


    private void copyToEntity(TaskDTO dto, Task entity){
        entity.setTitle(dto.getTitle());
        entity.setDescription(dto.getDescription());
      // entity.setDeadLine(dto.getDeadLine());
    }
}
