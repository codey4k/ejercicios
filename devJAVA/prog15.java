// Creacion de objetos

class Humano {
    
    //atributos
    private String nombre, sexo;
    private int edad;

    //constructor
    public Humano(String att1, int att2, String att3){
        nombre = att1;
        edad = att2;
        sexo = att3;
    }
    
    public static void main(String[] args){ 
        
        //Instancia
        Humano persona = new Humano("Yak", 27, "varon");

        System.out.println("Hola "+persona.nombre+", tienes "+persona.edad+" y eres "+persona.sexo);
    }
}