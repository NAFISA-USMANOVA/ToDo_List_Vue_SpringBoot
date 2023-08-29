package com.astralist.rest.controller;

import com.astralist.rest.model.Task;
import com.astralist.rest.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService tasksService;
    @PostMapping
    public Task saveTask(@RequestBody Task task){
        return tasksService.saveTask(task);
    }
    @GetMapping
    public List<Task> taskList(){
        return tasksService.taskList();
    }

}
