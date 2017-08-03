email = raw_input("Dame tu email ")
validacion = False

while validacion == False:
    if("@" in email and "." in email):
        print "Email valido!"
        validacion = True
    else:
        email = raw_input("Dame un email valido ")
