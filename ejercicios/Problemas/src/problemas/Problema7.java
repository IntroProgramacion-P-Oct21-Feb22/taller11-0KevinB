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
public class Problema7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de datos del arreglo");
        int numeros = entrada.nextInt();
        String[] datos = obtenerDatos(numeros);
        for (int i = 0; i < datos.length; i++) {
            if (datos[i].length() == 4 || datos[i].length() == 5) {
                System.out.printf("Datos ingresado: %s\n", datos[i]);
            }
        }
    }

    public static String[] obtenerDatos(int numero) {
        Scanner entrada = new Scanner(System.in);
        String[] arreglo = new String[numero];
        String cadenas;
        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese valor");
            cadenas = entrada.nextLine();
            arreglo[i] = cadenas;
        }
        return arreglo;
    }

}
