/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pelicula;

import PeliculaService.PeliculaService;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class PeliculaBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//// En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
//usuario todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
//si quiere crear otra Pelicula o no.

        PeliculaService ps = new PeliculaService();
        int opcion;
        Scanner leer;
        leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Bienvenidx");
        System.out.println("Qué desea hacer?");
        System.out.println("    1) Cargar películas en el sistema");
        System.out.println("    2) Salir");
        opcion = leer.nextInt();

        do {
            switch (opcion) {
                case 1:
                    ps.crearPelicula();
                    System.out.println("Está seguro de querer dejar de cargar Películas?");
                    System.out.println("    1)No");
                    System.out.println("    2)Si");
                    opcion=leer.nextInt();
                    break;
                case 2:
                    System.out.println("Muchas Gracias");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion == 1);
        

        ps.mostrarPeliculas();
        System.out.println("");
        ps.largometrajes();
        System.out.println("");
        ps.peliculasDeMayorAMenor();
        System.out.println("");
        ps.peliculasDeMenorAMayor();
        System.out.println("");
        ps.peliculasPorTitulo();
        System.out.println("");
        ps.peliculasPorDirector();

    }

}
