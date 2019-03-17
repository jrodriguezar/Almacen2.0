package almacen;

import Robots.Trabajador;
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
    private Robot[] robor;

    public Pruebalmacen() {

        this.lugar = new City();
        teclado = new Scanner(System.in);
        this.nfacturas = 0;
        this.facturas = new ArrayList<>();

        int num = 1;
        int iter = 0;
        nfacturas = 0;
        facturas = new ArrayList<>();
        robor = new Robot[10];
        for (int i = 0; i < 11; i++) {
            Wall norte = new Wall(lugar, 0, i, Direction.NORTH);
        }
        for (int i = 0; i < 11; i++) {
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
                robor[iter] = reobot;
            }
            
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
        Thing empleado = new Thing(lugar, 14, 10);
        empleado.setIcon(trabaja);
        empleado.getIcon().setLabel("Empleado");
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
        //Para manejar las ubicaciones de los estantes
        ArrayList<Integer> streets = new ArrayList<>();
        ArrayList<Integer> avenues = new ArrayList<>();
        if (espacio_vacio() == false) {
            System.out.println("No hay espacio disponible en el inventario");
            return false;
        } else {
            System.out.println("Cuantos tipos de productos va a ingresar?");
            String tipo = teclado.next();
            int tip = Integer.parseInt(tipo);
            int s = 0;
            int f = s;
            if (tip <= 10) {
                while (f < tip) {
                    while (s < tip) {
                        System.out.println("Ingrese el nombre del producto: ");
                        String nombre = teclado.next();
                        Producto product = new Producto(nombre, valor_pro(nombre));
                        if (buscar_producto(nombre)) {
                            System.out.println("Ingrese la cantidad de este producto: ");
                            String cantidade = teclado.next();
                            int cantidad = Integer.parseInt(cantidade);
                            int columna = iden_colum(nombre);
                            int street = iden_street(nombre);
                            if (cantidad <= can_espacios(columna, street)) {
                                //movimiento_robot(nombre, num_disp_cola);
                                avenues.add(columna);
                                streets.add(street);
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
                //Aqui van las instancias de hilos
                Robot2 ro1 = new Robot2(robor[0],lugar,robor[0].getAvenue(),robor[0].getStreet());
                Robot2 ro2 = new Robot2(robor[1],lugar,robor[1].getAvenue(),robor[1].getStreet());
                Robot2 ro3 = new Robot2(robor[2],lugar,robor[2].getAvenue(),robor[2].getStreet());
                Robot2 ro4 = new Robot2(robor[3],lugar,robor[3].getAvenue(),robor[3].getStreet());
                Robot2 ro5 = new Robot2(robor[4],lugar,robor[4].getAvenue(),robor[4].getStreet());
                Robot2 ro6 = new Robot2(robor[5],lugar,robor[5].getAvenue(),robor[5].getStreet());
                Robot2 ro7 = new Robot2(robor[6],lugar,robor[6].getAvenue(),robor[6].getStreet());
                Robot2 ro8 = new Robot2(robor[7],lugar,robor[7].getAvenue(),robor[7].getStreet());
                Robot2 ro9 = new Robot2(robor[8],lugar,robor[8].getAvenue(),robor[8].getStreet());
                Robot2 ro10 = new Robot2(robor[9],lugar,robor[9].getAvenue(),robor[9].getStreet());
            //Aqui van los movimientos de la parte grafica
            switch(tip){
                    case 1:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro1.start();
                    break;
                    case 2:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro1.start();
                        ro2.start();
                    break;
                    case 3:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                    break;
                    case 4:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                    break;
                    case 5:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro5.setXstantte(avenues.get(4));
                        ro5.setYstante(streets.get(4));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                        ro5.start();
                    break;
                    case 6:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro5.setXstantte(avenues.get(4));
                        ro5.setYstante(streets.get(4));
                        ro6.setXstantte(avenues.get(5));
                        ro6.setYstante(streets.get(5));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                        ro5.start();
                        ro6.start();
                    break;
                    case 7:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro5.setXstantte(avenues.get(4));
                        ro5.setYstante(streets.get(4));
                        ro6.setXstantte(avenues.get(5));
                        ro6.setYstante(streets.get(5));
                        ro7.setXstantte(avenues.get(6));
                        ro7.setYstante(streets.get(6));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                        ro5.start();
                        ro6.start();
                        ro7.start();
                    break;
                    case 8:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro5.setXstantte(avenues.get(4));
                        ro5.setYstante(streets.get(4));
                        ro6.setXstantte(avenues.get(5));
                        ro6.setYstante(streets.get(5));
                        ro7.setXstantte(avenues.get(6));
                        ro7.setYstante(streets.get(6));
                        ro8.setXstantte(avenues.get(7));
                        ro8.setYstante(streets.get(7));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                        ro5.start();
                        ro6.start();
                        ro7.start();
                        ro8.start();
                    break;
                    case 9:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro5.setXstantte(avenues.get(4));
                        ro5.setYstante(streets.get(4));
                        ro6.setXstantte(avenues.get(5));
                        ro6.setYstante(streets.get(5));
                        ro7.setXstantte(avenues.get(6));
                        ro7.setYstante(streets.get(6));
                        ro8.setXstantte(avenues.get(7));
                        ro8.setYstante(streets.get(7));
                        ro9.setXstantte(avenues.get(8));
                        ro9.setYstante(streets.get(8));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                        ro5.start();
                        ro6.start();
                        ro7.start();
                        ro8.start();
                        ro9.start();
                    break;
                    case 10:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro5.setXstantte(avenues.get(4));
                        ro5.setYstante(streets.get(4));
                        ro6.setXstantte(avenues.get(5));
                        ro6.setYstante(streets.get(5));
                        ro7.setXstantte(avenues.get(6));
                        ro7.setYstante(streets.get(6));
                        ro8.setXstantte(avenues.get(7));
                        ro8.setYstante(streets.get(7));
                        ro9.setXstantte(avenues.get(8));
                        ro9.setYstante(streets.get(8));
                        ro10.setXstantte(avenues.get(9));
                        ro10.setYstante(streets.get(9));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                        ro5.start();
                        ro6.start();
                        ro7.start();
                        ro8.start();
                        ro9.start();
                        ro10.start();
                    break;
            }
                
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
        //Para manejar las ubicaciones de los estantes
        ArrayList<Integer> streets = new ArrayList<>();
        ArrayList<Integer> avenues = new ArrayList<>();
        System.out.println("Cuantos tipos de productos va a sacar?");
        String tipo = teclado.next();
        int tip = Integer.parseInt(tipo);
        int s = 0;
        int f = s;
        int avenue = 0;
        if (tip <= 10) {
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
                            avenues.add(columna);
                            streets.add(street);
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
            //Aqui van las instancias de hilos
                Robot2 ro1 = new Robot2(robor[0],lugar,robor[0].getAvenue(),robor[0].getStreet());
                Robot2 ro2 = new Robot2(robor[1],lugar,robor[1].getAvenue(),robor[1].getStreet());
                Robot2 ro3 = new Robot2(robor[2],lugar,robor[2].getAvenue(),robor[2].getStreet());
                Robot2 ro4 = new Robot2(robor[3],lugar,robor[3].getAvenue(),robor[3].getStreet());
                Robot2 ro5 = new Robot2(robor[4],lugar,robor[4].getAvenue(),robor[4].getStreet());
                Robot2 ro6 = new Robot2(robor[5],lugar,robor[5].getAvenue(),robor[5].getStreet());
                Robot2 ro7 = new Robot2(robor[6],lugar,robor[6].getAvenue(),robor[6].getStreet());
                Robot2 ro8 = new Robot2(robor[7],lugar,robor[7].getAvenue(),robor[7].getStreet());
                Robot2 ro9 = new Robot2(robor[8],lugar,robor[8].getAvenue(),robor[8].getStreet());
                Robot2 ro10 = new Robot2(robor[9],lugar,robor[9].getAvenue(),robor[9].getStreet());
            //Aqui van los movimientos de la parte grafica
            switch(tip){
                    case 1:
                        //Robot2 ror1 = new Robot2(robor[0],lugar,robor[0].getAvenue(),robor[0].getStreet());
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro1.start();
                    break;
                    case 2:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro1.start();
                        ro2.start();
                    break;
                    case 3:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                    break;
                    case 4:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                    break;
                    case 5:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro5.setXstantte(avenues.get(4));
                        ro5.setYstante(streets.get(4));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                        ro5.start();
                    break;
                    case 6:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro5.setXstantte(avenues.get(4));
                        ro5.setYstante(streets.get(4));
                        ro6.setXstantte(avenues.get(5));
                        ro6.setYstante(streets.get(5));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                        ro5.start();
                        ro6.start();
                    break;
                    case 7:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro5.setXstantte(avenues.get(4));
                        ro5.setYstante(streets.get(4));
                        ro6.setXstantte(avenues.get(5));
                        ro6.setYstante(streets.get(5));
                        ro7.setXstantte(avenues.get(6));
                        ro7.setYstante(streets.get(6));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                        ro5.start();
                        ro6.start();
                        ro7.start();
                    break;
                    case 8:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro5.setXstantte(avenues.get(4));
                        ro5.setYstante(streets.get(4));
                        ro6.setXstantte(avenues.get(5));
                        ro6.setYstante(streets.get(5));
                        ro7.setXstantte(avenues.get(6));
                        ro7.setYstante(streets.get(6));
                        ro8.setXstantte(avenues.get(7));
                        ro8.setYstante(streets.get(7));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                        ro5.start();
                        ro6.start();
                        ro7.start();
                        ro8.start();
                    break;
                    case 9:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro5.setXstantte(avenues.get(4));
                        ro5.setYstante(streets.get(4));
                        ro6.setXstantte(avenues.get(5));
                        ro6.setYstante(streets.get(5));
                        ro7.setXstantte(avenues.get(6));
                        ro7.setYstante(streets.get(6));
                        ro8.setXstantte(avenues.get(7));
                        ro8.setYstante(streets.get(7));
                        ro9.setXstantte(avenues.get(8));
                        ro9.setYstante(streets.get(8));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                        ro5.start();
                        ro6.start();
                        ro7.start();
                        ro8.start();
                        ro9.start();
                    break;
                    case 10:
                        ro1.setXstantte(avenues.get(0));
                        ro1.setYstante(streets.get(0));
                        ro2.setXstantte(avenues.get(1));
                        ro2.setYstante(streets.get(1));
                        ro3.setXstantte(avenues.get(2));
                        ro3.setYstante(streets.get(2));
                        ro4.setXstantte(avenues.get(3));
                        ro4.setYstante(streets.get(3));
                        ro5.setXstantte(avenues.get(4));
                        ro5.setYstante(streets.get(4));
                        ro6.setXstantte(avenues.get(5));
                        ro6.setYstante(streets.get(5));
                        ro7.setXstantte(avenues.get(6));
                        ro7.setYstante(streets.get(6));
                        ro8.setXstantte(avenues.get(7));
                        ro8.setYstante(streets.get(7));
                        ro9.setXstantte(avenues.get(8));
                        ro9.setYstante(streets.get(8));
                        ro10.setXstantte(avenues.get(9));
                        ro10.setYstante(streets.get(9));
                        ro1.start();
                        ro2.start();
                        ro3.start();
                        ro4.start();
                        ro5.start();
                        ro6.start();
                        ro7.start();
                        ro8.start();
                        ro9.start();
                        ro10.start();
                    break;
            }
            facturas.get(nfacturas).imprimirfact();
        } else {
            System.out.println("No tenemos tantos tipos disponibles. Vuelva a intentarlo por favor");
            return false;
        }
        return true;
    }
}