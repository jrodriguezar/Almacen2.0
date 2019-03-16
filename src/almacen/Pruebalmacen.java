package almacen;

import BussinesLogic.Factura;
import Estante.Espacio;
import Estante.Estante;
import Estante.Producto;
import becker.robots.*;
import Robots.*;
import java.awt.Color;
import java.util.ArrayList;
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

    //Aprobados para la parte logica
    private Scanner teclado;
    private Estante[][] matriz;
    private int nfacturas;
    private ArrayList<Factura> facturas;

    private Robot empleado;

    public Pruebalmacen() {

        this.lugar = new City();
        teclado = new Scanner(System.in);

        this.nfacturas = 0;
        this.facturas = new ArrayList<>();

        int num = 1;
        int iter = 0;
        nfacturas = 0;
        facturas = new ArrayList<>();
//        robot = new Robot[10];
//        puestosi = new int[10][2];
        for (int i = 0; i < 11; i++) {
            Wall norte = new Wall(lugar, 0, i, Direction.NORTH);
        }
        for (int i = 0; i < 11; i++) {
            //Wall norte = new Wall(almacen, 0, i, Direction.NORTH);
            //pared izquierda
            if (i < 11) {
                Wall izqui = new Wall(lugar, i, 0, Direction.WEST);

            }

            if (i > 6 && i < 8) {
                Wall izqui = new Wall(lugar, 12, 0, Direction.WEST);
            }

            if (i < 2) {
                //pared derecha
                Wall derecha = new Wall(lugar, i, 10, Direction.EAST);
            }

            if (i < 10) {
                Wall sur_divisiones = new Wall(lugar, 12, i, Direction.EAST);
                Wall sur = new Wall(lugar, 12, i, Direction.SOUTH);
                //creo robots almacenadores
                Robotamazon robo = new Robotamazon();
                Robot reobot = new Robot(lugar, 12, i, Direction.NORTH, 0);
                reobot.setIcon(robo);
                reobot.setLabel("Robot" + " " + num);
            }
//            robot[iter] = reobot;
            num++;
            iter++;
        }

        //Alimentos
        Producto alimento = new Producto("Papas", 1000);
        Producto alimento1 = new Producto("Frijol", 10000);
        Producto alimento2 = new Producto("Arepa", 1000);
        Producto alimento3 = new Producto("Empanada", 1000);
        //Robotica
        Producto robotica = new Producto("Memoria", 2000);
        Producto robotica1 = new Producto("Chip", 7000);
        Producto robotica2 = new Producto("ProtoBoard", 17000);
        Producto robotica3 = new Producto("Cable", 3000);
        //Maletas y Bolsos
        Producto maleta = new Producto("Maleta", 3000);
        Producto maleta1 = new Producto("Bolso", 8000);
        Producto maleta2 = new Producto("Maletin", 18000);
        Producto maleta3 = new Producto("Billetera", 6000);
        //Juguetes
        Producto juguete = new Producto("Munieco", 4000);
        Producto juguete1 = new Producto("Munieca", 9000);
        Producto juguete2 = new Producto("Carrito", 3000);
        Producto juguete3 = new Producto("Balon", 6000);
        //Ropa
        Producto ropa1 = new Producto("Camisa", 5000);
        Producto ropa2 = new Producto("Pantalon", 6000);
        Producto ropa3 = new Producto("Falda", 12000);
        Producto ropa4 = new Producto("Top", 2000);

        //Espacios con comida
        Espacio[][] espacioc1 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioc1[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioc1[i][j] = new Espacio(alimento);
                }
            }
        }

        Espacio[][] espacioc2 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioc2[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioc2[i][j] = new Espacio(alimento1);
                }
            }
        }

        Espacio[][] espacioc3 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioc3[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioc3[i][j] = new Espacio(alimento2);
                }
            }
        }

        Espacio[][] espacioc4 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioc4[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioc4[i][j] = new Espacio(alimento3);
                }
            }
        }

        //Espacios con robotica
        Espacio[][] espacioro1 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioro1[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioro1[i][j] = new Espacio(robotica);
                }
            }
        }

        Espacio[][] espacioro2 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioro2[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioro2[i][j] = new Espacio(robotica1);
                }
            }
        }

        Espacio[][] espacioro3 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioro3[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioro3[i][j] = new Espacio(robotica2);
                }
            }
        }

        Espacio[][] espacioro4 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioro4[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioro4[i][j] = new Espacio(robotica3);
                }
            }
        }

        //Espacios con maletas
        Espacio[][] espaciom1 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espaciom1[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espaciom1[i][j] = new Espacio(maleta);
                }
            }
        }

        Espacio[][] espaciom2 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espaciom2[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espaciom2[i][j] = new Espacio(maleta1);
                }
            }
        }

        Espacio[][] espaciom3 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espaciom3[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espaciom3[i][j] = new Espacio(maleta2);
                }
            }
        }

        Espacio[][] espaciom4 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espaciom4[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espaciom4[i][j] = new Espacio(maleta3);
                }
            }
        }

        //Espacios con juguetes
        Espacio[][] espacioj1 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioj1[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioj1[i][j] = new Espacio(juguete);
                }
            }
        }

        Espacio[][] espacioj2 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioj2[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioj2[i][j] = new Espacio(juguete1);
                }
            }
        }

        Espacio[][] espacioj3 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioj3[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioj3[i][j] = new Espacio(juguete2);
                }
            }
        }

        Espacio[][] espacioj4 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacioj4[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacioj4[i][j] = new Espacio(juguete3);
                }
            }
        }

        //Espacios con ropa
        Espacio[][] espacior1 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacior1[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacior1[i][j] = new Espacio(ropa1);
                }
            }
        }

        Espacio[][] espacior2 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacior2[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacior2[i][j] = new Espacio(ropa2);
                }
            }
        }

        Espacio[][] espacior3 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacior3[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacior3[i][j] = new Espacio(ropa3);
                }
            }
        }

        Espacio[][] espacior4 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacior4[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacior4[i][j] = new Espacio(ropa4);
                }
            }
        }

        matriz = new Estante[10][2];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == 0 && j == 0) {
                    Thing zona = new Thing(lugar, j, i);
                    Estante estante1 = new Estante(espacioc1, zona);
                    matriz[i][j] = estante1;
                    zona.getIcon().setColor(Color.GREEN);
                    zona.getIcon().setLabel("Papas");
                }

                if (i == 0 && j == 1) {
                    Thing zona = new Thing(lugar, j, i);
                    Estante estante2 = new Estante(espacioc2, zona);
                    matriz[i][j] = estante2;
                    zona.getIcon().setColor(Color.GREEN);
                    zona.getIcon().setLabel("Frijol");
                }

                if (i == 1 && j == 0) {
                    Thing zona1 = new Thing(lugar, j, i);
                    Estante estante3 = new Estante(espacioc3, zona1);
                    matriz[i][j] = estante3;
                    zona1.getIcon().setColor(Color.GREEN);
                    zona1.getIcon().setLabel("Arepa");
                }

                if (i == 1 && j == 1) {
                    Thing zona1 = new Thing(lugar, j, i);
                    Estante estante4 = new Estante(espacioc4, zona1);
                    matriz[i][j] = estante4;
                    zona1.getIcon().setColor(Color.GREEN);
                    zona1.getIcon().setLabel("Empanada");
                }

                if (i == 2 && j == 0) {
                    Thing zona2 = new Thing(lugar, j, i);
                    Estante estante5 = new Estante(espaciom1, zona2);
                    matriz[i][j] = estante5;
                    zona2.getIcon().setColor(Color.GREEN);
                    zona2.getIcon().setLabel("Maleta");
                }

                if (i == 2 && j == 1) {
                    Thing zona2 = new Thing(lugar, j, i);
                    Estante estante6 = new Estante(espaciom2, zona2);
                    matriz[i][j] = estante6;
                    zona2.getIcon().setColor(Color.GREEN);
                    zona2.getIcon().setLabel("Bolso");
                }

                if (i == 3 && j == 0) {
                    Thing zona3 = new Thing(lugar, j, i);
                    Estante estante7 = new Estante(espaciom3, zona3);
                    matriz[i][j] = estante7;
                    zona3.getIcon().setColor(Color.GREEN);
                    zona3.getIcon().setLabel("Maletin");
                }

                if (i == 3 && j == 1) {
                    Thing zona3 = new Thing(lugar, j, i);
                    Estante estante8 = new Estante(espaciom4, zona3);
                    matriz[i][j] = estante8;
                    zona3.getIcon().setColor(Color.GREEN);
                    zona3.getIcon().setLabel("Billetera");
                }

                if (i == 4 && j == 0) {
                    Thing zona4 = new Thing(lugar, j, i);
                    Estante estante9 = new Estante(espacioro1, zona4);
                    matriz[i][j] = estante9;
                    zona4.getIcon().setColor(Color.GREEN);
                    zona4.getIcon().setLabel("Memoria");
                }

                if (i == 4 && j == 1) {
                    Thing zona4 = new Thing(lugar, j, i);
                    Estante estante10 = new Estante(espacioro2, zona4);
                    matriz[i][j] = estante10;
                    zona4.getIcon().setColor(Color.GREEN);
                    zona4.getIcon().setLabel("Chip");
                }

                if (i == 5 && j == 0) {
                    Thing zona5 = new Thing(lugar, j, i);
                    Estante estante11 = new Estante(espacioro3, zona5);
                    matriz[i][j] = estante11;
                    zona5.getIcon().setColor(Color.GREEN);
                    zona5.getIcon().setLabel("ProtoBoard");
                }

                if (i == 5 && j == 1) {
                    Thing zona5 = new Thing(lugar, j, i);
                    Estante estante12 = new Estante(espacioro4, zona5);
                    matriz[i][j] = estante12;
                    zona5.getIcon().setColor(Color.GREEN);
                    zona5.getIcon().setLabel("Cable");
                }

                if (i == 6 && j == 0) {
                    Thing zona6 = new Thing(lugar, j, i);
                    Estante estante13 = new Estante(espacioj1, zona6);
                    matriz[i][j] = estante13;
                    zona6.getIcon().setColor(Color.GREEN);
                    zona6.getIcon().setLabel("Munieco");
                }

                if (i == 6 && j == 1) {
                    Thing zona6 = new Thing(lugar, j, i);
                    Estante estante14 = new Estante(espacioj2, zona6);
                    matriz[i][j] = estante14;
                    zona6.getIcon().setColor(Color.GREEN);
                    zona6.getIcon().setLabel("Munieca");
                }

                if (i == 7 && j == 0) {
                    Thing zona7 = new Thing(lugar, j, i);
                    Estante estante15 = new Estante(espacioj3, zona7);
                    matriz[i][j] = estante15;
                    zona7.getIcon().setColor(Color.GREEN);
                    zona7.getIcon().setLabel("Carrito");
                }

                if (i == 7 && j == 1) {
                    Thing zona7 = new Thing(lugar, j, i);
                    Estante estante16 = new Estante(espacioj4, zona7);
                    matriz[i][j] = estante16;
                    zona7.getIcon().setColor(Color.GREEN);
                    zona7.getIcon().setLabel("Balon");
                }

                if (i == 8 && j == 0) {
                    Thing zona8 = new Thing(lugar, j, i);
                    Estante estante17 = new Estante(espacior1, zona8);
                    matriz[i][j] = estante17;
                    zona8.getIcon().setColor(Color.GREEN);
                    zona8.getIcon().setLabel("Camisa");
                }

                if (i == 8 && j == 1) {
                    Thing zona8 = new Thing(lugar, j, i);
                    Estante estante18 = new Estante(espacior2, zona8);
                    matriz[i][j] = estante18;
                    zona8.getIcon().setColor(Color.GREEN);
                    zona8.getIcon().setLabel("Pantalon");
                }

                if (i == 9 && j == 0) {
                    Thing zona9 = new Thing(lugar, j, i);
                    Estante estante19 = new Estante(espacior3, zona9);
                    matriz[i][j] = estante19;
                    zona9.getIcon().setColor(Color.GREEN);
                    zona9.getIcon().setLabel("Falda");
                }

                if (i == 9 && j == 1) {
                    Thing zona9 = new Thing(lugar, j, i);
                    Estante estante20 = new Estante(espacior4);
                    matriz[i][j] = estante20;
                    zona9.getIcon().setColor(Color.GREEN);
                    zona9.getIcon().setLabel("Top");
                }
            }
        }

        Trabajador trabaja = new Trabajador();
        this.empleado = new Robot(lugar, 12, 10, Direction.NORTH, 0);
        this.empleado.setIcon(trabaja);
        this.empleado.setLabel("Empleado");
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
                    if (matriz[i][j].can_productos(Producto) > 0) {
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
                    if (matriz[i][j].espacio_vacio()) {
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
                    if (matriz[i][j].can_productos(product) > 0) {
                        return j;
                    }
                }
            }
        }
        return -1;
    }

    public int can_espacios(int columna, int fila) {
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == columna) {
                    if (j == fila) {
                        contador += matriz[i][j].can_espacios();
                    }
                }
            }
        }
        return contador;
    }

    public int can_productos(int columna, int fila, String producto) {
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == columna) {
                    if (j == fila) {
                        contador += matriz[i][j].can_productos(producto);
                    }
                }
            }
        }
        return contador;
    }

    public int iden_colum(String producto) {
        int columna = 0;
        switch (producto) {
            case "Papas":
                columna = 0;
                break;
            case "Frijol":
                columna = 0;
                break;
            case "Arepa":
                columna = 1;
                break;
            case "Empanada":
                columna = 1;
                break;
            case "Maleta":
                columna = 2;
                break;
            case "Bolso":
                columna = 2;
                break;
            case "Maletin":
                columna = 3;
                break;
            case "Billetera":
                columna = 3;
                break;
            case "Memoria":
                columna = 4;
                break;
            case "Chip":
                columna = 4;
                break;
            case "ProtoBoard":
                columna = 5;
                break;
            case "Cable":
                columna = 5;
                break;
            case "Munieco":
                columna = 6;
                break;
            case "Munieca":
                columna = 6;
                break;
            case "Carrito":
                columna = 7;
                break;
            case "Balon":
                columna = 7;
                break;
            case "Camisa":
                columna = 8;
                break;
            case "Pantalon":
                columna = 8;
                break;
            case "Falda":
                columna = 9;
                break;
            case "Top":
                columna = 9;
                break;
            default:
                System.out.println("el producto no se encuentra en nuestro inventario o esta mal escrito intente de nuevo");
                break;
        }
        return columna;
    }

    public int iden_street(String producto) {
        int columna = 0;
        switch (producto) {
            case "Papas":
                columna = 0;
                break;
            case "Frijol":
                columna = 1;
                break;
            case "Arepa":
                columna = 0;
                break;
            case "Empanada":
                columna = 1;
                break;
            case "Maleta":
                columna = 0;
                break;
            case "Bolso":
                columna = 1;
                break;
            case "Maletin":
                columna = 0;
                break;
            case "Billetera":
                columna = 1;
                break;
            case "Memoria":
                columna = 0;
                break;
            case "Chip":
                columna = 1;
                break;
            case "ProtoBoard":
                columna = 0;
                break;
            case "Cable":
                columna = 1;
                break;
            case "Munieco":
                columna = 0;
                break;
            case "Munieca":
                columna = 1;
                break;
            case "Carrito":
                columna = 0;
                break;
            case "Balon":
                columna = 1;
                break;
            case "Camisa":
                columna = 0;
                break;
            case "Pantalon":
                columna = 1;
                break;
            case "Falda":
                columna = 0;
                break;
            case "Top":
                columna = 1;
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
            case "Papas":
                valor = 1000;
                break;
            case "Frijol":
                valor = 10000;
                break;
            case "Arepa":
                valor = 1000;
                break;
            case "Empanada":
                valor = 1000;
                break;
            case "Memoria":
                valor = 2000;
                break;
            case "Chip":
                valor = 7000;
                break;
            case "ProtoBoard":
                valor = 17000;
                break;
            case "Cable":
                valor = 3000;
                break;
            case "Maleta":
                valor = 3000;
                break;
            case "Bolso":
                valor = 8000;
                break;
            case "Maletin":
                valor = 18000;
                break;
            case "Billetera":
                valor = 6000;
                break;
            case "Munieco":
                valor = 4000;
                break;
            case "Munieca":
                valor = 9000;
                break;
            case "Carrito":
                valor = 3000;
                break;
            case "Balon":
                valor = 6000;
                break;
            case "Camisa":
                valor = 5000;
                break;
            case "Pantalon":
                valor = 6000;
                break;
            case "Falda":
                valor = 12000;
                break;
            case "Top":
                valor = 2000;
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
            System.out.println("Cuantos tipos de productos va a ingresar?(maximo 20)");
            String tipo = teclado.next();
            int tip = Integer.parseInt(tipo);
            int s = 0;
            int f = s;
            if (tip <= 10) {
                while (f < tip) {
                    while (s < tip) {
                        System.out.println("Ingrese el nombre del producto: ");
                        String nombre = teclado.next();
                        System.out.println("Ingrese el valor del producto: ");
                        String valore = teclado.next();
                        int valor = Integer.parseInt(valore);
                        Producto product = new Producto(nombre, valor);
                        if (buscar_producto(nombre)) {
                            System.out.println("Ingrese la cantidad de este producto: ");
                            String cantidade = teclado.next();
                            int cantidad = Integer.parseInt(cantidade);
                            int columna = iden_colum(nombre);
                            int street = iden_street(nombre);
                            if (cantidad <= can_espacios(columna, street)) {
                                //movimiento_robot(nombre, num_disp_cola);
                                for (int i = 0; i < cantidad; i++) {
                                    matriz[columna][street].ingresa(product);
                                }
                                num_disp_cola--;
                                s++;
                            } else {

                                System.out.println("Lo sentimos, no hay espacio suficiente");
                            }
                        } else {
                            System.out.println("El producto ingresado no se maneja en este almacen.");
                        }
                    }
                    f++;
                }
                //devolver(num_disp_cola);
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
        System.out.println("Cuantos tipos de productos va a sacar?(maximo 20)");
        String tipo = teclado.next();
        int tip = Integer.parseInt(tipo);
        int s = 0;
        int f = s;
        int avenue = 0;
        if (tip <= 20) {
            while (f < tip) {
                while (s < tip) {
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = teclado.next();
                    if (buscar_producto(nombre)) {
                        System.out.println("Ingrese la cantidad de este producto: ");
                        String cantidade = teclado.next();
                        int cantidad = Integer.parseInt(cantidade);
                        int columna = iden_colum(nombre);
                        int street = iden_street(nombre);
                        if (cantidad <= can_productos(columna, street, nombre)) {
                            //movimiento_robotsac(nombre, num_disp_cola);
                            for (int i = 0; i < cantidad; i++) {
                                facturas.get(0).getProductos().add(i, matriz[columna][street].saca(nombre));
                            }
                            num_disp_cola--;
                            s++;
                        } else {

                            System.out.println("Lo sentimos, no hay tantos productos disponibles.");
                        }
                    } else {
                        System.out.println("Lo sentimos, el producto no se encuentra en el inventario");
                    }
                }

                f++;
            }
//                devolver(num_disp_cola);
//                giroe(3);
//                empleado.move();
//                Thing zona = new Thing(almacen, 12, 11);
//                zona.getIcon().setColor(Color.ORANGE);
//                zona.getIcon().setLabel("Paquete");
//                giroe(2);                
//                empleado.move();
//                giroe(3);
//                movimiento_envio();
            facturas.get(nfacturas).imprimirfact();
        } else {
            System.out.println("No tenemos tantos tipos disponibles. Vuelva a intentarlo por favor");
            return false;
        }
        return true;
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
