package com.example.demo.domain.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private TaskRepo taskRepo;

    @Autowired
    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public Task create(Task task){
        task.setCompleted(false);
        return taskRepo.save(task);
    }

    public List<Task> getAllTask(){
        return taskRepo.findAll();
    }
}
