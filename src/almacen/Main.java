package almacen;

import java.util.Scanner;

/**
 *
 * @author Jhon
 */
public class Main {

    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        int u = 0;
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        while (op != 3) {
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
                    break;
            }
        }
    }

}
