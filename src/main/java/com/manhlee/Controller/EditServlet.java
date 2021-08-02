package com.manhlee.Controller;

import com.manhlee.dao.StudentDao;
import com.manhlee.model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EditServlet", value = "/edit")
public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Student student = StudentDao.findStudentById(id);
        request.setAttribute("student", student);
        request.getRequestDispatcher("/editpage.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("studentName");
        String email = request.getParameter("email");
        String rank = request.getParameter("rank");
        StudentDao.updateStudent(id,name,email,rank);
        response.sendRedirect("./");
    }
}
