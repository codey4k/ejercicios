import java.util.Scanner;

public class ejercicioglobvar {

    public static int num1,num2;
    
    Scanner dato = new Scanner(System.in);

    public static void suma(){
        int sumar = num1 + num2;
        System.out.println(sumar);
    }
    
    public static void producto(){
        int mult = num1 * num2;
        System.out.println(mult);
    }

    /*funcion que llama otras funciones*/
    public static void calcular(){
        Scanner dato = new Scanner(System.in);
        
        System.out.print("Dame un numero: ");
        num1 = dato.nextInt();
        
        System.out.print("Dame otro numero: ");
        num2 = dato.nextInt();
        
        suma();
        producto();
    }

    public static void main(String[] args) {
        calcular();
    }
    
    
}
