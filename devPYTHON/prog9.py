#logaritmo basico

def log(b,r):
    contador = True
    n = 0
    while contador:
        if b**n != r:
            n += 1
        else:
            contador = False
            return n

print log(3,243)
