# Herencia

class Humano
    # attr_accessor :genero, :nombre
    
    def initialize(nombre)
        @nombre = nombre
    end
    
    def saludo
        puts "Hola #{@nombre}, eres #{@genero}"
    end
end

class Hombre < Humano
    def initialize(nombre)
        @genero = "chico"
        super(nombre)
    end
end

class Mujer < Humano
    def initialize(nombre)
        @genero  = "chica"
        super(nombre)
    end
end

yakiel = Hombre.new("Yakiel")
yakiel.saludo
    
emii = Mujer.new("Emilly")
emii.saludo