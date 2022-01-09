/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        System.out.printf("Ingrese 1 para obtener el area de un cuadrado. "
                + "Ingrese 2 para obtener el area del triangulo\n"
                + "Ingrese 3 para obtener el area del rectangulo\n");
        int tipo = entrada.nextInt();
        if (tipo == 1) {
            mensaje = obtenerAreaCuadrado();
        } else {
            if (tipo == 2) {
                mensaje = obtenerAreaTriangulo();
            } else {
                if (tipo == 3) {
                    mensaje = obtenerAreaRectangulo();
                } else {
                    mensaje = "opción incorrecta";
                }
            }
        }
        System.out.println(mensaje);
    }

    public static String obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);

        double lado;
        double area;
        String cadena = "";
        System.out.println("Ingrese el lado del cuadrado");
        lado = entrada.nextDouble();
        area = (lado * lado);

        cadena = String.format("%sLado: %s\nArea = %s\n",
                cadena,
                lado,
                area);
        return cadena;
    }

    public static String obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double area;
        String cadena = "";
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;

        cadena = String.format("%sBase %s - Altura %s\nArea = %s\n",
                cadena,
                base,
                altura,
                area);
        return cadena;
    }

    public static String obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double area;
        String cadena = "";
        System.out.println("Ingrese la base del rectangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        altura = entrada.nextDouble();
        area = (base * altura);

        cadena = String.format("%sBase %s - Altura %s\nArea = %s\n",
                cadena,
                base,
                altura,
                area);
        return cadena;
    }
}
