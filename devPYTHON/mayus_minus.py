"""
    Programa que compruebe si un caracter
    esta en mayuscula o minuscula
"""

mayusculas = "ABCDEFGHIJKLMNPOQRSTUVWXYZ"

minuscula = "abcdefghijklmnopqrstuvwxyz"

letra = raw_input("Ingresa caracter: ")

if letra in mayusculas:
    print "es Mayuscula"
elif letra in minuscula:
    print "es Minuscula"
else:
    print "Error"
