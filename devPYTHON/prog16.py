"""
    Escribe un programa que pida dos palabras y diga si riman o no. 
    Si coinciden las tres ultimas letras tiene que decir que riman.
    Si coinciden solo las dos ultimas tiene que decir que riman 
    un poco y si no, que no riman.
"""

palabra1 = raw_input("Ingresa una palabra ")
palabra2 = raw_input("Ingresa otra palabra ")

def pruebadeRimas(p1, p2):
    if(p1[-3:] == p2[-3:]):
        print "Las palabras riman"
    else:
        print "Las palabras NO riman"

pruebadeRimas(palabra1, palabra2)
