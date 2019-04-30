section .text
global _start    
    procedimiento:
       
        pop ecx
        xor eax, eax
        mov al, 0x04
        xor ebx, ebx
        mov bl, 0x01
        xor edx, edx
        mov dl, 0x12
        int 0x80
        
        ret

    _start:
        jmp mensaje

        mensaje:
            call procedimiento
            db "funcionando", 0x0A

        finalizar:
            xor eax, eax
            inc al
            int 0x80

    ;vacio
