package controllers;

import daos.TicketsDaoMysql;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.TicketsService;


@WebServlet(name = "ReservasController", urlPatterns = {"/api/reservas"})
public class ReservasController extends HttpServlet {

    private final TicketsService ticketsService = new TicketsService();
    private final TicketsDaoMysql DAO = TicketsDaoMysql.getInstance();

    @Override
    protected void doGet(
            HttpServletRequest req, 
            HttpServletResponse res) 
            throws ServletException, IOException {
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("./../listado.jsp");
        dispatcher.forward(req, res);
    }
   
    
}
