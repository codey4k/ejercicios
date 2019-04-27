global _start

section .text

_start:
jmp message

proc:
    xor eax, eax
    mov al, 0x04
    xor ebx, ebx
    mov bl, 0x01
    pop ecx
    xor edx, edx
    mov dl, 0x16
    int 0x80

    xor eax, eax
    mov al, 0x01
    xor ebx, ebx
    mov bl, 0x01   ; return 1
    int 0x80

message:
    call proc
    msg db " y0u sp34k 1337 ? "

section .data
