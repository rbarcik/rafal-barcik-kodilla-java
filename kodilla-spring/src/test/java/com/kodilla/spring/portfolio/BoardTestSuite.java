package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addTaskToDoList("Task to do.");
        board.addTaskInProgressList("Task in progress.");
        board.addTaskDoneList("Task done.");
        //Then
        String toDoTask = board.getToDoList().getTasks().get(0);
        Assert.assertEquals(toDoTask, "Task to do.");
        System.out.println(toDoTask);

        String inProgressTask = board.getInProgressList().getTasks().get(0);
        Assert.assertEquals(inProgressTask, "Task in progress.");
        System.out.println(inProgressTask);

        String doneTask = board.getDoneList().getTasks().get(0);
        Assert.assertEquals(doneTask, "Task done.");
        System.out.println(doneTask);
    }
}
