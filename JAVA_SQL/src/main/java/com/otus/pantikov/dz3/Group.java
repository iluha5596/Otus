package com.otus.pantikov.dz3;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Group {
    public static final String CREATE_GROUP_SQL = "CREATE TABLE groupp(id int auto_increment primary key, name varchar (60), id_curator int);";

    public void createGroup (Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()){
            statement.execute(CREATE_GROUP_SQL);
        }
    }
}
