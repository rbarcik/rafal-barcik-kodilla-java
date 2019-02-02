package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean taskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
