/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

import AlumnoService.AlumnoService;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class AlumnoBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
//información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.

//        Scanner leer;
//        leer = new Scanner(System.in).useDelimiter("\n");
//        int opcion;
//
//        AlumnoService as = new AlumnoService();
//        
//        System.out.println("Bienvenidx");
//
//        do {
//            System.out.println("Desea registrar un alumno?");
//            System.out.println("    1)Si");
//            System.out.println("    2)No");
//            opcion = leer.nextInt();
//            switch (opcion) {
//                case 1:
//                    as.crearAlumno();
//                    break;
//                case 2:
//                    System.out.println("Muchas Gracias");
//                    break;
//                default:
//                    System.out.println("Opción no válida");
//                    break;
//            }
//
//        } while (opcion == 1);
//
//        as.mostrarLista();
//        as.notaFinal();


        String palabra = "?otag";
        String inversa = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            inversa = inversa + palabra.charAt(i);
        }
        
        System.out.println(inversa.toLowerCase());
    }
}
