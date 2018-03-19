class Persona
    
    def initialize(nombre, edad)
        @nombre = nombre
        @edad = edad
    end
    
    def saludo()
        puts "Hola #{@nombre}, tu edad es: #{@edad}"
    end
    
end

print "Ingresa nombre: "
nombre = gets.chomp

print "ingresa tu edad: "
edad = gets.chomp

persona = Persona.new(nombre, edad)

persona.saludo()