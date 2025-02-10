package Exercici3;

public class Project {
    private String title;
    private double budget;
    private boolean completed;

    public Project(String title, double budget) {
        this.title = title;
        this.budget = budget;
        completed = false;
    }

    public String getTitle() {
        return title;
    }

    public double getBudget() {

        return budget;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        this.completed = true;
    }

    public void updateBudget(double newBudget) {
        if (newBudget > 0) {
            this.budget = newBudget;
        }
    }
}