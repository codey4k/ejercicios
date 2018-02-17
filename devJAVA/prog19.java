import java.util.InputMismatchException;
import java.util.Scanner;

class Excepciones {
    public static void programa() {
        Scanner dato =  new Scanner(System.in);
        
        int n;

        while(true) {
            try{
                System.out.print("Ingresa valor: ");
                n = dato.nextInt();
                // System.out.println("Tu valor es Valido");
                if(n == 0){
                    System.out.println("Adios...");
                    break;
                }
                else{
                    System.out.println("Tu valor es valido");
                }
            }
            catch(Exception ex){
                dato.nextLine();
                System.out.println("Valor invalido");
            }
            
            // catch(InputMismatchException ex){
            //     dato.nextLine();
            //     System.out.println("Valor invalido");
            // }
        }
    }
    
    public static void main(String[] args) {
        Excepciones e = new Excepciones();
        e.programa();
    }
}
