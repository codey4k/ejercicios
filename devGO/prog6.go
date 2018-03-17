package main

import "fmt"

func main() {
    var arr [3] int

    fmt.Println("Ingresa tres numeros enteros ")
    
    for i := 0; i <= 2; i++ {
        fmt.Scanf("%d", &arr[i])
    }

    fmt.Println(arr)
}
