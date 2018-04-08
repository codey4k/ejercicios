"""
    Validacion de password
"""

# password = raw_input("Ingresa contrasena ")

def validador(n):
    while True:
        passw = raw_input("ingresa tu pass")
        if len(n) >= 8:
            print("Contrasena valida")
            break
        else:
            print("Password invalido intentalo de nuevo")
            break
    
    
# validador()