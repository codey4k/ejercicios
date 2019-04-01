import os
 
directorio = raw_input('Dame un nombre de carpeta ')

def tarea():
    if directorio in os.listdir('./'):
        # print('Ya existe el directorio {}'.format(dir))
        os.rmdir(directorio)
    else:
        os.mkdir(directorio)
        
if __name__ == "__main__":
    tarea()