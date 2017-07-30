class Persona
    def initialize(nombre,edad)
        @nombre = nombre
        @edad = edad
    end

    def saludo()
        puts "Hola #{@nombre} tu edad es #{@edad}"
    end
end

p = Persona.new("Yakiel","Forta")
p.saludo()

p.instance_eval {
    def name
       @name = "Perro"
    end
}

puts p.name
