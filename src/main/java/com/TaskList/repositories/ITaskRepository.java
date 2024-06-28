package com.TaskList.repositories;

import com.TaskList.Models.Task;
import org.springframework.data.repository.CrudRepository;

public interface ITaskRepository extends CrudRepository<Task, Integer> {
}
