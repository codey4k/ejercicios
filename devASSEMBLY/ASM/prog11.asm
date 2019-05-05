%macro imprimir 2
    mov eax, 4
    mov ebx, 1
    mov ecx, %1
    mov edx, %2
    int 0x80
%endmacro

%macro teclado 2
    mov eax, 3
    mov ebx, 0
    mov ecx, %1
    mov edx, %2
    int 0x80
%endmacro

section .data
    msj1 db "Escribe un numero", 0x0A
    len_msj1 equ $-msj1

    array db 0, 1, 2, 3
    len_array equ $-array

section .bss
    var resb 2

section .text
global _start
    
    _start:
    
    inicio:
        
        add ebx, [array+2]
        add ebx, '0'
        mov [var], ebx
        
        
        imprimir var, 1

    salir:
        mov eax, 0x01
        ;xor ebx, ebx
        int 0x80
