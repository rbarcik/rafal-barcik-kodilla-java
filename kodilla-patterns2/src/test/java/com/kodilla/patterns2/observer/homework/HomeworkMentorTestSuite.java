package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkMentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        HomeworkTask javaHibernateQueue = new JavaHibernateHomeworkQueue();
        HomeworkTask javaSpringQueue = new JavaSpringHomeworkQueue();
        HomeworkMentor hibernateHomeworkMentor = new HomeworkMentor("Hibernate Homework Mentor");
        HomeworkMentor springHomeworkMentor = new HomeworkMentor("Spring Homework Mentor");
        HomeworkMentor hibernateAndSpringHomeworkMentor = new HomeworkMentor("Hibernate and Spring Homework Mentor");
        javaHibernateQueue.registerObserver(hibernateHomeworkMentor);
        javaSpringQueue.registerObserver(springHomeworkMentor);
        javaHibernateQueue.registerObserver(hibernateAndSpringHomeworkMentor);
        javaSpringQueue.registerObserver(hibernateAndSpringHomeworkMentor);
        //When
        javaHibernateQueue.addTask("Relations 1:1");
        javaSpringQueue.addTask("Bean ForumUser");
        javaHibernateQueue.addTask("Relations 1:N");
        javaSpringQueue.addTask("Calculator with display");
        javaHibernateQueue.addTask("Relations M:N");
        //Then
        assertEquals(3, hibernateHomeworkMentor.getUpdateCount());
        assertEquals(2, springHomeworkMentor.getUpdateCount());
        assertEquals(5, hibernateAndSpringHomeworkMentor.getUpdateCount());
    }
}
