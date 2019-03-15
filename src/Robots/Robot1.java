package Robots;

import becker.robots.*;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class Robot1 extends Thread{
    
    private Robot robot;
    private City city;

    public Robot1(Robot robot, City city) {
        this.robot = robot;
        this.city = city;
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
    
    public void recoger(){
        if(robot.canPickThing()){
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
    
    public void fila(int num_disp_cola){
        while(robot.frontIsClear() != false){
            robot.move();
        }
        mira_abajo();
        mover(1);
        girar(1);
        if(!robot.frontIsClear()){
        girar(3);
        mover(1);
        girar(1);
        }
        mira_abajo();
        mover(num_disp_cola);
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

    public void run2(boolean comprobar) {
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
                    try {
                        sleep( (int)(Math.random() * 2600 ) );
                        } catch( InterruptedException e ) {
                            ;}
                }
            }
        }
    }
    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            robot.move();
        }
        
    }
}

