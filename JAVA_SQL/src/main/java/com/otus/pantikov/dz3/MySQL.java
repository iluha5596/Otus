package com.otus.pantikov.dz3;

import java.sql.*;

import static com.otus.pantikov.dz3.Group.CREATE_GROUP_SQL;
import static com.otus.pantikov.dz3.Student.CREATE_STUDENT_SQL;

public class MySQL {

    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/otus";
    private static final String USER = "root";
    private static final String PASSWORD = "qwerty123";



    public static void main(String[] arg) throws SQLException {





        try (Connection connection = DriverManager.getConnection(CONNECTION_URL,USER,PASSWORD)) {
            createCuratorTable(connection);
            insertDateIntoCurator(connection);
//            mySQL.createGroup(connection);
//            mySQL.createStudent(connection);

//            mySQL.insertDateIntoStudent(connection);
        }

    }

    private static void createCuratorTable(Connection connection) {
    }

    private static void insertDateIntoCurator(Connection connection) {
    }


}
