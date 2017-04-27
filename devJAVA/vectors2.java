// 1. Almacenar en un vector todos los numeros pares comprendidos entre 100 y 1000.
// Luego implementar los siguientes metodos:
// . Imprimir la suma de los datos que quedaron en las posiciones impares del vector
// . Imprimir la suma de los últimos 100 datos del vector
// . Imprimir todos los datos múltiplos de 5 y cuantos son
// . Imprimir todos los datos desde una posición k hasta una posicion j ingresadas por el usuario
import java.util.Scanner;

class Vectors2 {
    public static int n = ( (1000 - 100) / 2) + 1;
    
    public static void sumaImpares(int v[], int n){
        int acu = 0, k = 1;
        while(k < n) {
            acu += v[k];
            k += 2;
        }

        System.out.println("La suma de las posiciones impares es: " + acu);
    }

    public static void ultimosNum(int vec[], int n){
        int suma = 0;
        int control = n - 1;
        do {
            suma += vec[control];
            control--;
            
        }while(control >= 400);
        
        
        System.out.println("La suma de los ultimos digitos es: " + suma);
        
    }
    
    public static void multiplosCinco(int v[], int n){
        int c = 0;
        for(int i = 0; i < n; i++){
            if(v[i] % 5 == 0){
                c += 1;
            }
        }
        
        System.out.println("Hay " + c + " datos multiplos de 5");
    }
    
    public static void desdeHasta(int v[]){
        Scanner dato = new Scanner(System.in);
        
        System.out.print("Posicion uno: ");
        int k = dato.nextInt();
        
        System.out.print("Posicion dos: ");
        int j = dato.nextInt();
        
        
        for(int i = k; i <= j;i++){
            System.out.println(v[i]);
        }
        
    }

    public static void llenarVector(){
    
        int vector[] = new int[n];
        int i = 0;
        int var = 100;

        while(var < 1000){
            if(var % 2 == 0){
                vector[i] = var;
                i ++;
            }
            var ++;
        }
        sumaImpares(vector, n);
        ultimosNum(vector, n);
        multiplosCinco(vector,n);
        desdeHasta(vector);
    }
    

    
    public static void main(String[] args){
        llenarVector();
    }
    
 }









