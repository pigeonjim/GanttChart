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
    private BarChart<Number, String> gantt;
    private CategoryAxis taskYs;
    private NumberAxis datesX;
    private XYChart.Series theBars;
    public DrawTimeBars(){
        taskYs = new CategoryAxis();
        datesX = new NumberAxis();
        theBars = new XYChart.Series();
        gantt = new BarChart<>(datesX,taskYs);
    }

    public Parent getView(){
        gantt.setLegendVisible(false);
        gantt.setScaleX(1);
        createBar("day1", 45);
        createBar("day2", 45);
        createBar("day3", 150);
        gantt.getData().add(theBars);
        scrollPane = new ScrollPane(gantt);

        return scrollPane;
    }

    public void createBar(String taskName, int daysToComplete){
    theBars.getData().add(new XYChart.Data(daysToComplete, taskName));
    theBars.toString();
    }

    public BarChart<Number, String> getGantt() {
        return gantt;
    }

    public XYChart.Series getTheBars() {
        return theBars;
    }
}
