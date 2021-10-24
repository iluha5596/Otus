package com.otus.pantikov.dz3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
    public static final String CREATE_STUDENT_SQL = "CREATE TABLE student(id int auto_increment primary key, fio varchar (60), sex varchar (10), id_group int);";

    public void createStudent (Connection connection) throws SQLException{
        try (Statement statement = connection.createStatement()){
            statement.execute(CREATE_STUDENT_SQL);
        }
    }

    private static final String INSERT_INTO_STUDENT = "INSERT INTO curator (fio) VALUES(?),(?),(?),(?)";

    public void insertDateIntoStudent (Connection connection) throws SQLException {
        try ( PreparedStatement statement = connection.prepareStatement(INSERT_INTO_STUDENT)) {
            statement.setString(1,"Ivan Vladimirovich");
            statement.setString(2,"Ivan Petrovich");
            statement.setString(3,"Pavel Petrovich");
            statement.setString(4,"Ilya Vladimirovich");
            int numberRecords = statement.executeUpdate();
            System.out.println("Количество записей в таблице куратор: " + numberRecords);

        }
    }
}
