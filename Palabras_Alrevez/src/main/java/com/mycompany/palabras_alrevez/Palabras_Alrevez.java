
package com.mycompany.palabras_alrevez;


import java.util.*;

public class Palabras_Alrevez {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Texto;
        int x;
        System.out.println("Voltearemos el orden las palabras");
        System.out.print(  "Escribe Aqui: ");Texto = leer.nextLine();
        String[] separado = Texto.split(" ");
        StringTokenizer st = new StringTokenizer(Texto);
        int palabras = st.countTokens()-1;
        for(x=palabras;x>=0;x--){
            System.out.print(separado[x]+" ");
        }                                            
        
        
    }
}
