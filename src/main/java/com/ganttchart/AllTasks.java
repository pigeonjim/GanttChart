package com.ganttchart;

import java.time.LocalDate;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;


public class AllTasks {

    private ObservableMap<LocalDate, ArrayList<ProjectTask>> allTasks;

    public AllTasks(){
        allTasks = FXCollections.observableHashMap();
    }

    public void addNewTask(String taskName, LocalDate startDate){
        if(!allTasks.containsKey(startDate)){
            allTasks.put(startDate, new ArrayList<ProjectTask>());
        }
        allTasks.get(startDate).add(new ProjectTask(taskName, startDate));
    }

    public ProjectTask getTask(String taskName, LocalDate startDate){
        if(!allTasks.containsKey(startDate)){
            return new ProjectTask(taskName, startDate);
        }
        for(ProjectTask task: allTasks.get(startDate)){
            if(task.getTaskName().equals(taskName)){
                return task;
            }
        }
        return new ProjectTask(taskName, startDate);
    }

    public void changeStartDate(String taskName, LocalDate oldStartDate, LocalDate newStartDate){
        ProjectTask tempTask = getTask(taskName, oldStartDate);
        if(!allTasks.containsKey(newStartDate)){
            allTasks.put(newStartDate, new ArrayList<ProjectTask>());
        }
        allTasks.get(newStartDate).add(tempTask);
        allTasks.get(oldStartDate).remove(tempTask);
        getTask(taskName, newStartDate).setTaskStartDate(newStartDate);
    }

    public ObservableMap<LocalDate, ArrayList<ProjectTask>> getAllTasks() {
        //for testing only
        return allTasks;
    }

    public void printAllTaskNames(){
        for (LocalDate day: allTasks.keySet()){
            for(ProjectTask task: allTasks.get(day)){
                System.out.println(task.getTaskName() + " " + day);
                System.out.println();
            }
        }
    }
}
