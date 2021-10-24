package com.otus.pantikov.dz3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Curator {

    public static final String CREATE_CURATOR_SQL = "CREATE TABLE curator(id int auto_increment primary key, fio varchar (60));";

    public void createCuratorTable (Connection connection) throws SQLException{
        try (Statement statement = connection.createStatement()){
            statement.execute(CREATE_CURATOR_SQL);
        }
    }

    private static final String INSERT_INTO_CURATOR = "INSERT INTO curator (fio) VALUES(?),(?),(?),(?)";

    public void insertDateIntoCurator (Connection connection) throws SQLException {
        try ( PreparedStatement statement = connection.prepareStatement(INSERT_INTO_CURATOR)) {
            statement.setString(1,"Ivan Vladimirovich");
            statement.setString(2,"Ivan Petrovich");
            statement.setString(3,"Pavel Petrovich");
            statement.setString(4,"Ilya Vladimirovich");
            int numberRecords = statement.executeUpdate();
            System.out.println("Количество записей в таблице куратор: " + numberRecords);

        }
    }

    public void createCuratorTable() {

    }
    public void insertDateIntoCurator() {
    }
}
