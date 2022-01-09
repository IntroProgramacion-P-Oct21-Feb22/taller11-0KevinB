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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String mensaje = "";
        double calificaciones;
        double calificaciones2;
        double calificaciones3;
        double calificaciones4;
        System.out.println("Ingrese sus cuatro calificaciones");
        calificaciones = entrada.nextDouble();
        calificaciones2 = entrada.nextDouble();
        calificaciones3 = entrada.nextDouble();
        calificaciones4 = entrada.nextDouble();

        mensaje = obtenerPromedioCualitativo(calificaciones, calificaciones2,
                calificaciones3, calificaciones4);
        System.out.println(mensaje);
    }

    public static String obtenerPromedioCualitativo(double a, double b,
            double c, double d) {
        Scanner entrada = new Scanner(System.in);
        String prom_cualitativo = "";
        double suma = a + b + c + d;
        double promedio = suma / 4;
        if (promedio >= 0 && promedio <= 5) {
            prom_cualitativo = "Regular";
        }
        if (promedio >= 5.1 && promedio <= 8) {
            prom_cualitativo = "Bueno";
        }
        if (promedio >= 8.1 && promedio <= 9) {
            prom_cualitativo = "Muy Bueno";
        }
        if (promedio >= 9.1 && promedio <= 10) {
            prom_cualitativo = "Sobresaliente";
        }
        String mensaje;
        mensaje = String.format("El promedio de las notas %.2f, %.2f, %.2f, "
                + "%.2f es %s", a, b, c, d, prom_cualitativo);
        return mensaje;
    }

}
