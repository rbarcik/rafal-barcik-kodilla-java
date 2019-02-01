package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        String taskName = shopping.getTaskName();
        shopping.executeTask();
        boolean taskExecuted = shopping.isTaskExecuted();
        //Then
        Assert.assertEquals("Go to supermarket", taskName );
        Assert.assertEquals(taskExecuted, true);
    }
    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        String taskName = painting.getTaskName();
        painting.executeTask();
        boolean taskExecuted = painting.isTaskExecuted();
        //Then
        Assert.assertEquals("Painting garden furniture", taskName);
        Assert.assertEquals(taskExecuted, true);
    }
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        String taskName = driving.getTaskName();
        driving.executeTask();
        boolean taskExecuted = driving.isTaskExecuted();
        //Then
        Assert.assertEquals("Driving to job place", taskName);
        Assert.assertEquals(taskExecuted, true);
    }
}
