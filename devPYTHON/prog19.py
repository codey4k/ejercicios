import os

archivo = raw_input('Nombre del archivo ')

palabra = raw_input('Ingresa la palabra clave ')

def analizar():
    analisis = open(archivo, 'r')
    
    if palabra in analisis.read():
        print('Se encontro el codigo...')
        analisis.close()
    else:
        print('Tranquilo/a, archivo limpio...')
        # print('Algo anda mal')

if archivo in os.listdir('./'):
    analizar()
    
else:
    print('algo anda mal')
