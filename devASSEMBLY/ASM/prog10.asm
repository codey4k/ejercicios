section .text
global _start
    _start:
  
    inicio:
        xor eax, eax
        mov ax, [nombre]
        push ax

    imrimir:
        xor eax, eax
        mov al, 4
        xor ebx, ebx
        mov bl, 1
        pop ecx
        xor edx, ebx
        mov dl, 4
        int 0x80

    final:
        xor eax, eax
        mov al, 1
        int 0x80

section .data
    nombre db "Y4k", 0x0A
