package com.example.todoapp.repositories;

import com.example.todoapp.models.ToDoItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoItemRepository extends CrudRepository<ToDoItem, Long> {
}
