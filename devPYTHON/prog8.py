#generador

def genera(limite):
    num = 1
    while num <= limite:
        yield num * 2
        num = num + 1

generador = genera(10)

print("primer valor")
print(next(generador))

print("segundo valor")
print(next(generador))
