package daos;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class TicketsDaoMysql {

    Conexion conexion = new Conexion();
    Connection connect = conexion.getConnection();
    
    PreparedStatement ps;
    ResultSet rs;
    
    public LinkedList getTickets() throws SQLException{
        
        LinkedList tickets = new LinkedList();
        ps = connect.prepareStatement("SELECT * FROM clientes;");
        rs = ps.executeQuery();
        
//        while(rs.next()){
//            Ticket ticket = 
//        }
        
        return tickets;
    }

    
    
}
