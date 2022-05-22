package com.ganttchart;

import java.sql.*;
import java.time.LocalDate;

public class IOLogic {
    private Connection connection;

    public void createInMemDB() throws SQLException{
        String hTwoDB = "jdbc:h2:mem:";
        String username = "sa";
        String password = "";
        connection = DriverManager.getConnection(hTwoDB, username, password);

        String sqlQuery = "CREATE TABLE Tasks (taskName varchar(255)" +
                ", startDate Date NOT NULL DEFAULT '2022-01-01'" +
                ", daysToComplete int NOT NULL Default 1" +
                ", endDate Date" +
                ", description varchar" +
                ", taskType varchar(255)" +
                ", CHECK taskType IN " +
                "('GatherRequirements', 'ProduceDocuments', 'DataExport', 'DataCleanse', 'DataImport', 'Testing', 'UserTesting', 'Training')" +
                ", PRIMARY KEY (taskName, startDate))";
        Statement query =   connection.createStatement();
        query.executeUpdate(sqlQuery);
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() throws SQLException{
        if(!connection.isClosed()){
            connection.close();
        }
    }

    public void insertARow_NsdDtoC(String taskName, LocalDate startDate, int daysToComplete) throws SQLException{
        String sqlQuery = "INSERT INTO Tasks (taskName, startDate, daysToComplete) VALUES ('" +
                taskName + "', '" + Date.valueOf(startDate) + "', " + daysToComplete + ")";
        Statement query =   connection.createStatement();
        query.executeUpdate(sqlQuery);
    }

    public void showAll() throws SQLException {
        String sqlQuery = "SELECT * FROM Tasks";
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery(sqlQuery);
        while(results.next()){
            System.out.println(results.getString("taskName") + " "  +
                    results.getDate("startDate") + " " +
                    results.getInt("daysToComplete"));
        }
    }

}
