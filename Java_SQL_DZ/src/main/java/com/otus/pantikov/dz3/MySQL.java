package com.otus.pantikov.dz3;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class MySQL {

    //Куратор
    public static final String create_curator_sql = "CREATE TABLE curator(id_person int auto_increment primary key, fio_curator varchar (60));";
    public void createCuratorTable(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.execute(create_curator_sql);
        }
    }
    public void insertDateIntoCurator(String fio_curator) throws SQLException {
        String insert_into_curator = "INSERT INTO curator (fio_curator) VALUES(?)";
        try (Connection connection= DriverManager.getConnection(Connect.CONNECTION_URL, Connect.USER, Connect.PASSWORD);
             PreparedStatement statement = connection.prepareStatement(insert_into_curator)) {
            statement.setString(1, fio_curator);
            statement.executeUpdate();
        }
    }
    //Студенты
    public static final String create_student_sql = "CREATE TABLE student(id_student int auto_increment primary key, fio_student varchar (60), sex varchar (10), id_group int);";
    public void createStudent(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.execute(create_student_sql);
        }
    }
    public void insertDataIntoStudent(String fio_student, String sex, int id_group) throws SQLException {
        String insert_into_student = "INSERT INTO student (fio_student, sex, id_group) VALUES(?,?,?)";
        try (Connection connection= DriverManager.getConnection(Connect.CONNECTION_URL, Connect.USER, Connect.PASSWORD);
             PreparedStatement statement = connection.prepareStatement(insert_into_student)) {
            statement.setString(1, fio_student);
            statement.setString(2, sex);
            statement.setInt(3, id_group);
            statement.executeUpdate();
        }
    }
    //Группы
    public static final String create_group_sql = "CREATE TABLE groupp(id_groupp int auto_increment primary key, name varchar (60), id_curator varchar (5));";
    public void createGroup(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.execute(create_group_sql);
        }
    }
    public void insertDataIntoGroup(String name, int id_curator) throws SQLException {
        String insertGroup = "INSERT INTO groupp(name, id_curator) VALUES(?,?)";
        try (Connection connection= DriverManager.getConnection(Connect.CONNECTION_URL, Connect.USER, Connect.PASSWORD);
             PreparedStatement statement = connection.prepareStatement(insertGroup)) {
            statement.setString(1, name );
            statement.setInt(2, id_curator);
            statement.executeUpdate();
        }
    }
    //Вывести на экран информацию о всех студентах включая название группы и имя куратора
    private static final String selectSqlStudentGroupCurator ="SELECT otus.student.fio_student, otus.student.sex, otus.groupp.name, otus.curator.fio_curator\n" +
            "FROM otus.groupp join otus.curator ON id_curator = id_person\n" +
            "join otus.student ON id_group = id_groupp";
    public void listStudentGroupCurator (Connection connection) throws SQLException {
        System.out.println("Вывести на экран информацию о всех студентах включая название группы и имя куратора: ");
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSqlStudentGroupCurator)) {
            while (resultSet.next()) {
                String FIO_Student = resultSet.getString(1);
                String Sex = resultSet.getString(2);
                String Name = resultSet.getString(3);
                String FIO_Curator = resultSet.getString(4);

                String row = String.format("FIO_Student: %s, Sex: %s, Name: %s, FIO_Curator: %s", FIO_Student, Sex, Name, FIO_Curator);
                System.out.println(row);
            }
        }
    }
    //Вывести на экран количество студентов
    public static final  String selectSqlNumberStudent = "SELECT COUNT(*) as count FROM otus.student";
    public void numberStudents (Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSqlNumberStudent)) {
            while (resultSet.next()) {

                int row = resultSet.getInt(1);
                System.out.println("Количество студентов: " +  row);
            }
        }
    }
    //Вывести студенток
    public static final  String selectSqlFemaleStudent = "SELECT * FROM otus.student where sex = 'W'";
    public void femaleStudent  (Connection connection) throws SQLException {
        System.out.println("Вывести студенток: ");
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSqlFemaleStudent)) {
            while (resultSet.next()) {
                int ID_Students = resultSet.getInt(1);
                String FIO_Students = resultSet.getString(2);
                String Sex = resultSet.getString(3);
                int ID_Group = resultSet.getInt(4);

                String row = String.format("id_student: %s, fio_student: %s, sex: %s, id_group: %s", ID_Students, FIO_Students, Sex, ID_Group);
                System.out.println(row);
            }
        }
    }
    //Вывести список групп с их кураторами
    public static final  String selectListGroupListCurator = "SELECT  name, fio_curator FROM otus.groupp INNER JOIN otus.curator ON id_curator = id_person";
    public void listGroupCurator  (Connection connection) throws SQLException {
        System.out.println("Вывести список групп с их кураторами: ");
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectListGroupListCurator)) {
            while (resultSet.next()) {
                String Name = resultSet.getString(1);
                String FIO_Curator = resultSet.getString(2);

                String row = String.format("Name: %s, fio_student: %s", Name, FIO_Curator);
                System.out.println(row);
            }
        }
    }
    //Вывести список групп с их кураторами
    public static final  String selectStudentGroup = "SELECT otus.student.fio_student, otus.groupp.name FROM otus.student, otus.groupp WHERE groupp.name = 'group2'";
    public void listStudentGroup  (Connection connection) throws SQLException {
        System.out.println("Вывести на экран студентов из определенной группы(поиск по имени группы): ");
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectStudentGroup)) {
            while (resultSet.next()) {
                String FIO_Student = resultSet.getString(1);
                String Name = resultSet.getString(2);

                String row = String.format("FIO_Student: %s, Name: %s", FIO_Student, Name);
                System.out.println(row);
            }
        }
    }
    //Обновить данные по группе сменив куратора
    public static final  String UpdateGroup = "UPDATE otus.groupp SET id_curator = 4 WHERE id_groupp = 3";
    public void updateGroupp  (Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            int res  = statement.executeUpdate(UpdateGroup);
            System.out.println("Обновление данных по группе сменив куратора" + res);
        }
    }


}



