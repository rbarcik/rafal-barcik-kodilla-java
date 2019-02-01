package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
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
