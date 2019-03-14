package BussinesLogic;

import Estante.Producto;
import java.util.ArrayList;

/**
 *
 * @author CARITO
 */
public class Factura {
    private ArrayList<Producto> productos;

    public Factura() {
        this.productos = new ArrayList<>();
    }
    
    
    public double valor(ArrayList<Producto> productos){
        int valor=0;
        for (int i = 0; i < productos.size(); i++) {
            valor+= productos.get(i).getValor();
            
        }
        return valor;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public void imprimirfact() {
        for (int i = 0; i < this.productos.size(); i++) {
            System.out.println("productos:              valor:  ");
            System.out.println(this.productos.get(i).getDescripcion() +"                "+ this.productos.get(i).getValor());
         }
        System.out.println("el total a pagar es: "+valor(this.productos));
    }
}
