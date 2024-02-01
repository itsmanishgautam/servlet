package com.texas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve values from the form submission
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");

        // Print the values to the console (you can replace this with your desired action)
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);

        // Set a response content type
        response.setContentType("text/html");

        // Get the PrintWriter object to write the response
        PrintWriter out = response.getWriter();

        // Write the values as a response
        out.println("<html><body>");
        out.println("<h2>Received User Information:</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Phone Number: " + phoneNumber + "</p>");
        out.println("</body></html>");
    }
}
