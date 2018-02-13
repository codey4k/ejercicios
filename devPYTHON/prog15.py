"""
    Manejo de excepciones
"""

print("Welcome")

control = True

while control:
    try:
        n = int(raw_input("ingresa numero "))
        if(n == 0):
            print("Bye...")
            # break
            control = False
        else:
            print("Escribiste %d" % (n))
            
    except ValueError:
        print("Valor invalido...")

"""
while control:
    n = int(raw_input("Ingresa un valor: "))
    control = False
"""
