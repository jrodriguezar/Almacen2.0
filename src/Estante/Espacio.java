package Estante;

/**
 *
 * @author Jhon
 */

public class Espacio {
    
     private Producto producto;
     
    public Espacio(Producto producto) {
        this.producto = producto;
    }
    
    public Espacio() {
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto productoy) {
        producto = productoy;
    }
}
