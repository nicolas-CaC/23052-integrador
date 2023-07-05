package models;

import enums.Categoria;

public class Ticket {

    private int id, cantidad;
    private String nombre, apellido, correo;
    private Categoria categoria;

    public Ticket(int id, String nombre, String apellido, String correo, int cantidad, String categoria) {
        System.out.println("ESTEE");
        this.id = id;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.categoria = setCategoria(categoria);
    }
    
    public Ticket (String nombre, String apellido, String correo, int cantidad, String categoria){
        System.out.println("ESTEE");
        this.id = 0;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.cantidad = cantidad;
        this.categoria = setCategoria(Integer.parseInt(categoria));
    }
    
    // Getters

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
    
    // Private
    
    private Categoria setCategoria(String categoria){
        
        switch(categoria){
            case "Categoria A":
                return Categoria.A;
            case "Categoria B":
                return Categoria.B;
            case "Categoria C":
                return Categoria.C;
            default:
                return Categoria.C;
        }
    }
    
    private Categoria setCategoria(int categoria){
        System.out.println("INTCAT"+categoria);
        switch(categoria){
            case 1:
                return Categoria.A;
            case 2:
                return Categoria.B;
            case 3:
                return Categoria.C;
            default:
                return Categoria.C;
        }
    }
    
}
