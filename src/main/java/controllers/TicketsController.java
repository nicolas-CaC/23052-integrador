package controllers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.TicketsService;


@WebServlet(name = "TicketsController", urlPatterns = {"/api/tickets"})
public class TicketsController extends HttpServlet {

    TicketsService ticketsService = new TicketsService();
    
    @Override
    protected void doGet(
            HttpServletRequest req, 
            HttpServletResponse res) 
            throws ServletException, IOException {
        
        try {
            String tickets = ticketsService.getTickets();
            enviar(res, tickets);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

    }

    
    
    @Override
    protected void doPost(
            HttpServletRequest req, 
            HttpServletResponse res) 
            throws ServletException, IOException {
    
        try {
            String body = bodyToString(req.getInputStream());
            String result = ticketsService.postTicket(body);
            enviar(res, result);
        } 
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
    
    // Private
    
    private String bodyToString(InputStream inputStream){
        
        Scanner scanner = new Scanner(inputStream, "UTF-8");
        return scanner.hasNext() 
                ? scanner.useDelimiter("\\A").next()
                : "";
    }

    private void enviar(HttpServletResponse res, String json) throws IOException{
        
        PrintWriter out = res.getWriter();
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        out.print(json);
        out.flush();
    }
    

}
