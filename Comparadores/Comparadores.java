/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import PeliculaAtributos.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Gustavo
 */
public class Comparadores {
    
    public static Comparator<Pelicula> PeliculaPorDuracionDesc = (Pelicula p1, Pelicula p2) -> p2.getDuracion().compareTo(p1.getDuracion());
    public static Comparator<Pelicula> PeliculaPorDuracionAsc = (Pelicula p1, Pelicula p2) -> p1.getDuracion().compareTo(p2.getDuracion());
    public static Comparator<Pelicula> PeliculaPorTituloAsc = (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());
    public static Comparator<Pelicula> PeliculaPorDirectorAsc = (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector());
    };
