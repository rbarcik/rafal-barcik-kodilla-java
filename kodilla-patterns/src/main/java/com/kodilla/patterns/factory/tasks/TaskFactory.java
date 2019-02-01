package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final static String SHOPPING = "Shopping Task";
    public final static String PAINTING = "Painting Task";
    public final static String DRIVING = "Driving Task";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Go to supermarket", "Buy milk", 5);
            case PAINTING:
                return new PaintingTask("Painting garden furniture", "brown", "Garden table");
            case DRIVING:
                return new DrivingTask("Driving to job place", "Kraków", "Car");
            default:
                return null;
        }
    }
}
