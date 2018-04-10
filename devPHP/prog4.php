<?php
    
    $arreglo = [
        0 => "uno",
        1 => "dos",
        2 => "tres",
        3 => "cuatro"
    ];
    
    for($var = 0; $var <= count($arreglo); $var++){
        printf("%s\n", $arreglo[$var]);
    }
    
    // echo $arreglo["uno"];