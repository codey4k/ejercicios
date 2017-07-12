/*
    Dados
*/

import java.util.Scanner;

class dados {
    
    public static int d1,d2,d3,d4;
    
    public static String nom1,nom2;
    
    
    public static void metodo(){
        
        Scanner dato = new Scanner(System.in);
        
        /*Primer jugador*/
        System.out.print("Nombre del primer jugador: ");
        nom1 = dato.next();
        
        System.out.print("Primer dado de " + nom1 + " ");
        d1 = dato.nextInt();
        
        System.out.print("Segundo dado de " + nom1 + " ");
        d2 = dato.nextInt();
        
        /*Segundo jugador*/
        System.out.print("Nombre del segundo jugador: ");
        nom2 = dato.next();
        
        System.out.print("Pimer dado de " + nom2 + " ");
        d3 = dato.nextInt();
        
        System.out.print("Segundo dado de " + nom2 + " ");
        d4 = dato.nextInt();
        
        
        if( (d1 == d2) && (d3 == d4) ){
            if( (d1 == d3 && d1 == d4) && (d2 == d3 && d2 == d4) ){
                System.out.println("Es un empate");
            }
        }
        
        else if( (d1 != d2) || (d3 != d4) ){
            int jugador1 = d1 + d2;
            int jugador2 = d3 + d4;
            
            if ( jugador1 > jugador2 ){
                 System.out.println("El ganador es: " + nom1);
            }
            else{
                System.out.println("El ganador es: " + nom2);
            }
        }
        
    }
    
    
    public static void main(String args[]){
        metodo();
    }
}