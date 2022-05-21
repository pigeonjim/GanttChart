module com.ganttchart.ganttchart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ganttchart.ganttchart to javafx.fxml;
    exports com.ganttchart.ganttchart;
    exports com.ganttchart;
    opens com.ganttchart to javafx.fxml;
}