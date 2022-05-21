package com.ganttchart;

import java.sql.*;

public class IOLogic {

    private Connection connection;

    public void openConnection() throws SQLException{
        String hTwoDB = "jdbc:h2:~/test";

        //jdbc:h2:file:
        String username = "sa";
        String password = "";

        connection = DriverManager.getConnection(hTwoDB, username, password);



        connection.close();
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() throws SQLException{
        if(!connection.isClosed()){
            connection.close();
        }
    }
}
