/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_eva3_24550252;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class Examen_eva3_24550252 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        while (numEstudiantes <= 0) {
            System.out.println("El número de estudiantes debe ser mayor a 0.");
            System.out.print("Ingrese el número de estudiantes: ");
            numEstudiantes = scanner.nextInt();
        }

       
        double[] calificaciones = new double[numEstudiantes];

        
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            double calificacion = scanner.nextDouble();

            while (calificacion < 0 || calificacion > 100) {
                System.out.println("La calificación debe estar entre 0 y 100.");
                System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
                calificacion = scanner.nextDouble();
            }

            calificaciones[i] = calificacion;
        }

       
        double promedio = calcularPromedio(calificaciones);

        
        int mayoresOIguales = contarCalificacionesMayores(calificaciones, promedio);

        // Obtener la calificación más alta
        double calificacionMasAlta = obtenerCalificacionMasAlta(calificaciones);

        
        double calificacionMasBaja = obtenerCalificacionMasBaja(calificaciones);

        
        System.out.printf("Promedio de calificaciones: %.2f\n", promedio);
        System.out.println("Número de calificaciones mayores o iguales al promedio: " + mayoresOIguales);
        System.out.println("Calificación más alta: " + calificacionMasAlta);
        System.out.println("Calificación más baja: " + calificacionMasBaja);
    }

    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public static int contarCalificacionesMayores(double[] calificaciones, double promedio) {
        int contador = 0;
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }

   
    }



