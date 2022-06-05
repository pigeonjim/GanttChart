package com.ganttchart;

import javafx.collections.ObservableMap;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.time.LocalDate;

public class DrawTimeBars {
    private ScrollPane scrollPane;

    public DrawTimeBars(){

    }

    public Parent getView(){

        scrollPane = new ScrollPane();

        return scrollPane;
    }

}
