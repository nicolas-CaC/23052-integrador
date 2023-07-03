package models;

import enums.Categoria;

public class Ticket {

    private int id, cantidad;
    private String nombre, apellido, correo;
    private Categoria categoria;

    public Ticket(int id, int cantidad, String nombre, String apellido, String correo, Categoria categoria) {
        this.id = id;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    
    
}
