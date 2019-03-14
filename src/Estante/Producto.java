package Estante;

/**
 *
 * @author Jhon
 */

public class Producto {
    
    private double valor;
    private String descripcion;
    
    public Producto(String descripcion, int valor){
        this.valor = valor;
        this.descripcion = descripcion;
    }
    
    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
