package com.astralist.rest.service;

import com.astralist.rest.model.Task;
import com.astralist.rest.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    TaskRepository tasksRepository;

    public Task saveTask(Task task) {
        return tasksRepository.save(task);
    }

    public List<Task> getTaskList() {
        return tasksRepository.findAll();
    }

    public String updateTask(Task updateTask) {
        try {
            if(tasksRepository.existsById((long) updateTask.getId())) {
                tasksRepository.save(updateTask);
                return ("Task updated: " + updateTask.getEvent());
            } else {
                return ("Task not updated: Record with ID :" + updateTask.getId() + "does not exist");
            }
        } catch(Exception error) {
            throw new RuntimeException("Task not updated: " + error.getMessage());
        }
    }

    public void deleteTask(Long id) {
        tasksRepository.deleteById(id);
    }

    public Optional<Task> getTaskListById(Long id) {
        return tasksRepository.findById(id);
    }
}