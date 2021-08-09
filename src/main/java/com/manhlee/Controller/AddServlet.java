package com.manhlee.Controller;

import com.manhlee.dao.StudentDao;
import com.manhlee.model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddServlet", value = "/teacher/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student = new Student();
        student.setName(request.getParameter("studentName"));
        student.setEmail(request.getParameter("email"));
        student.setRank(request.getParameter("rank"));
        StudentDao.insertStudent(student);
        response.sendRedirect("./");
    }
}
