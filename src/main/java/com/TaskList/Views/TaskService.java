package com.TaskList.Views;


import com.TaskList.Models.Task;
import com.TaskList.repositories.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskService {

    @Autowired
    ITaskRepository iTaskRepository;

    //hacer algo para ir a la bbdd y traer todas las tareas

    public ArrayList<Task> getAllTask(){
        return (ArrayList<Task>) iTaskRepository.findAll();
    }

    public Task createTask(Task newtask){
        return iTaskRepository.save(newtask);
    }

}
