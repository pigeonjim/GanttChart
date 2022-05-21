package com.ganttchart;

import java.time.LocalDate;

public class ProjectTask {
    private LocalDate taskStartDate, projectedEndDate;
    private String taskName, taskDescription;
    private TaskTypes taskType;
    private int daysToComplete;

    public ProjectTask(LocalDate taskStartDate, LocalDate projectedEndDate, String taskName){
        this.taskStartDate = taskStartDate;
        this.projectedEndDate = projectedEndDate;
        this.taskName = taskName;
        this.daysToComplete = 0;
    }
    public ProjectTask(LocalDate taskStartDate, LocalDate projectedEndDate, String taskName,
                       String description){
        this(taskStartDate,projectedEndDate,taskName);
        this.taskDescription = description;
    }
    public ProjectTask(LocalDate taskStartDate, int daysToComplete, String taskName){
        this.taskStartDate = taskStartDate;
        this.daysToComplete = daysToComplete;
        this.taskName = taskName;
    }
    public ProjectTask(LocalDate taskStartDate, int daysToComplete, String taskName,
                       String description){
        this(taskStartDate,daysToComplete,taskName);
        this.taskDescription = description;
    }


    public void setTaskType(TaskTypes taskType){
        this.taskType = taskType;
    }

    public void setProjectedEndDate(LocalDate projectedEndDate) {
        this.projectedEndDate = projectedEndDate;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskStartDate(LocalDate taskStartDate) {
        this.taskStartDate = taskStartDate;
    }

    public LocalDate getProjectedEndDate() {
        return projectedEndDate;
    }

    public LocalDate getTaskStartDate() {
        return taskStartDate;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getTaskName() {
        return taskName;
    }

    public TaskTypes getTaskType() {
        return taskType;
    }
}
