package com.manhlee.dao;

import com.manhlee.connection.JDBCConnection;
import com.manhlee.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    static Connection connection = null;
    static PreparedStatement pstmt= null;
    public static List<Student> findAll(){
        List<Student> studentList = new ArrayList<>();
        String sql = "SELECT * FROM STUDENT";
        try{
            connection = JDBCConnection.openConnection();
            pstmt = connection.prepareStatement(sql);
            ResultSet resultSet = pstmt.executeQuery();

            while (resultSet.next()){
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setEmail(resultSet.getString("email"));
                student.setRank(resultSet.getString("rank"));
                studentList.add(student);
            }
            resultSet.close();
            pstmt.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return studentList;
    }
    public static void deleteStudentById(String id){
        String query= "DELETE FROM STUDENT WHERE ID =?";

        try {
            connection = JDBCConnection.openConnection();
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
            pstmt.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static Student findStudentById(String id){
        String query = "SELECT * FROM STUDENT WHERE ID =?";

        try {
            connection = JDBCConnection.openConnection();
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1,id);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()){
                return new Student(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("rank"));
            }
            resultSet.close();
            pstmt.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void updateStudent(String id, String name, String email, String rank){
        String query = "UPDATE STUDENT SET `name` =?, email=?, `rank`=? WHERE id=?";

        try {
            connection = JDBCConnection.openConnection();
            pstmt= connection.prepareStatement(query);
            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setString(3,rank);
            pstmt.setString(4,id);
            pstmt.executeUpdate();
            pstmt.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void insertStudent(String name, String email, String rank){
        String query = "INSERT INTO student (`name`, `email`, `rank`) VALUES (?, ?, ?)";
        try {
            connection = JDBCConnection.openConnection();
            pstmt= connection.prepareStatement(query);
            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setString(3,rank);
            pstmt.executeUpdate();
            pstmt.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
