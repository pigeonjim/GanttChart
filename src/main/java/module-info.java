module com.ganttchart.ganttchart {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    exports com.ganttchart;
    opens com.ganttchart to javafx.fxml;
}