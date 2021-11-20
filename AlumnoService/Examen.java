/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnoService;

/**
 *
 * @author Gustavo
 */
public class Examen {

    public boolean parCieloPiso(int numEnt, double numReal, long numLargo) {

        boolean comprobar = false;
        double decimal = numReal % 1;

        if (numEnt % 2 == 0
                && Math.round(decimal) == 0
                && Math.signum(numLargo) != -1) {
            comprobar = true;
        }
        return comprobar;
    }

    public String geringoso(String palabra) {

        String geringoso = "";

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a') {
                geringoso = geringoso + palabra.charAt(i) + "pa";
            } else if (palabra.charAt(i) == 'e') {
                geringoso = geringoso + palabra.charAt(i) + "pe";
            } else if (palabra.charAt(i) == 'i') {
                geringoso = geringoso + palabra.charAt(i) + "pi";
            } else if (palabra.charAt(i) == 'o') {
                geringoso = geringoso + palabra.charAt(i) + "po";
            } else if (palabra.charAt(i) == 'u') {
                geringoso = geringoso + palabra.charAt(i) + "pu";
            } else {
                geringoso = geringoso + palabra.charAt(i);
            }
        }

            return geringoso;
        }

     public String inversa(String palabra) {
   // Acá escribí la lógica necesaria
   
   String inversa = "";
   
         for (int i = palabra.length()-1; i >= 0; i--) {
             inversa = inversa + palabra.charAt(i);
         }
         
         return inversa.toLowerCase();
  }  

}
