/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.matriz_diagonal_principal;

import java.util.*;
import java.util.Arrays;

public class Matriz_Diagonal_Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1;
        int x, y;
        int n;
        System.out.print("Dijita el tamaño: "); n1 = leer.nextInt();
        int Matriz[][] = new int[n1][n1];
        for (x = 0; x < n1; x++) {
            for (y = 0; y < n1; y++) {
                System.out.print("Dijita la posicion [" + x + "," + y + "]: ");
                n = leer.nextInt();
                Matriz[x][y] = n;
            }
        }
        System.out.println("La diagonal principal es: ");
        System.out.print("[ ");
        for (x = 0; x < n1; x++) {

            for (y = 0; y < n1; y++) {
                if (x == y) {
                    System.out.print(Matriz[x][y] + ", ");
                }
            }
        }
        System.out.print("]");
    }
}
