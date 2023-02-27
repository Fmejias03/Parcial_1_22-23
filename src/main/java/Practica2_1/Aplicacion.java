package Practica2_1;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("Introduzca el numero de puntos");
        Scanner sc = new Scanner(System.in);
        long puntosTotales = sc.nextLong();


        System.out.println("El valor de pi es: " + Ejercicio1.aproximacionPi(puntosTotales));
    }

}
