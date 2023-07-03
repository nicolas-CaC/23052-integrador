package enums;


public enum Categoria {
    
    A("Categoria A", 1),
    B("Categoria B", 2),
    C("Categoria C", 3);
    
    private String nombre;
    private int codigo;

    private Categoria(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }
    
    
}
