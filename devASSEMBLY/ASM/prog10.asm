section .text
global _start
    _start:
  
    imrimir:
        xor eax, eax
        mov al, 4
        xor ebx, ebx
        mov bl, 1
        mov ecx, nombre 
        xor edx, 2
        mov dl, 4
        int 0x80

    final:
        xor eax, eax
        mov al, 1
        int 0x80

section .data
    nombre db "reer", 0x0A
