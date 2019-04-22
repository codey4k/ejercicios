Program programa;


function retorno(Valor: Integer) : Integer;
var
    Resultado : Integer;
begin
    Resultado := Valor * 5;
end;
(*procedimiento*)
procedure imprime;
var
    n : Integer;
begin
    n := 5;
    writeln(retorno(n));
end;


begin
    imprime;
end.
