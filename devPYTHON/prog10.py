#recursividad

def recursive(n):
    if n >= 1:
        return recursive(n-1)
    else:
        return n

print recursive(200)
