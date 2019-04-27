%macro imprime 2
    mov eax, 4
    mov ebx, 1
    mov ecx, %1
    mov edx, %2
    int 0x80
%endmacro


section .text

procedimiento:
    ret

global _start
    _start:
       
        ;crear archivo
        mov eax, 8
        mov ebx, file_name
        mov ecx, 0777
        int 0x80
       
        mov [fd], eax
        ;escribir en el archivo
        mov edx, len
        mov ecx, texto
        mov ebx, [fd]
        mov eax, 4
        int 0x80
    
        ;cerrar archivo
        mov eax, 6
        mov ebx, [fd]
        int 0x80

        salir:
            mov eax, 1
            mov ebx, 0
            int 0x80

section .data
    file_name db "archivo.txt"
    texto db "Funcionando"
    len equ $-texto

section .bss
    fd resb 1
