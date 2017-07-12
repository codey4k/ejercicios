/*
    Ejercicio con vectores
*/

import java.util.Scanner;
class ejercicio1 {
    
    public static void llenarVector(){
        Scanner dato = new Scanner (System.in);
        
        
        int n, k = 0;
        System.out.print("Ingrese el tamaño del vector: ");
        n = dato.nextInt();
        
        int vector[] = new int[n];
        
        while(k < n) {
            System.out.print("Ingrese un numero entero: ");
            vector[k] = dato.nextInt();
            k++;
            
        }
        procesar(vector,n);
            
    }
    
    public static void procesar(int vector[], int t) {
        int i = 1, suma = 0;
        
        while(i < t) {
            suma = vector[i] + suma;
            i += 2;
        }
        
        System.out.println("La suma de los datos es: " + suma);
        
    }
    
    public static void main(String []args){
       llenarVector();
    }
}