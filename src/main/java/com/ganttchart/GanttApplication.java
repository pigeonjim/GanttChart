package com.ganttchart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;


public class GanttApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        IOLogic dbIO = new IOLogic();
        DateLogic dateLogic = new DateLogic();
        AllTasks allTasks = new AllTasks();
        MainUI mainUI = new MainUI(allTasks);
        DrawTimeBars drawTimeBars = new DrawTimeBars();

        Scene mainView = new Scene(mainUI.getView());
        stage.setScene(mainView);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}