package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean taskExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
