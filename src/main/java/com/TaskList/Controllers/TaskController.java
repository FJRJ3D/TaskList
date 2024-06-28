package com.TaskList.Controllers;

import com.TaskList.Models.Task;
import com.TaskList.Views.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//localhost:3306/

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping(path = "/tasks")
    public ArrayList<Task> getAllTask() {
        return taskService.getAllTask();
    }

    @GetMapping(path = "/saludo")
    public String sayHello(){
        return "Hola desde la petición get";
    }

    @PostMapping(path = "/tasks")
    public Task createTask(@RequestBody Task newtask){
        return taskService.createTask(newtask);
    }






    public Task addTask() {
        return null;
    }

    public Task deleteTask() {
        return null;
    }

    public String updateTask() {
        return "Se ha borrado la tarea";
    }
}
