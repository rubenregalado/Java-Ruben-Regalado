/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import java.util.Scanner;
public class Estacionamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int costo1=10;
        int costo2=15;
        float mdos = 2;
        float hora;
        float cuota = 0;
        int maxElementos =0;
        
        for (int contador = 0; contador <= maxElementos; contador++){
        System.out.println("Cuantos horas de Estacionamiento desea?");
        Scanner entradaHoras = new Scanner (System.in);
        hora = entradaHoras.nextFloat();
        
        if(hora<=mdos){
        cuota=hora*costo1;
        }else if(hora>mdos){
            hora=hora-mdos;
            cuota=(hora*costo2)+(costo1*mdos);
        
           }
        System.out.println("La cuota a pagar es: " + cuota);
        contador--;
        
    }
   } 
}
