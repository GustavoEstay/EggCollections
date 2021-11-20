/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnoService;

import AlumnoAtributos.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class AlumnoService {

    String nombre;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Alumno> Alumnos = new ArrayList();
    Iterator<Alumno> it;

    public void crearAlumno() {
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("Ingrese los datos del alumno");
        System.out.println("Nombre");
        nombre = leer.next();

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota nro " + (i + 1));
            notas.add(leer.nextInt());

        }

        Alumnos.add(new Alumno(nombre, notas));

    }

    public void mostrarLista() {
        System.out.println(Alumnos);
    }

    //Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
//su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
//método. Dentro del método se usará la lista notas para calcular el promedio final
//de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
//main.
    public double notaFinal() {
        double promedio = 0;
        int suma = 0;

        System.out.println("Ingrese el nombre del alumno que desea buscar");
        String buscar = leer.next();
        it = Alumnos.iterator();

        while (it.hasNext()) {
            
            Alumno buscado = it.next();
            int cantidad = buscado.getNotas().size();
            
            if (buscado.getNombre().equals(buscar)) {
                for (int i = 0; i < buscado.getNotas().size(); i++) {
                    suma += buscado.getNotas().get(i);
                }
                promedio = Math.round(suma / cantidad);
                System.out.println("El promedio de "+buscar+" es: "+promedio+" puntos");
            } else if (!it.hasNext()) {
                System.out.println("El alumno no se encuentra en la lista");
            }

        }

        return promedio;

    }

}
