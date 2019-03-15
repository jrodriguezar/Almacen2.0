package almacen;

import becker.robots.*;
import Robots.*;
import java.util.Scanner;

/**
 *
 * @author Jhon
 * 
 */
public class Pruebalmacen {

    private City lugar;
    private Robot robot1;
    private Robot robot2;

    public Pruebalmacen() {
        lugar = new City();
        robot1 = new Robot(lugar, 7, 2, Direction.NORTH, 0);
        robot2 = new Robot(lugar, 5, 4, Direction.WEST, 0);
    }

    public void iniciar1() {
        String ingresa = new String();
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese el valor");
        ingresa = e.next();
        int a = Integer.parseInt(ingresa);
        if (a == 1) {
            Robot2 hilo1 = new Robot2(robot1, lugar);
            hilo1.start();
            hilo1.setPriority(10);
            Robot2 hilo2 = new Robot2(robot2, lugar);
            hilo2.start();
        } else {
            Robot2 hilo2 = new Robot2(robot2, lugar);
            hilo2.start();
        }
    }

    public static void main(String[] args) {
        Pruebalmacen lug = new Pruebalmacen();
        lug.iniciar1();
    }
}
