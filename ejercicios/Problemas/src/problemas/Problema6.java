/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import static problemas.Problema5.imprimirDatos;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        imprimirValorMediaAritmetica(informacion);
        imprimirValorDesviacionEstandar(informacion);

    }

    public static void imprimirValorMediaAritmetica(int[] datos) {
        int suma = 0;
        int media = 0;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
            media = suma / datos.length;
        }

        System.out.println("La media aritmetica es " + media);
    }

    public static void imprimirValorDesviacionEstandar(int[] datos) {
        int suma = 0;
        int media = 0;
        double desviacion = 0;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
            media = suma / datos.length;
            desviacion = Math.pow(datos[i] - media, 2) / datos.length;
        }
        System.out.printf("La desviacion estandar es %.2f\n", desviacion);

    }
}
