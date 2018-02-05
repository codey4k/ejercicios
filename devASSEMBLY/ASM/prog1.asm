section .data ; data section
    msg: db "Happy hacking", 0xA
    len: equ $-msg
;section .bss  ; v:ariables

;section .text ; code section

global _start

section .text 
   
_start:
    mov eax, 4      ;0x4 Sys call write
    mov ebx, 1      ;0x1 Sys call exit
    mov ecx, msg    ;string
    mov edx, len    ;tag para saber cuantos bytes se estan consumiento
    int 0x80        ;Interruption call

;asegurarse de que el programa sale
    mov eax, 1      ;Sys call exit
    mov ebx, 3      ;Valor de retorno, puede ser cualquier entero
    int 0x80        ;Interruption call


