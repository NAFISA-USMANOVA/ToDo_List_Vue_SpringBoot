package com.astralist.rest.service;

import com.astralist.rest.model.Task;
import com.astralist.rest.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository tasksRepository;
    @Autowired
    public TaskService(TaskRepository tasksRepository){
        this.tasksRepository=tasksRepository;
    }
    public Task saveTask(Task task){
        return tasksRepository.save(task);
    }
    public List<Task> taskList(){
        return tasksRepository.findAll();
    }
}
