package com.manhlee.Controller;

import com.manhlee.helper.ConnectionPool;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "TestConnectionPoolServlet", value = "/test")
public class TestConnectionPoolServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection= pool.getConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM STUDENT WHERE ID=5");
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()){
                System.out.println("Name: "+ resultSet.getString("name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            pool.freeConnection(connection);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
