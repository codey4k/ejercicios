
"""
Escribir una funcion filtrar_palabras()
 que tome una lista de palabras y un entero n,
 y devuelva las palabras que tengan mas de n caracteres. 
"""

lista = ["haskell", "python", "javascript", "Java", "objective-c", "cpp"]

#metodo imperativo

def filtrar_palabras(l, n):
    for i in l:
        if len(i) > n:        
            print i

filtrar_palabras(lista, 4)
