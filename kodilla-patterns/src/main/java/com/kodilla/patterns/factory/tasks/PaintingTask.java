package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
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
