package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    public void executeTask() {
        System.out.println("Executing task " + taskName);
        taskExecuted = true;
    }
    public String getTaskName() {
        return taskName;
    }
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
