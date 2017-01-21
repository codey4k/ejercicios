=begin
    Creacion e instancia basica de objetos
=end


class App

    def initialize()
    end

    def saludo(nombre)
        puts "Hello #{nombre}"
    end

end


filtro = App.new()
puts filtro.saludo("Y4k")
