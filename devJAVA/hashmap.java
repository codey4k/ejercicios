import java.util.Scanner;
import java.util.HashMap;

class hashmap {
    public static void main(String[] args){
        Scanner dt = new Scanner(System.in);
        String a;
        HashMap<Integer,String> names = new HashMap<Integer,String>();

        for(int i = 0 ; i < 3 ; i++){
            System.out.print("Dame nombre: ");
            a = dt.next();
            names.put(i, a);
        }

        for(String name : names){
            System.out.println(names.get(name));
        }
    }
}
