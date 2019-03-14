package Robots;

import becker.robots.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhon
 */
public class Robot2 extends Thread {

    private Robot robot;
    private City city;

    public Robot2(Robot robot, City city) {
        this.robot = robot;
        this.city = city;
    }

    public boolean revisar(ArrayList<Integer> avenidas, ArrayList<Integer> caies) {//arreglar para que disponga cada una de las intersecciones y que estas intersecciones se vayan actualizando siempre y eliminando las anteriores
        avenidas = new ArrayList<>();
        caies = new ArrayList<>();
        for (Robot r : this.city.examineRobots()) {
            avenidas.add(r.getAvenue());
            caies.add(r.getStreet());
        }
        switch (robot.getDirection()) {
            case NORTH:
                if (caies.contains(robot.getStreet() - 1) && avenidas.contains(robot.getAvenue())) {
                    return true;
                }
            case SOUTH:
                if (caies.contains(robot.getStreet() + 1) && avenidas.contains(robot.getAvenue())) {
                    return true;
                }
            case WEST:
                if (caies.contains(robot.getStreet()) && avenidas.contains(robot.getAvenue() - 1)) {
                    return true;
                }
            case EAST:
                if (caies.contains(robot.getStreet()) && avenidas.contains(robot.getAvenue() + 1)) {
                    return true;
                }
        }
        return false;
    }
    
    public void run(boolean comprobar, int yoo) {
        if (comprobar == true) {
            ArrayList<Integer> avenidas = new ArrayList<>();
            ArrayList<Integer> caies = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                avenidas.clear();
                caies.clear();
                for (Robot r : this.city.examineRobots()) {
                    avenidas.add(r.getAvenue());
                    caies.add(r.getStreet());
                }
                for (int c : avenidas) {
                    System.out.println("numerin a " + c);
                }
                for (int w : caies) {
                    System.out.println("numerin c " + w);
                }
                System.out.println(revisar(avenidas, caies));
                robot.move();
                if (!revisar(avenidas, caies)) {
                    robot.move();
                } else {
                    for (int j = 0; j < 4; j++) {
                        robot.turnLeft();
                    }
                    
                }
            }
        }
    }
}