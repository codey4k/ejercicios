n = raw_input("Dame un numero: ")

def invertir(n):
    #listaN = str(n)
    vacia = []
    for i in str(n):
        vacia.append(i)

    indice = len(vacia) - 1
    nueva_lista = []
    while indice >= 0:
        nueva_lista.append(vacia[indice])
        indice -= 1
    
    resultado = "".join(nueva_lista)
    return resultado

print(invertir(n))
