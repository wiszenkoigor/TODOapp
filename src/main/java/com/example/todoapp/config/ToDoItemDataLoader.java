package com.example.todoapp.config;

import com.example.todoapp.models.ToDoItem;
import com.example.todoapp.repositories.ToDoItemRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;


@Configuration
public class ToDoItemDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(ToDoItemDataLoader.class);

    @Autowired
     public ToDoItemRepository toDoItemRepository;

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData() {
        if (toDoItemRepository.count() == 0) {
            ToDoItem toDoItem1 = new ToDoItem("get milk");
            ToDoItem toDoItem2 = new ToDoItem("feed the cat");

            toDoItemRepository.save(toDoItem1);
            toDoItemRepository.save(toDoItem2);
        }

        logger.info("number of todo items: {}", toDoItemRepository.count());
    }
}
