package com.astralist.rest.controller;

import com.astralist.rest.model.Task;
import com.astralist.rest.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> taskList() {
        return taskService.getTaskList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Optional<Task> task = taskService.getTaskListById(id);
        return ResponseEntity.of(task);
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @PutMapping(path = "/{id}")
    public String updateTask (@PathVariable int id, @RequestBody Task task) {
        task.setId(id);
        return (taskService.updateTask(task));
    }

    @DeleteMapping("/{id}")
    public String deleteTask (@PathVariable Long id) {
        taskService.deleteTask(id);
        return "Task deleted with ID " + id;
    }
}