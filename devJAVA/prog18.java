//Ejemplo de interfaces y sobrecarga de metodos
public interface Person{
    public void saludo();
}

public class Hombre implements Person {
    public Hombre(String nombre) {
        this.nombre = nombre;
    }
    
    @override
    public void saludo() {
        System.out.println("Hola soy un hombre");
    }
}

public class Mujer implements Person {
    public Mujer(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void saludo() {
        System.out.println("Hola soy una mujer");
    }
    
}

class Person extends{
    public static void main(String[] args){
        
    }
}






