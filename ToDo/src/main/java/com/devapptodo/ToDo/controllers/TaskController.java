package com.devapptodo.ToDo.controllers;


import com.devapptodo.ToDo.dtos.TaskDTO;
import com.devapptodo.ToDo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public ResponseEntity<Page<TaskDTO>> findAll(Pageable pageable){
        Page<TaskDTO> obj = service.findAllPaged(pageable);

        return ResponseEntity.ok().body(obj);
    }
}
