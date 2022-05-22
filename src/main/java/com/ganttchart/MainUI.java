package com.ganttchart;

import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class MainUI {
    private BorderPane mainView;
    private HBox topBox;
    private VBox rhsBox;
    private DrawTimeBars barBox;
    private AllTasks allTasks;

    public MainUI(AllTasks allTasks){
        this.topBox = new HBox();
        this.rhsBox = new VBox();
        this.mainView = new BorderPane();
        this.barBox = new DrawTimeBars();
        this.allTasks = allTasks;
    }

    public Parent getView(){
        mainView.setRight(rhsBox);
        mainView.setTop(topBox);
        mainView.setCenter(barBox.getView());
        return mainView;
    }

}
