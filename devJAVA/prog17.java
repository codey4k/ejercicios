//sobrecarga de constructores
import java.util.Scanner;

class Empleado {

    //private final int N = 4;
    //variables
    String nombre, cargo;
    double sueldo;
    //primer constructor
    Empleado(String nom, double s, String c ){
        nombre = nom;
        sueldo = s;
        cargo = c;
    }
    
    //segundo constructor
    Empleado(String nom){
        //aca se asignan datos por defecto
        this(nom, 100.000, "simple");
    }
    
    public String setNombre() {
        return nombre;
    }

    public double setSueldo() {
        return sueldo;
    }
    
    public String setCargo() {
        return cargo;
    }    

    public static void main(String[] args){
        //solo llamo al segundo constructor
        Empleado empl = new Empleado("Yakiel",100.000,"programador");
        
        System.out.println("Empleado: " + empl.setNombre() + "\n"
                         + "su sueldo es: " + empl.setSueldo() + "\n"
                         + "su cargo es: " + empl.setCargo()
        );
    }
}







