package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void addTaskToDoList (String toDoTask) {
        toDoList.addTaskToList(toDoTask);
    }
    public void addTaskInProgressList (String inProgressTask) {
        inProgressList.addTaskToList(inProgressTask);
    }
    public void addTaskDoneList (String doneTask) {
        doneList.addTaskToList(doneTask);
    }
}
