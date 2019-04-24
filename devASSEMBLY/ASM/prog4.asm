section .data
    first: db "Escribe un dato "
    lenfirst: equ $-first
    
    second: db "escribiste: "
    lensecond: equ $-second

section .bss
    n resb 5

global _start

section .text

_start:
    ;primer mensaje
    mov eax, 4
    mov ebx, 1
    mov ecx, first
    mov edx, lenfirst
    int 0x80
    ;lee el dato
    mov eax, 3
    mov ebx, 2
    mov ecx, n
    mov edx, 5
    int 0x80
    ;imprime
    mov eax, 4
    mov ebx, 1
    mov ecx, second
    mov edx, lensecond
    int 0x80
    ; tambien imprime
    mov eax, 4
    mov ebx, 1
    mov ecx, n
    mov edx, 5
    int 0x80

    mov eax, 1
    mov ebx, 0
    int 0x80
