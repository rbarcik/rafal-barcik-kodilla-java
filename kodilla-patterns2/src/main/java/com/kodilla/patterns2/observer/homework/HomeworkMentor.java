package com.kodilla.patterns2.observer.homework;

public class HomeworkMentor implements Observer {
    public final String mentorName;
    private int updateCount;

    public HomeworkMentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(HomeworkTask homeworkTask) {
        System.out.println(mentorName + ": New Homework from " + homeworkTask.getName() + "\n" +
                " (total: " + homeworkTask.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
