package daos;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import models.Ticket;

public class TicketsDaoMysql {

    Conexion conexion = new Conexion();
    Connection connect = conexion.getConnection();
    
    PreparedStatement ps;
    ResultSet rs;
    
    public LinkedList getTickets() throws SQLException{
        
        LinkedList tickets = new LinkedList();
        ps = connect.prepareStatement("SELECT * FROM tickets;");
        rs = ps.executeQuery();
        
        while(rs.next()){
            
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String correo = rs.getString("correo");
            int cantidad = rs.getInt("cantidad");
            String categoria = rs.getString("categoria");
            
            Ticket ticket = new Ticket(id, nombre, apellido, correo, cantidad, categoria);
            tickets.add(ticket);
        }
        return tickets;
    }
    
    public Boolean postTicket(Ticket ticket) throws SQLException{
        System.out.println(ticket.getId());
        System.out.println(ticket.getNombre());
        System.out.println(ticket.getApellido());
        System.out.println(ticket.getCorreo());
        System.out.println(ticket.getCantidad());
        System.out.println(ticket.getCategoria());
        try{
            ps = connect.prepareStatement("INSERT INTO tickets(nombre, apellido, correo, cantidad, categoria) VALUES (?,?,?,?,?)");
            ps.setString(1, ticket.getNombre());
            ps.setString(2, ticket.getApellido());
            ps.setString(3, ticket.getCorreo());
            ps.setInt(4, ticket.getCantidad());
            ps.setInt(5, ticket.getCategoria().getCodigo());
            ps.execute();
            return false;
        }
        catch(SQLException e){
            System.out.println(e.toString());
            return true;
        }
    }

    
    
}
