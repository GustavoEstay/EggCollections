/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RazaService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class RazaService {

    private Scanner leer;

    // Programa que lea y guarde razas de perros en un ArrayList de tipo String.
    ArrayList<String> razas = new ArrayList();

    public void crearRaza() {
        leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        System.out.println("Inserte una raza");
        razas.add(leer.next());

        //Le pedirá una raza de perro en un bucle, el mismo se guardará en la lista
        //y después se le preguntará al usuario si quiere guardar otro perro o si quiere salir.
        do {
            System.out.println("Qué desea hacer?");
            System.out.println("    1) Ingresar otra raza");
            System.out.println("    2) Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Inserte una raza");
                    razas.add(leer.next());
                    break;
                case 2:
                    System.out.println("Muchas Gracias");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion == 1);

        //Si decide salir, se mostrará todos los perros guardados en el ArrayList.
        System.out.println("");
        System.out.println("Su colección es la siguiente");
        System.out.println(razas);

    }

    /*al usuario se le pedirá un perro y se recorrerá la lista con un Iterator,
    se buscará el perro en la lista.*/
    public void recorrer() {

        String nuevaRaza;

        System.out.println("Indique la raza que desea eliminar de la lista");
        nuevaRaza = leer.next();

        Iterator<String> it = razas.iterator();

        while (it.hasNext()) {
            String aux = it.next();

            /*Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada.*/
            if (aux.equals(nuevaRaza)) {
                it.remove();

                /*Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.*/
            } else if (!it.hasNext()) {
                System.out.println("La raza no se encuentra en la lista");
                System.out.println("_____________");
                System.out.println("La lista es la siguiente:");
            }
        }

        System.out.println(razas);

    }

}
