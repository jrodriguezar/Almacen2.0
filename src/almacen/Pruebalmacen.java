package almacen;

import becker.robots.*;
import Robots.*;
/**
 *
 * @author Jhon
 */
public class Pruebalmacen {
    private City lugar;
    private Robot robot1;
    private Robot robot2;

    public Pruebalmacen() {
        lugar = new City();
        robot1 = new Robot(lugar, 7, 2, Direction.NORTH, 0);
        robot2 = new Robot(lugar, 5, 4, Direction.WEST, 0);
        //Robot ro = new Robot(lugar, 5, 1, Direction.WEST, 0);
    }
    
    public void iniciar1(){
        Robot1 hilo1 = new Robot1(robot1, lugar);
        hilo1.start();
        Robot2 hilo2 = new Robot2(robot2, lugar);
        hilo2.run(true,2);
    }
    
    public static void main(String[] args) {
        Pruebalmacen lug = new Pruebalmacen();
        lug.iniciar1();
    }   
}