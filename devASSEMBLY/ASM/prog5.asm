;constantes
SYS_CALL_WRITE equ 4

SYS_CALL_EXIT  equ 1
;INTER          equ 0x80
%assign STDOUT 1
%assign INTER  0x80
%define CADENA "Y4K"

global _start
section .text
    _start:
        jmp etiqueta
        
    exit:
        mov eax, SYS_CALL_EXIT
        mov ebx, 0
        int INTER
        
    etiqueta:
        mov eax, SYS_CALL_WRITE
        mov ebx, STDOUT
        mov ecx, algo
        mov edx, len
        int INTER
        
        jmp exit

        
section .data
    ;algo: times 4 db "Hello world", 0xA
    algo: db CADENA, 0xA
    len: equ $-algo

;section .bss