package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BoardConfig {

    @Bean(name = "taskList")
    public Board taskList() {
        return new Board(toDoList(), inProgressList(), doneList());
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList();
    }


    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList doneList() {
        return new TaskList();
    }
}
