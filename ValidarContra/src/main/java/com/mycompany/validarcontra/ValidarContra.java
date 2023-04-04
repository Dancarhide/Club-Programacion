/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.validarcontra;

/**
 *
 * @author danca
 */
import java.util.*;

public class ValidarContra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String contraseña;
        boolean correcto = true;
        int x;
        
        do {
            correcto = true;
            System.out.print("Dijita tu contraseña: ");
            contraseña = leer.nextLine();
            int tamaño;
            tamaño = contraseña.length();
            if (tamaño < 8) {
                correcto = false;
            } else {
                for (x = 0; x < contraseña.length(); x++) {
                    if (Character.isUpperCase(contraseña.charAt(x))) {
                        correcto = true;
                        break;
                    } else {
                        correcto = false;
                     
                    }
                }
                if (correcto == true) {
                    for (x = 0; x < contraseña.length(); x++) {
                        if (Character.isLowerCase(contraseña.charAt(x))) {
                            correcto = true;
                            break;
                        } else {
                            correcto = false;
                        }
                    }
                }
                if (correcto == true) {
                    for (x = 0; x < contraseña.length(); x++) {
                        if (Character.isDigit(contraseña.charAt(x))) {
                            correcto = true;
                            break; 
                        }
                        else{
                            correcto = false;
                        }
                    }
                }

            }
            System.out.println(correcto);

        } while (!(correcto = true));
    }
}
