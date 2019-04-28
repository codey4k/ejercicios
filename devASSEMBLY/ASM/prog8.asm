%macro imprime 3
    mov eax, %1
    mov ebx, 2
    mov ecx, %2
    mov edx, %3
    int 0x80
%endmacro

SYS_CALL_WRITE equ 4

section .text
global _start
    _start:
        jmp inicio

        inicio:
            imprime SYS_CALL_WRITE, saludo, len_saludo   
            ;1jmp inicio
            
        finalizar:
            mov eax, 1
            mov ebx, 0
            int 0x80

section .data
    saludo db "Hello world", 0x0A
    len_saludo equ $-saludo
    
;section .bss
