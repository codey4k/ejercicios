/*
 Write a small program where:
   -The current year is entered.
   - Enter the name and year of birth of three people.
   - It calculates how many years they will fulfill during the current year.
   - Prints on the screen.
*/
import java.util.Scanner;

public class edades {

    public static void main(String args[]) {

        Scanner date = new Scanner(System.in);

        String names[] = new String[3];
        int years[] = new int[3];
        int currentYear;

        System.out.print("Current year: ");
        currentYear = date.nextInt();        

        for(int i = 0; i < 3; i++){
            System.out.print("Person name: ");
            names[i] = date.next();
       
            System.out.print(names[i] + " birth year: ");
            years[i] = date.nextInt();
      
        }
        
        System.out.println("\n\n");
        
        for(int i = 0; i < 3; i++){
            System.out.println(names[i] + " is " + (currentYear - years[i]) + " years old");
        }
    }

}
