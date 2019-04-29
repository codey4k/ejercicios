%macro imprime 4
    mov eax, %1
    mov ebx, %2
    mov ecx, %3
    mov edx, %4
    int 0x80
%endmacro

SYS_CALL_WRITE equ 4

section .text
    rutina:
        imprime SYS_CALL_WRITE, 2, saludo, len_saludo
        ret
global _start
    _start:
        jmp otro

        inicio:
            call rutina

        otro:
            imprime SYS_CALL_WRITE, 2, otra_cosa, len_otra_cosa

        finalizar:
            mov eax, 1
            mov ebx, 0
            int 0x80

section .data
    saludo db "Hello world", 0x0A
    len_saludo equ $-saludo
    
    otra_cosa db "Otra cosa", 0x0a
    len_otra_cosa equ $-otra_cosa   
;section .bss
