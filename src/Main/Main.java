package Main;

import almacen.Pruebalmacen;
import java.util.Scanner;

/**
 *
 * @author Jhon
 */
public class Main {

    public static void main(String[] args) {
        Pruebalmacen almacen = new Pruebalmacen();
        int u = 0;
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Escoja una opción:  ");
            System.out.println("1:Ingresar un nuevo producto");
            System.out.println("2:Realizar pedido");
            System.out.println("3:terminar la op");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    almacen.ingresar_productoal();
                    break;
                case 2:
                    almacen.sacar_estante();
                    break;
                default:
                    System.out.println("lo sentimos esa opcion no esta en el menu");
                    break;
            }
        } while (op != 3);
    }

}
