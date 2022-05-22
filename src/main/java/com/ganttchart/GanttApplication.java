package com.ganttchart;

import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.time.LocalDate;


public class GanttApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        IOLogic dbIO = new IOLogic();
        try{
            dbIO.createInMemDB();
        } catch (SQLException e){
            System.out.println(e.getErrorCode() + " " + e.getCause());
        }
        try{
            dbIO.insertARow("Task 1", LocalDate.of(2022,05,15), 45);
            dbIO.insertARow("Task 2", LocalDate.of(2022,06,15), 30);
            dbIO.insertARow("Task 3", LocalDate.of(2022,07,15), 15);
        } catch (SQLException e){
            System.out.println(e.getErrorCode() + " " + e.getCause());
        }
        try{
            dbIO.showAll();
        } catch (SQLException e){
            System.out.println(e.getErrorCode() + " " + e.getCause());
        }


        //dbIO.closeConnection();



    }

    public static void main(String[] args) {
        launch();
    }

}