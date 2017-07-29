class Persona:
    def __init__(self, nombre, apellido):
        self.nombre = nombre
        self.apellido = apellido
        self.__saludo = "Hola "

    def saludando(self):
        print self.__saludo + self.nombre +" "+ self.apellido

name = raw_input("Dime tu nombre ")
print "se creo la variable %s" % name
apellido = raw_input("Dame tu apellido ")
print "se creo la variable %s" % apellido

yo = Persona(name, apellido)

yo.saludando()
