import java.util.Scanner;

class Binario {
    
    public String binario(int n) {
        String bin = "";
        while(n >= 1){
            int residuo = n % 2;
            bin = residuo + bin;
            n = n / 2;
        }
        return bin;
    }

    public void leerDato(){
        Scanner dato = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Dame uno entero ");
            numero = dato.nextInt();
            
        }while(numero < 0);

        String resultado = binario(numero);
        //int r = Integer.parseInt(resultado);
        System.out.println("El numero binario de tu entero es "+resultado);
    }

    public static void main(String[] args){
        Binario binary = new Binario();
        binary.leerDato();
    }
}
