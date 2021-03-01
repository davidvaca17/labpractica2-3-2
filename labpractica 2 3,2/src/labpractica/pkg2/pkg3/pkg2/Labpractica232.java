/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpractica.pkg2.pkg3.pkg2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Labpractica232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        String frase="";
        char [] caracteres;
        int repetido =0;
        char caractermasrepetido;
        int contador=0;
        System.out.println("cual es el carcater mas repetido?");
        System.out.println("escriba su texto");
        frase=lector.nextLine();
        caracteres=frase.toCharArray();
        for(int i=0; i<caracteres.length; i++){
            char actual=caracteres[i];
            contador =0;
            for(int j=0; j<caracteres.length; j++){
                if (caracteres[j]==actual)
                    contador++;
            }
            if (repetido<contador){
                repetido=contador;
                caractermasrepetido=actual;
            }
        }
        
    }
    
}
