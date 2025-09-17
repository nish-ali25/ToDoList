package com.app.todoapp.repository;

import com.app.todoapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

//a repository connects the application to the database, allowing saving, deleting and updating data
public interface TaskRepository extends JpaRepository<Task, Long> {
}
