import java.util.Scanner;

class multi {
    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);
    
        int n1, n2;
       
        System.out.print("Primer numero ");
        n1 = dato.nextInt();
    
        System.out.print("Segundo numero ");
        n2 = dato.nextInt();
        
        if(n1 >= n2){
            for(int i = n1 ; i >= n2 ; i-- ){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
        else{
            while(n2 >= n1){
                if(n2 % 2 == 0){
                    System.out.println(n2);
                }
                n2--;
            }
        }
        
    }
}
