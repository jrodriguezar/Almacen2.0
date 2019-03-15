package almacen;

import Robots.Robotamazon;
import Estante.Producto;
import BussinesLogic.Factura;
import Estante.Espacio;
import Estante.Estante;
import Robots.Robot1;
import Robots.Robot2;
import becker.robots.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jhon y Carito
 */

public class Almacen {
    private City almacen;
    private Robot empleado;
    private Robot[] robot;
    private Scanner teclado;
    private Estante[][] matriz;
    private int nfacturas;
    private ArrayList<Factura> facturas;
    private int[][] puestosi;
    
    public Almacen(){
        teclado = new Scanner(System.in);
        almacen = new City();
        
        int num = 1;
        int iter = 0;
        nfacturas = 0;
        facturas = new ArrayList<>();
        robot = new Robot[10];
        puestosi = new int[10][2];
        for (int i = 0; i < 11; i++) {
            Wall norte = new Wall(almacen, 0, i, Direction.NORTH);
        }
        for (int i = 0; i < 10; i++) {
            //Wall norte = new Wall(almacen, 0, i, Direction.NORTH);
            //pared izquierda
            if (i < 6) {
                Wall izqui = new Wall(almacen, i, 0, Direction.WEST);
            }
            
            if (i > 6 && i<8 ) {
                Wall izqui = new Wall(almacen, i, 0, Direction.WEST);
            }

            if (i < 2) {
                //pared derecha
                Wall derecha = new Wall(almacen, i, 10, Direction.EAST);
            }

            Wall sur_divisiones = new Wall(almacen, 7, i, Direction.EAST);
            Wall sur = new Wall(almacen, 7, i, Direction.SOUTH);
            //creo robots almacenadores
            Robotamazon robo = new Robotamazon();
            Robot reobot = new Robot(almacen, 7, i, Direction.NORTH, 0);
            reobot.setIcon(robo);
            reobot.setLabel("Robot" + " " + num);
            robot[iter] = reobot;
            num++;
            iter++;
        }

        Producto alimentos = new Producto("Alimento", 1000);
        Producto robotica = new Producto("Memoria", 2000);
        Producto maletas = new Producto("Maleta", 3000);
        Producto juguetes = new Producto("Munieco", 4000);
        Producto ropa1 = new Producto("Camisa", 5000);
        Producto ropa2 = new Producto("Pantalon", 6000);
        Producto robotica1 = new Producto("Chip", 7000);
        Producto maletas1 = new Producto("Bolso", 8000);
        Producto juguetes1 = new Producto("Munieca", 9000);        
        Producto alimento1 = new Producto("Frijol", 10000);
        
        Espacio[][] espacio1 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio1[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio1[i][j] = new Espacio(robotica);
                }
            }
        }
        
        Espacio[][] espacioz1 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioz1[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioz1[i][j] = new Espacio(robotica);
                }
            }
        }
            
        Espacio[][] espacio2 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio2[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio2[i][j] = new Espacio(alimentos);
                }
            }
        }
        
        Espacio[][] espacioz2 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioz2[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioz2[i][j] = new Espacio(alimentos);
                }
            }
        }
        
        Espacio[][] espacio3 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio3[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio3[i][j] = new Espacio(maletas);
                }
            }
        }
        
        Espacio[][] espacioz3 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioz3[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioz3[i][j] = new Espacio(maletas);
                }
            }
        }
        
        Espacio[][] espacio4 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio4[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio4[i][j] = new Espacio(juguetes);
                }
            }
        }
        
        Espacio[][] espacioz4 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioz4[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioz4[i][j] = new Espacio(juguetes);
                }
            }
        }
        
        Espacio[][] espacio5 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio5[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio5[i][j] = new Espacio(ropa1);
                }
            }
        }
        
        Espacio[][] espacioz5 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioz5[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioz5[i][j] = new Espacio(ropa1);
                }
            }
        }
        
        Espacio[][] espacio6 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio6[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio6[i][j] = new Espacio(ropa2);
                }
            }
        }
        
        Espacio[][] espacioz6 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioz6[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioz6[i][j] = new Espacio(ropa2);
                }
            }
        }
        
        Espacio[][] espacio7 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio7[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio7[i][j] = new Espacio(robotica1);
                }
            }
        }
        
        Espacio[][] espacioz7 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioz7[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioz7[i][j] = new Espacio(robotica1);
                }
            }
        }
        
        Espacio[][] espacio8 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio8[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio8[i][j] = new Espacio(maletas1);
                }
            }
        }
        
        Espacio[][] espacioz8 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioz8[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioz8[i][j] = new Espacio(maletas1);
                }
            }
        }
        
        Espacio[][] espacio9 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio9[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio9[i][j] = new Espacio(juguetes1);
                }
            }
        }
        
        Espacio[][] espacioz9 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioz9[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioz9[i][j] = new Espacio(juguetes1);
                }
            }
        }
        
        Espacio[][] espacio10 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio10[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio10[i][j] = new Espacio(alimento1);
                }
            }
        }
        
        Espacio[][] espacioz10 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioz10[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioz10[i][j] = new Espacio(alimento1);
                }
            }
        }
        
        matriz = new Estante[10][2];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == 0 && j == 0) {
                    Thing zona = new Thing(almacen, j, i);
                    Estante estante1 = new Estante(espacio1, zona);
                    matriz[i][j] = estante1;
                    zona.getIcon().setColor(Color.GREEN);
                    zona.getIcon().setLabel("Memoria");
                }
                
                if (i == 0 && j == 1) {
                    Thing zona = new Thing(almacen, j, i);
                    Estante estante1 = new Estante(espacioz1, zona);
                    matriz[i][j] = estante1;
                    zona.getIcon().setColor(Color.GREEN);
                    zona.getIcon().setLabel("Memoria");
                }

                if (i == 1 && j == 0) {
                    Thing zona1 = new Thing(almacen, j, i);
                    Estante estante2 = new Estante(espacio2, zona1);
                    matriz[i][j] = estante2;
                    zona1.getIcon().setColor(Color.GREEN);
                    zona1.getIcon().setLabel("Alimento");
                }
                
                if (i == 1 && j == 1) {
                    Thing zona1 = new Thing(almacen, j, i);
                    Estante estante2 = new Estante(espacioz2, zona1);
                    matriz[i][j] = estante2;
                    zona1.getIcon().setColor(Color.GREEN);
                    zona1.getIcon().setLabel("Alimento");
                }

                if (i == 2 && j == 0) {
                    Thing zona2 = new Thing(almacen, j, i);
                    Estante estante3 = new Estante(espacio3, zona2);
                    matriz[i][j] = estante3;
                    zona2.getIcon().setColor(Color.GREEN);
                    zona2.getIcon().setLabel("Maleta");
                }
                
                if (i == 2 && j == 1) {
                    Thing zona2 = new Thing(almacen, j, i);
                    Estante estante3 = new Estante(espacioz3, zona2);
                    matriz[i][j] = estante3;
                    zona2.getIcon().setColor(Color.GREEN);
                    zona2.getIcon().setLabel("Maleta");
                }

                if (i == 3 && j == 0) {
                    Thing zona3 = new Thing(almacen, j, i);
                    Estante estante4 = new Estante(espacio4, zona3);
                    matriz[i][j] = estante4;
                    zona3.getIcon().setColor(Color.GREEN);
                    zona3.getIcon().setLabel("Munieco");
                }
                
                if (i == 3 && j == 1) {
                    Thing zona3 = new Thing(almacen, j, i);
                    Estante estante4 = new Estante(espacioz4, zona3);
                    matriz[i][j] = estante4;
                    zona3.getIcon().setColor(Color.GREEN);
                    zona3.getIcon().setLabel("Munieco");
                }

                if (i == 4 && j == 0) {
                    Thing zona4 = new Thing(almacen, j, i);
                    Estante estante5 = new Estante(espacio5, zona4);
                    matriz[i][j] = estante5;
                    zona4.getIcon().setColor(Color.GREEN);
                    zona4.getIcon().setLabel("Camisa");
                }
                
                if (i == 4 && j == 1) {
                    Thing zona4 = new Thing(almacen, j, i);
                    Estante estante5 = new Estante(espacioz5, zona4);
                    matriz[i][j] = estante5;
                    zona4.getIcon().setColor(Color.GREEN);
                    zona4.getIcon().setLabel("Camisa");
                }

                if (i == 5 && j == 0) {
                    Thing zona5 = new Thing(almacen, j, i);
                    Estante estante6 = new Estante(espacio6, zona5);
                    matriz[i][j] = estante6;
                    zona5.getIcon().setColor(Color.GREEN);
                    zona5.getIcon().setLabel("Pantalon");
                }
                
                if (i == 5 && j == 1) {
                    Thing zona5 = new Thing(almacen, j, i);
                    Estante estante6 = new Estante(espacioz6, zona5);
                    matriz[i][j] = estante6;
                    zona5.getIcon().setColor(Color.GREEN);
                    zona5.getIcon().setLabel("Pantalon");
                }

                if (i == 6 && j == 0) {
                    Thing zona6 = new Thing(almacen, j, i);
                    Estante estante7 = new Estante(espacio7, zona6);
                    matriz[i][j] = estante7;
                    zona6.getIcon().setColor(Color.GREEN);
                    zona6.getIcon().setLabel("Chip");
                }
                
                if (i == 6 && j == 1) {
                    Thing zona6 = new Thing(almacen, j, i);
                    Estante estante7 = new Estante(espacioz7, zona6);
                    matriz[i][j] = estante7;
                    zona6.getIcon().setColor(Color.GREEN);
                    zona6.getIcon().setLabel("Chip");
                }

                if (i == 7 && j == 0) {
                    Thing zona7 = new Thing(almacen, j, i);
                    Estante estante8 = new Estante(espacio8, zona7);
                    matriz[i][j] = estante8;
                    zona7.getIcon().setColor(Color.GREEN);
                    zona7.getIcon().setLabel("Bolso");
                }
                
                if (i == 7 && j == 1) {
                    Thing zona7 = new Thing(almacen, j, i);
                    Estante estante8 = new Estante(espacioz8, zona7);
                    matriz[i][j] = estante8;
                    zona7.getIcon().setColor(Color.GREEN);
                    zona7.getIcon().setLabel("Bolso");
                }

                if (i == 8 && j == 0) {
                    Thing zona8 = new Thing(almacen, j, i);
                    Estante estante9 = new Estante(espacio9, zona8);
                    matriz[i][j] = estante9;
                    zona8.getIcon().setColor(Color.GREEN);
                    zona8.getIcon().setLabel("Munieca");
                }
                
                if (i == 8 && j == 1) {
                    Thing zona8 = new Thing(almacen, j, i);
                    Estante estante9 = new Estante(espacioz9, zona8);
                    matriz[i][j] = estante9;
                    zona8.getIcon().setColor(Color.GREEN);
                    zona8.getIcon().setLabel("Munieca");
                }

                if (i == 9 && j == 0) {
                    Thing zona9 = new Thing(almacen, j, i);
                    Estante estante10 = new Estante(espacio10, zona9);
                    matriz[i][j] = estante10;
                    zona9.getIcon().setColor(Color.GREEN);
                    zona9.getIcon().setLabel("Frijol");
                }
                
                if (i == 9 && j == 1) {
                    Thing zona9 = new Thing(almacen, j, i);
                    Estante estante10 = new Estante(espacioz10, zona9);
                    matriz[i][j] = estante10;
                    zona9.getIcon().setColor(Color.GREEN);
                    zona9.getIcon().setLabel("Frijol");
                }
            }
        }
        Trabajador trabaja = new Trabajador();
        empleado = new Robot(almacen, 12, 10, Direction.NORTH, 0);
        empleado.setIcon(trabaja);
        empleado.setLabel("Empleado");
    }
    
    public void giroe(int giros){
        for (int i = 0; i < giros; i++) {
            empleado.turnLeft();
        }
    }
    
    public void mover(int pasos, int posicion) {
        for (int i = pasos; i > 0; i--) {
            robot[posicion].move();
        }
    }

    public void girar(int giros, int posicion) {
        for (int i = giros; i > 0; i--) {
            robot[posicion].turnLeft();
        }
    }

    public void giroDerecha(int posicion) {
        girar(3, posicion);
    }
    
    public void recoger(int posicion){
        if(robot[posicion].canPickThing()){
            robot[posicion].pickThing();
        }
    }
    
    public boolean espacio_vacio() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j].espacio_vacio()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean buscar_producto(String Producto) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j].buscar_producto(Producto)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public int buscar_avenueingresar(String Producto) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j].buscar_producto(Producto)) {
                    if (matriz[i][j].espacio_vacio()) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    
    public int buscar_avenuesacar(String Producto) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j].buscar_producto(Producto)) {
                    if (matriz[i][j].can_productos(Producto)>0) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public int buscar_streetingresar(String product) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j].buscar_producto(product)) {
                    if (matriz[i][j].espacio_vacio()){
                        return j;
                    }
                }
            }
        }
        return -1;
    }
    
    public int buscar_streetsacar(String product) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j].buscar_producto(product)) {
                    if (matriz[i][j].can_productos(product)>0){
                        return j;
                    }
                }
            }
        }
        return -1;
    }
    
    public void mira_este(int posicion) {
        while (robot[posicion].getDirection() != Direction.EAST) {
            robot[posicion].turnLeft();
        }
    }

    public void mira_abajo(int posicion) {
        while (robot[posicion].getDirection() != Direction.SOUTH) {
            robot[posicion].turnLeft();
        }
    }
    
    public void fila(int posicion, int num_disp_cola){
        while(robot[posicion].frontIsClear() != false){
            robot[posicion].move();
        }
        mira_abajo(posicion);
        mover(1,posicion);
        girar(1,posicion );
        if(!robot[posicion].frontIsClear()){
        girar(3,posicion );
        mover(1,posicion);
        girar(1,posicion);
        }
        mira_abajo(posicion);
        mover(num_disp_cola, posicion);
    }
    
    public int can_espacios(int columna, int fila){
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (i==columna) {
                    if (j==fila) {
                        contador+=matriz[i][j].can_espacios();
                    }
                }
            }
        }
        return contador;
    }
    
    public int can_productos(int columna, int fila, String producto){
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (i==columna) {
                    if (j==fila) {
                        contador+=matriz[i][j].can_productos(producto);
                    }
                }
            }
        }
        return contador;
    }
    
    public void mover_robotsac(int posicion, String nombre){
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
    
    public void mover_envio(int posicion){
        int ubicacion = robot[posicion].getAvenue();
        mover(1,posicion);
        giroDerecha(posicion);
        while(robot[posicion].getAvenue() != 11){
            robot[posicion].move();
        }
        giroDerecha(posicion);
        while(robot[posicion].getStreet() != 12){
            robot[posicion].move();
        }
        recoger(posicion);
        girar(2,posicion);
        while(robot[posicion].getStreet() != 0){
            robot[posicion].move();
        }
        robot[posicion].putThing();
        girar(2, posicion);
        while(robot[posicion].getStreet() != 6){
            robot[posicion].move();
        }
        giroDerecha(posicion);
        while(robot[posicion].getAvenue() != ubicacion){
            robot[posicion].move();
        }
        girar(1,posicion);
        mover(1,posicion);
        girar(2,posicion);
        
    }
    
    public void movimiento_envio() {
        for (int i = 0; i < 9; i++) {
            if (robot[i].getStreet() == 7) {
                mover_envio(i);
                return;
            } 
        }
    }
    
    public void movimiento_robot(String nombre, int num_disp_cola) {
        for (int i = 0; i < 9; i++) {
            if (robot[i].getStreet() == 7) {
                mover_robot(i, nombre);
                puestosi[i][0] = robot[i].getStreet();
                puestosi[i][1] = robot[i].getAvenue();
                recoger(i);
                fila(i,num_disp_cola);
                return;
            } 
        }        
    }
    
    public int iden_colum(String producto) {
        int columna = 0;
        switch (producto) {
            case "Memoria":
                columna = 0;
                break;
            case "Alimento":
                columna = 1;
                break;
            case "Maleta":
                columna = 2;
                break;
            case "Munieco":
                columna = 3;
                break;
            case "Camisa":
                columna = 4;
                break;
            case "Pantalon":
                columna = 5;
                break;
            case "Chip":
                columna = 6;
                break;
            case "Bolso":
                columna = 7;
                break;
            case "Munieca":
                columna = 8;
                break;
            case "Frijol":
                columna = 9;
                break;
            default:
                System.out.println("el producto no se encuentra en nuestro inventario o esta mal escrito intente de nuevo");
                break;
        }
        return columna;
    }
    
    public int valor_pro(String producto) {
        int valor = 0;
        switch (producto) {
            case "Memoria":
                valor = 2000;
                break;
            case "Alimento":
                valor = 1000;
                break;
            case "Maleta":
                valor = 3000;
                break;
            case "Munieco":
                valor = 4000;
                break;
            case "Camisa":
                valor = 5000;
                break;
            case "Pantalon":
                valor = 6000;
                break;
            case "Chip":
                valor = 7000;
                break;
            case "Bolso":
                valor = 8000;
                break;
            case "Munieca":
                valor = 9000;
                break;
            case "Frijol":
                valor = 10000;
                break;
            default:
                System.out.println("el producto no se encuentra en nuestro inventario o esta mal escrito intente de nuevo");
                break;
        }
        return valor;
    }
    
    public boolean ingresar_productoal() {
        int num_disp_cola = 9;
        if (espacio_vacio() == false) {
            System.out.println("No hay espacio disponible en el inventario");
            return false;
        } else {
            System.out.println("Cuantos tipos de productos va a ingresar?(maximo 10)");
            int tip = teclado.nextInt();
            int s = 0;
            int f = s;
            if (tip <= 10) {
                while (f < tip) {
                    while (s < tip) {
                        teclado.nextLine();
                        System.out.println("Ingrese el nombre del producto: ");
                        String nombre = teclado.nextLine();
                        System.out.println("Ingrese el valor del producto: ");
                        int valor = teclado.nextInt();
                        Producto product = new Producto(nombre, valor);
                        if (buscar_producto(nombre)) {
                            System.out.println("Ingrese la cantidad de este producto: ");
                            int cantidad = teclado.nextInt();
                            int columna = iden_colum(nombre);
                            if (cantidad <= can_espacios(columna,0) + can_espacios(columna,1)) {
                                if (cantidad <= can_espacios(columna,0)) {
                                    movimiento_robot(nombre, num_disp_cola);
                                    for(int i=0; i < cantidad; i++){
                                        matriz[columna][0].ingresa(product);
                                    }
                                    num_disp_cola--;
                                    s++;
                                } else {
                                    if (can_espacios(columna,0)==0) {
                                        movimiento_robot(nombre, num_disp_cola);
                                        for(int i=0; i < cantidad; i++){
                                            matriz[columna][1].ingresa(product);
                                        }
                                        num_disp_cola--;
                                        s++;
                                    }else{
                                    movimiento_robot(nombre, num_disp_cola);
                                    int g=0;
                                    int can_espacios = can_espacios(columna,0);
                                    while(g < can_espacios){
                                        matriz[columna][0].ingresa(product);
                                        g++;
                                    }
                                    num_disp_cola--;
                                    movimiento_robot(nombre, num_disp_cola);
                                    int y=0;
                                    can_espacios = can_espacios(columna,1);
                                    while(y < can_espacios && g < cantidad){
                                        matriz[columna][1].ingresa(product);
                                        y++;
                                        g++;
                                    }
                                    num_disp_cola--;
                                    s++;
                                    }
                                }
                            } else {
                                System.out.println("Lo sentimos, no hay espacio suficiente");
                            }
                        } else {
                            System.out.println("El producto ingresado no se maneja en este almacen, para volver a intentarlo presione enter.");
                        }
                    }
                    f++;
                }
                devolver(num_disp_cola);
            } else {
                System.out.println("No tenemos tantos tipos disponibles. Vuelva a intentarlo por favor");
                return false;
            }
        }
        return true;
    }
    
    public boolean sacar_estante() {
        this.facturas.add(new Factura());
        if (this.facturas.isEmpty()) {
            System.out.println(" no se agrego factura");
        }
        int num_disp_cola = 9;
        System.out.println("Cuantos tipos de productos va a sacar?(maximo 10)");
        int tip = teclado.nextInt();
        int s = 0;
        int f = s;
        int avenue = 0;
        if (tip <= 10) {
                while (f < tip) {
                    while (s < tip) {
                        teclado.nextLine();
                        System.out.println("Ingrese el nombre del producto: ");
                        String nombre = teclado.nextLine();
                        if (buscar_producto(nombre)) {
                            System.out.println("Ingrese la cantidad de este producto: ");
                            int cantidad = teclado.nextInt();
                            int columna = iden_colum(nombre);
                            if (cantidad <= can_productos(columna,0,nombre) + can_productos(columna,1, nombre)) {
                                if (cantidad <= can_productos(columna,0,nombre)) {
                                    movimiento_robotsac(nombre, num_disp_cola);
                                    for(int i=0; i < cantidad; i++){
                                        facturas.get(0).getProductos().add(i, matriz[columna][0].saca(nombre));
                                    }
                                    num_disp_cola--;
                                    s++;
                                } else {
                                    if (can_productos(columna,0,nombre)==0) {
                                        movimiento_robotsac(nombre, num_disp_cola);
                                        for(int i=0; i < cantidad; i++){
                                        facturas.get(0).getProductos().add(i, matriz[columna][1].saca(nombre));
                                        }
                                        num_disp_cola--;
                                        s++;
                                    }else{
                                   movimiento_robotsac(nombre, num_disp_cola);
                                    int g=0;
                                    int can_productos = can_productos(columna,0,nombre);
                                    while(g < can_productos){
                                        facturas.get(0).getProductos().add(g, matriz[columna][0].saca(nombre));
                                        g++;
                                    }
                                    num_disp_cola--;
                                    movimiento_robotsac(nombre, num_disp_cola);
                                    int y=0;
                                    can_productos = can_productos(columna,1,nombre);
                                    while(y < can_productos && g < cantidad){
                                        facturas.get(0).getProductos().add(y, matriz[columna][1].saca(nombre));
                                        y++;
                                        g++;
                                    }
                                    num_disp_cola--;
                                    s++;
                                    }
                                }
                            } else {
                                System.out.println("Lo sentimos, no hay tanto espacio disponible.");
                            }
                        } else {
                            System.out.println("Lo sentimos, el producto no se encuentra en el inventario, presione enter para volver a intentar.");
                        }
                    }
                    
                    f++;
                }
                devolver(num_disp_cola);
                giroe(3);
                empleado.move();
                Thing zona = new Thing(almacen, 12, 11);
                zona.getIcon().setColor(Color.ORANGE);
                zona.getIcon().setLabel("Paquete");
                giroe(2);                
                empleado.move();
                giroe(3);
                movimiento_envio();
                facturas.get(nfacturas).imprimirfact();
        }else{
             System.out.println("No tenemos tantos tipos disponibles. Vuelva a intentarlo por favor");
                return false;
        }
        return true;
    }

    public void devolver(int num_fila) {
        for (int i = 0; i < 9-num_fila; i++) {
            while (robot[i].getStreet() < 11) {
                robot[i].move();
            }
            giroDerecha(i);
            while (robot[i].getAvenue() != -1) {
                robot[i].move();
            }
            giroDerecha(i);
            while (robot[i].getStreet() > 6) {
                robot[i].move();
            }
            giroDerecha(i);
            robot[i].move();
            girar(1, i);
            while (robot[i].getStreet() != puestosi[i][0]) {
                robot[i].move();
            }
            giroDerecha(i);
            while (robot[i].getAvenue() != puestosi[i][1]) {
                robot[i].move();
            }
            if (!robot[i].canPickThing()) {
                robot[i].putThing();
            }
            
            if (robot[i].getAvenue() == i) {
                girar(3, i);
            }
            if (robot[i].getAvenue() > i) {
                girar(2, i);
                while (robot[i].getAvenue() != i) {
                    robot[i].move();
                }
            } else {
                while (robot[i].getAvenue() != i) {
                    robot[i].move();           
                }
                }
                while(robot[i].getDirection() != Direction.SOUTH ){
                    robot[i].turnLeft();
                }    
                while (robot[i].frontIsClear()) {
                    robot[i].move();                
            }
                girar(2,i);
        }
    }
}
 
