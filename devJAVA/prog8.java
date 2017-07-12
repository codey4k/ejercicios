import java.util.Scanner;

class Matrices {
    
    public static int [][] matriz;

    public static void llenarMatriz(){
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Cantidad de columnas: ");
        int columna = input.nextInt();      

        System.out.print("Cantidad de filas ");
        int filas = input.nextInt();

        matriz = new int[filas][columna];
        
        for(int i = 0; i < filas; i++) {
            
            for(int j = 0; j < columna; j++){
                do{
                    System.out.print("Ingrese un numero mayor a cero: ");
                    matriz[i][j] = input.nextInt();
                    /*
                    //esta parte es mia
                    if(matriz[i][j] > 0){
                        continue;
                    }
                    else{
                        System.out.print("Es que es bobo o que tiene que ser mayor a 0 ");
                        matriz[i][j] = input.nextInt();
                    }
                    //hasta aca, malvada JUM
                    */
                }while(matriz[i][j] <= 0);
             }
        }

        imprimeDatos(filas,columna,matriz);
    }
    
    public static void imprimeDatos(int filas, int columna, int matriz[][]) {
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columna; j++){
                System.out.println(matriz[j][i]);
            }
        }
    }

    public static void main(String[] args) {
        llenarMatriz();
    }
}