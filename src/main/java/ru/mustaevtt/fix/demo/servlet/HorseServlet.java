package ru.mustaevtt.fix.demo.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import ru.mustaevtt.fix.demo.service.HorseService;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HorseServlet extends HttpServlet {
    @Autowired
    private HorseService horseServletService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
    String widthString= req.getParameter("width");
    String heightString=req.getParameter("height");
    String start=req.getParameter("start");
    String end=req.getParameter("end");
        try {
            PrintWriter writer = resp.getWriter();
            writer.write(String.valueOf(horseServletService.count(Integer.parseInt(widthString), Integer.parseInt(heightString), start, end)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

