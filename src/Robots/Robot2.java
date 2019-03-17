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

    
    
    public Robot2(Robot robot, City city, int xstantte, int ystante) {
        this.robot = robot;
        this.city = city;
        this.xstantte = xstantte;
        this.ystante = ystante;
//        this.xrobot = xrobot;
//        this.yrobot = yrobot;
    }

    public Robot2(Robot robot, City city) {
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

    public void fila(int num_disp_cola) {
        while (robot.frontIsClear() != false) {
            robot.move();
        }
        mira_abajo();
        mover(1);
        girar(1);
        if (!robot.frontIsClear()) {
            girar(3);
            mover(1);
            girar(1);
        }
        mira_abajo();
        mover(num_disp_cola);
    }

    @Override
    public void run(){
        while(robot.getAvenue() > xstantte ){
            robot.move();
            if(robot.getStreet()==1 && xstantte==1 && robot.canPickThing()){
               robot.pickThing();
               girar(2);
                while(robot.frontIsClear()){
                    robot.move();
                }
                robot.putThing();
                girar(2);
                while(robot.frontIsClear()){
                    robot.move();
                }
                try{
                    robot.pickThing();
                }catch(Exception e){
                    System.out.println("no hay estante para recoger");           
                }
                girar(3);
                while(robot.frontIsClear()){
                    robot.move();
                }
                    girar(3);

            }
            
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

    
    public void runprueba() {
        if (true) {
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
                        sleep((int) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        ;
                    }
                }
            }
        }
    }
//tal vez sirva para mover ciertos pasos (aun no lo considero necesaria )
//ninguna de las dos funciones siguientes son necesarias en realodas
    public void run(int pasos) {
        if (true) {
            ArrayList<Integer> avenidas = new ArrayList<>();
            ArrayList<Integer> caies = new ArrayList<>();
            for (int i = 0; i < pasos; i++) {
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
                        sleep((int) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        ;
                    }
                }
            }
        }
    }

    public void run2() {
        for (int i = 0; i < 2; i++) {
            robot.turnLeft();
        }
        for (int i = 0; i < 10; i++) {
            robot.move();
        }

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

//    public int getYrobot() {
//        return yrobot;
//    }
//
//    public void setYrobot(int yrobot) {
//        this.yrobot = yrobot;
//    }









    /*public void mover_robotsac(String nombre){
        while (robot[posicion].getStreet() != buscar_streetsacar(nombre)) {
                robot[posicion].move();
            }
            if (robot[posicion].getAvenue() == buscar_avenuesacar(nombre)) {
                mira_este(posicion);
            }
            if (robot[posicion].getAvenue() > buscar_avenuesacar(nombre)) {
                girar(1, posicion);
                while (robot[posicion].getAvenue() != buscar_avenuesacar(nombre)) {
                    robot[posicion].move();
                }
                mira_este(posicion);
            } else {
                giroDerecha(posicion);
                while (robot[posicion].getAvenue() != buscar_avenuesacar(nombre)) {
                    robot[posicion].move();
                }
                mira_este(posicion);
            }
    }
    
    public void mover_robot(int posicion, String nombre){
        while (robot[posicion].getStreet() != buscar_streetingresar(nombre)) {
                robot[posicion].move();
            }
            if (robot[posicion].getAvenue() == buscar_avenueingresar(nombre)) {
                mira_este(posicion);
            }
            if (robot[posicion].getAvenue() > buscar_avenueingresar(nombre)) {
                girar(1, posicion);
                while (robot[posicion].getAvenue() != buscar_avenueingresar(nombre)) {
                    robot[posicion].move();
                }
                mira_este(posicion);
            } else {
                giroDerecha(posicion);
                while (robot[posicion].getAvenue() != buscar_avenueingresar(nombre)) {
                    robot[posicion].move();

                }
                mira_este(posicion);
            }
    }
    
    public void movimiento_robotsac(String nombre, int num_disp_cola) {
        for (int i = 0; i < 9; i++) {
            if (robot[i].getStreet() == 7) {
                mover_robotsac(i, nombre);
                puestosi[i][0] = robot[i].getStreet();
                puestosi[i][1] = robot[i].getAvenue();
                recoger(i);
                fila(i,num_disp_cola);
                return;
            } 
        }
    }
    
    public void mover_envio(){
        int ubicacion = robot.getAvenue();
        mover(1);
        giroDerecha();
        while(robot.getAvenue() != 11){
            robot.move();
        }
        giroDerecha();
        while(robot.getStreet() != 12){
            robot.move();
        }
        recoger();
        girar(2);
        while(robot.getStreet() != 0){
            robot.move();
        }
        robot.putThing();
        girar(2);
        while(robot.getStreet() != 6){
            robot.move();
        }
        giroDerecha();
        while(robot.getAvenue() != ubicacion){
            robot.move();
        }
        girar(1);
        mover(1);
        girar(2);
    }
    
    public void movimiento_envio() {
        for (int i = 0; i < 9; i++) {
            if (robot.getStreet() == 7) {
                mover_envio(i);
                return;
            } 
        }
    }*/
}
