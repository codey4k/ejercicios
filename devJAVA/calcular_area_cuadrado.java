/*
    Calcular el area del un cuadrado.
*/

import java.util.Scanner;

public class area {
    public static void main(String args[]){
        
        Scanner dato = new Scanner(System.in);

        int radio;
        double area;

        System.out.print("Dame el radio: ");
        radio = dato.nextInt();
         
        area = 3.14 * (radio^2);
        System.out.println("El area del cuadrado es: "+ area);
    }
}