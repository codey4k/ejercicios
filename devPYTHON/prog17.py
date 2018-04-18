#menu
import os
import time
#import modulo

class Menu:
    def saludo(self):
        os.system("clear")
        print("Hola!!")
        time.sleep(1.6)
        #os.system("clear")

    def ladra(self):
        os.system("clear")
        print("guagu guagu!!")
        time.sleep(1.6)
        #os.system("clear")

    def pedirnumero(self):
        while True:
            try:
                opcion = int(raw_input("Selecciona una opcion "))
                break
            except ValueError:
                print("Valor incorrecto, intenta de nuevo")

        return opcion

instancia = Menu()

if __name__ == "__main__":
    
    while(True):
 
        os.system("clear")
        time.sleep(1.8)
        print("Bienvenido al menu")
        print("[0] Ladra.")
        print("[1] Saluda.")
        print("[2] Salir.")
        #dato = int(raw_input(" "))

        dato = instancia.pedirnumero()

        if(dato == 0):
            instancia.saludo()
            #os.system("clear")
        elif(dato == 1):
            instancia.ladra()
        elif(dato == 2):
            print("Chao...")
            break
        elif(dato >= 3):
            time.sleep(1.2)
            print("Intenta de nuevo...")