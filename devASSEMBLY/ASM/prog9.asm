section .text
global _start    
    procedimiento:
        
        xor eax, eax
        mov al, 0x04
        xor ebx, ebx
        mov bl, 0x01
        pop ecx
        xor edx, edx
        mov dl, 0x11
        int 0x80
        
        xor eax, eax
        mov al, 0x01
        xor ebx, ebx
        mov bl, 0x01
        int 0x80
        ret

    _start:
        jmp mensaje

        mensaje:
            call procedimiento
            len equ $-logrado
            logrado db "funcionando", 0x0a
            len equ $-logrado           

section .data
    ;vacio
