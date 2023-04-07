/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tringulo;

/**
 *
 * @author danca
 */
import java.util.*;
public class Tringulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,c;
        boolean Cum;
        Cum = true;
        System.out.println("Para que este traingulo funcione los lados tienen que ser diferentes");
        System.out.println("y la suma de 2 no pueden ser menos que un lado");
        System.out.print("Lado a: "); a= leer.nextInt();
        System.out.print("Lado b: "); b= leer.nextInt();
        System.out.print("Lado c: "); c= leer.nextInt();
        if((a==b)||(a==c)||(b==c)){
            Cum=false;
        }
        int ab= a+b;
        int ac= a+c;
        int bc= b+c;
        if((ab<c)||(ac<b)||(bc<a)){
            Cum=false;
        }
        if(Cum==true){
            System.out.println("Se cumple la condicion del triangulo");
        }else{
            System.out.println("No se cumple la condicion del triangulo");
        }
        
    }
}
