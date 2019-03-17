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
    private int xstantte;
    private int ystante;
    private int xrobot;
    private int yrobot;

    public Robot2(Robot robot, City city) {
        this.robot = robot;
        this.city = city;
        this.xstantte = xstantte;
        this.ystante = ystante;
    }

    public Robot2(Robot robot, City city, int xrobot, int yrobot) {
        this.robot = robot;
        this.city = city;
        this.xrobot = xrobot;
        this.yrobot = yrobot;
    } 

    public Robot2(Robot robot, City city, int xstantte, int ystante, int xrobot, int yrobot) {
        this.robot = robot;
        this.city = city;
        this.xstantte = xstantte;
        this.ystante = ystante;
        this.xrobot = xrobot;
        this.yrobot = yrobot;
    }

    public void mover(int pasos) {
        for (int i = pasos; i > 0; i--) {
            robot.move();
        }
    }

    public void girar(int giros) {
        for (int i = giros; i > 0; i--) {
            robot.turnLeft();
        }
    }

    public void giroDerecha() {
        girar(3);
    }

    public void recoger() {
        if (robot.canPickThing()) {
            robot.pickThing();
        }
    }

    public void mira_este() {
        while (robot.getDirection() != Direction.EAST) {
            robot.turnLeft();
        }
    }

    public void mira_abajo() {
        while (robot.getDirection() != Direction.SOUTH) {
            robot.turnLeft();
        }
    }

    @Override
    public void run() {
        while (robot.getStreet() > xstantte) {
            robot.move();
        }
        //se mueve al x indicado
        if (robot.getAvenue() == xstantte) {
            mira_este();
        }
        if (robot.getAvenue() > xstantte) {
            girar(1);
            while (robot.getAvenue() > xstantte) {
                robot.move();
            }
            mira_este();
        } else {
            mira_este();
            while (robot.getAvenue() < xstantte) {
                robot.move();
            }
            try {
                robot.pickThing();
            } catch (Exception e) {
                System.out.println("no hay estante para recoger");

            }
            mira_abajo();
            while (robot.getStreet() != 12 - 2) {//n
                robot.move();
            }
            mira_este();
            while (robot.getAvenue() != 13) {
                robot.move();
            }
            mira_abajo();
            while (robot.getStreet() < 13) {
                robot.move();
            }
            girar(7);
            while (robot.getAvenue() != -1) {
                robot.move();
            }
            girar(3);
            robot.move();
            girar(3);
            while (robot.getAvenue() != xrobot) {
                robot.move();
            }
            girar(3);
            while(robot.frontIsClear()) {
                robot.move();
            }
            girar(2);
        }
    }
    
    public boolean revisar(ArrayList<Integer> avenidas, ArrayList<Integer> caies) {
        avenidas = new ArrayList<>();
        caies = new ArrayList<>();
        for (Robot r : this.city.examineRobots()) {
            avenidas.add(r.getAvenue());
            caies.add(r.getStreet());
        }
        switch (robot.getDirection()) {
            case NORTH:
                for (int i = 0; i < avenidas.size(); i++) {                       
                    if (caies.get(i).equals(robot.getStreet()-1) && avenidas.get(i).equals(robot.getAvenue())) {
                        System.out.println("true arriba");
                        return true;
                    }
                }
                break;

            case SOUTH:
                for (int i = 0; i < avenidas.size(); i++) {                     
                    if (caies.get(i).equals(robot.getStreet()+1) && avenidas.get(i).equals(robot.getAvenue())) {
                        System.out.println("true abajo");
                        return true;
                    }
                }
                break;

            case WEST:
                for (int i = 0; i < avenidas.size(); i++) {                     
                    if (caies.get(i).equals(robot.getStreet()) && avenidas.get(i).equals(robot.getAvenue()-1)) {
                        System.out.println("true abajo");
                        return true;
                    }
                }                
                break;

            case EAST:
                for (int i = 0; i < avenidas.size(); i++) {                     
                    if (caies.get(i).equals(robot.getStreet()) && avenidas.get(i).equals(robot.getAvenue()+1)) {
                        System.out.println("true abajo");
                        return true;
                    }
                }                
                break;
        }
        return false;
    }

//getters and setters
    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getXstantte() {
        return xstantte;
    }

    public void setXstantte(int xstantte) {
        this.xstantte = xstantte;
    }

    public int getYstante() {
        return ystante;
    }

    public void setYstante(int ystante) {
        this.ystante = ystante;
    }

    public int getXrobot() {
        return xrobot;
    }

    public void setXrobot(int xrobot) {
        this.xrobot = xrobot;
    }
}
