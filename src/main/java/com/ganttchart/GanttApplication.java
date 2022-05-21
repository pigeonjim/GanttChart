package com.ganttchart;

import javafx.application.Application;
import javafx.stage.Stage;


public class GanttApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        IOLogic dbIO = new IOLogic();
        dbIO.openConnection();
        dbIO.closeConnection();



    }

    public static void main(String[] args) {
        launch();
    }

}