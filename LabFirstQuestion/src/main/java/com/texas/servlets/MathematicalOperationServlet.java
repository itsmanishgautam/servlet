package com.texas.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MathematicalOperationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int sum = num1 + num2;

        // Set the sum as an attribute in the request
        request.setAttribute("sum", sum);

        // Forward the request to result.jsp
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}















////package com.texas.servlets;
////
////import jakarta.servlet.Servlet;
////
////public class MathematicalOperationServlet  implements Servlet{
////{
////
////}
//
//
//
//package com.texas.servlets;
//
//import java.io.IOException;
//
//
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class MathematicalOperationServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//        int sum = num1 + num2;
//
//        // Set the sum as an attribute in the request
//        request.setAttribute("sum", sum);
//
//        // Forward the request to result.jsp
//        request.getRequestDispatcher("result.jsp").forward(request, response);
//    }
//}
