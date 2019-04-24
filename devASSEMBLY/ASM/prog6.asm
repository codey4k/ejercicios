
%macro imprime 4 
    mov   eax, %1
    mov   ebx, %2
    mov   ecx, %3
    mov   edx, %4
    int   0x80
%endmacro

SYS_CALL_WRITE db 4
SYS_CALL_EXIT  db 1

%define STDOUT    1
%define CADENA    "codey4k"
   
global _start
section	.text
	
    _start:
    
        imprime SYS_CALL_WRITE, STDOUT, nombre, len
        
        mov eax, SYS_CALL_EXIT
        mov ebx, 0
        int 0x80
        
section	.data
    nombre: db "codey4k", 0x0A
    len: equ $-nombre
