/*
    Calcular si un año es bisiesto o no
*/

import java.util.Scanner;

class bisiesto {
    public static void main(String args[]){
        
        Scanner dato = new Scanner(System.in);

        int year;

        System.out.print("Give me year: ");
        year = dato.nextInt();

        if ( (year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0) ) {
            System.out.println("Es bisiesto");
        }
        else {
            System.out.println("No es bisiesto");
        }
   }
}