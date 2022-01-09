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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su numero de cedula");
        String cedula = entrada.nextLine();
        System.out.printf("Ingrese 1 para calcular la planilla de liz. "
                + "Ingrese 2 para calcular el valor de un predio\n");
        int tipo = entrada.nextInt();
        if (tipo == 1) {
            mensaje = obtenerValorLuz(nombre, cedula);
        } else {
            if (tipo == 2) {
                mensaje = calcularPredio(nombre, cedula);

            } else {
                mensaje = "opción incorrecta";
            }
        }

        System.out.println(mensaje);
    }

    public static String obtenerValorLuz(String a, String b) {
        Scanner entrada = new Scanner(System.in);

        double kw_h;
        double kw_mes;
        double operacion;
        String cadena = "";
        System.out.println("Ingrese el costo de un kilovatio por hora");
        kw_h = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos en un mes");
        kw_mes = entrada.nextDouble();
        operacion = (kw_h * kw_mes);

        cadena = String.format("%s con cedula %s debe cancelar un valor de "
                + "$%s dolares\n",
                a,b,
                operacion);
        return cadena;
    }
    public static String calcularPredio(String a, String b) {
        Scanner entrada = new Scanner(System.in);

        double inmueble;
        double operacion;
        String cadena = "";
        System.out.println("Ingrese el valor del inmueble");
        inmueble = entrada.nextDouble();
        operacion = (inmueble * 2)/100;

        cadena = String.format("Cliente %s con cedula %s tinen un bien inmueble "
                + "valorado en $%s y debe pagar de predio $%s \n",
                a,b, inmueble,
                operacion);
        return cadena;
    }

  
}
