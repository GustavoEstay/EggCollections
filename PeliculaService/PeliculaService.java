/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeliculaService;

import Comparadores.Comparadores;
import PeliculaAtributos.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class PeliculaService {

    String titulo;
    String director;
    Integer duracion;
    Scanner leer;

    ArrayList<Pelicula> Peliculas = new ArrayList();

    Iterator<Pelicula> it;

//Crear objeto película
    public void crearPelicula() {

        leer = new Scanner(System.in).useDelimiter("\n");
        String opcion;

        do {
            System.out.println("Introduzca el título de una película (presione 's' para salir)");
            opcion = leer.next();
            if (!opcion.equals("s")) {
                titulo = opcion;
                System.out.println("Introduzca el director");
                director = leer.next();
                System.out.println("Indique la duración (en horas)");
                duracion = leer.nextInt();
                Pelicula p = new Pelicula(titulo, director, duracion);
                Peliculas.add(p);

            }

        } while (!opcion.equals("s"));
    }

//Mostrar en pantalla todas las películas.
    public void mostrarPeliculas() {
        System.out.println("_______________________________________");
        System.out.println("Las películas cargadas son las siguientes:");
        System.out.println(Peliculas.toString());
    }
//Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

    public void largometrajes() {

        String listado = "";
        it = Peliculas.iterator();
        while (it.hasNext()) {
            Pelicula p = it.next();
            if (p.getDuracion() > 1) {
                listado = listado + p.getTitulo() + "\n";
            }
        }
        System.out.println("Los largometrajes cargados son:");
        System.out.println(listado);
    }

//Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
//en pantalla.
    public void peliculasDeMayorAMenor() {
        String listado = "";
        it = Peliculas.iterator();
        Collections.sort(Peliculas, Comparadores.PeliculaPorDuracionAsc);
        while (it.hasNext()) {
            Pelicula p = it.next();
            listado = listado + p.getTitulo() + " | Duración: (" + p.getDuracion() + "hs).\n";
        }
        System.out.println("Las películas odenadas por duración de forma descendente son:");
        System.out.println(listado);
    }

//Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//en pantalla.
    public void peliculasDeMenorAMayor() {
        String listado = "";
        it = Peliculas.iterator();
        Collections.sort(Peliculas, Comparadores.PeliculaPorDuracionDesc);
        while (it.hasNext()) {
            Pelicula p = it.next();
            listado = listado + p.getTitulo() + " | Duración: (" + p.getDuracion() + "hs).\n";
        }
        System.out.println("Las películas odenadas por duración de forma ascendente son:");
        System.out.println(listado);
    }
//Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.

    public void peliculasPorTitulo() {
        String listado = "";
        it = Peliculas.iterator();
        Collections.sort(Peliculas, Comparadores.PeliculaPorTituloAsc);
        while (it.hasNext()) {
            Pelicula p = it.next();
            listado = listado + p.getTitulo() + " | Título: (" + p.getTitulo() + "\n";
        }
        System.out.println("Las películas odenadas alfabéticamente por título son:");
        System.out.println(listado);
    }
//Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

    public void peliculasPorDirector() {
        String listado = "";
        it = Peliculas.iterator();
        Collections.sort(Peliculas, Comparadores.PeliculaPorDirectorAsc);
        while (it.hasNext()) {
            Pelicula p = it.next();
            listado = listado + p.getTitulo() + " | Director: (" + p.getDirector() + "\n";
        }
        System.out.println("Las películas odenadas alfabéticamente por duración son:");
        System.out.println(listado);
    }
}
