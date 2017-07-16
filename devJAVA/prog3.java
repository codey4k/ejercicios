/*
1-Llenar una matriz cuadrada de tamaño 7
con numeros enteros ingresados por el usuario,
declarar la matriz global
2-Un metodo que imprima la suma de todos los
datos que estan en la diagonal principal
3-Metodo que retorne la suma de todos los datos
que estan en la diagonal secundaria
4-Metodo que retorne un mensaje informando si
la matriz es identidad o no
5-Metodo qe retorne un mensaje informando si
la matriz es simetrica o no
*/

import java.util.Scanner;

class matrices2{
    
    static final int NUM = 3;
    
    public static int matriz[][] = new int[NUM][NUM];

    public static void llenarMatriz(){
        Scanner dato = new Scanner(System.in);

        for(int i = 0; i < NUM; i++){
            for(int j = 0; j < NUM; j++){
                System.out.print("Ingrese un numero entero: ");
                matriz[i][j] = dato.nextInt();
            }
        }
        
    }
    
    public static void diagonalPrincipal(){
        int suma = 0;
        for(int x = 0; x < NUM; x++){
            suma += matriz[x][x];
        }
        System.out.println("LA suma de diagonal principa es: " + suma);
    }

    public static int diagonalSecundaria() {
        
        int acumulador = 0,
            Y = NUM -1,
            x = 0;
        for(int y = Y; y >= 0 ; y--) {
            acumulador += matriz[y][x];
            x += 1;
        }
        
        return acumulador;
    }
    
    public static String identidad(){
        int y = 0,
            x = 0,
            Y = NUM - 1;
        
        String sw = "SI";
        
        while(y <= Y && sw == "SI"){
            x = 0;
            while(x <= Y && sw == "SI"){
                if(y == x){
                    if(matriz[y][x] != 1){
                        sw = "NO";
                    }
                }
                else{
                    if(matriz[y][x] != 0){
                        sw = "NO";
                    }
                }
                x++;
            }
            y++;
        }
        
        return sw;
    }
    
    
    
    // public static String simetrica(){
        
    //     String sw = 'SI';
        
    //     for(int y = 1; y <= 6 ; y++) {
    //         for(int x = 0; x <= 6; x++) {
    //             if(matriz[y][x] != matriz[x][y]){
    //                 sw = 'NO';
    //             }
    //         }
    //     }
        
    //     return sw;
    // }
    
    public static void main(String[] args){
        llenarMatriz();
        diagonalPrincipal();
        System.out.println("La diagonal secundaria es "+ diagonalSecundaria());
        System.out.println("Esta matriz " + identidad() +" es de identidad");
    }
}