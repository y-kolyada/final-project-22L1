package com.ygorod.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

public class About extends HttpServlet {

    private static final long serialVersionUID = 1L;
     
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");       
        PrintWriter out = null;

        try {
            out = response.getWriter();
            out.println("<!DOCTYPE html><html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\" />");

            String title = "About project";

            out.println("<title>" + title + "</title>");
            out.println("</head>");
            out.println("<body bgcolor=\"white\">");
            out.println("<h1>Project info</h1>");
            out.println("<h2>Project team</h2>");
            out.println("<ul>");
            out.println("<li><a target=\"_blank\" href=\"https://github.com/y-kolyada\"> y-kolyada </a></li>");            
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }
}