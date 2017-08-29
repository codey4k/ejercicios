#currying

def f(a):
    def g(b,c):
        print((a + b) * c)
    return g

f(2)(2, 4)
