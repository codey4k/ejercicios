//Imprimir tablas del multiplicar

public class app {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            System.out.println("Tabla del: " + i);
            for(int n = 1; n <= 10; n++){
                System.out.println(i + " x " + n + " = " + i * n);
            }
        }
    }
}
