package sample;

import dbutil.dbConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class lonigmodel {
    Connection connection;

    public lonigmodel() {
        try {
            this.connection = dbConnection.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (this.connection == null) {
            System.exit(1);
        }
    }
    public boolean isDatabaseConnection(){
        return this.connection != null;
    }

    public boolean inDatabaseConnection() {
        return this.connection != null;
    }
}//class