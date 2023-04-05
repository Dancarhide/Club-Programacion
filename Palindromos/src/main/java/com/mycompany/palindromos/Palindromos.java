/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromos;

/**
 *
 * @author danca
 */
import java.util.*;
public class Palindromos {

    public static void main(String[] args) {
        boolean acabar = false;
        do {
            Scanner leer = new Scanner(System.in);
            String cadena;
            String cadena2 = "";
            String opc2;
            System.out.println("*** ¿Es palindromo o No? *** ");
            System.out.print("Dijita texto: ");
            cadena = leer.nextLine();
            String result = cadena.replaceAll("\\s+", "");
            String min = result.toLowerCase();
            for (int x = min.length() - 1; x >= 0; x--) {
                cadena2 = cadena2 + min.charAt(x);
            }
            System.out.println("Min es: " + min);
            System.out.println("cadena es: " + cadena2);
            if (min.equals(cadena2)) {
                boolean isNumeric = min.matches("[+-]?\\d*(\\.\\d+)?");
                if (isNumeric) {
                    System.out.println("Es un palindromo");
                } else {
                    System.out.println("Es un palindromo");
                }
            } else {
                System.out.println("No es ni palindromo ");
            }

            System.out.println("Quieres continuar? |si| o |no| ");
            opc2 = leer.next();
            String opc3 = opc2.toLowerCase();
            if (opc3.equals("si") || opc2.equals("s")) {
                acabar = false;
            }
            if (opc3.equals("no")) {
                System.out.println("Adios!!");
                acabar = true;
            }
            if (!(opc3.equals("no") || opc3.equals("si"))) {
                System.out.println("Que intentas?");
            }
        } while (!(acabar == true));
    }
}
