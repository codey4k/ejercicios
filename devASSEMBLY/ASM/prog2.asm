section .data
    bufnum1 db 6,?,6 dup (?),'$'
    
global _start

section .text

_start:

mov ah, 0ah
mov dx, offset bufnum1
mov 21h