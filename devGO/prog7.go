package main

import "fmt"

const SALUDO string = "Hello"

func getName() {
    fmt.Printf("%s\n", SALUDO)
}

func main() {
    var nombre string

    fmt.Print("Cual es tu nombre? ")
    fmt.Scanf("%d", &nombre)
    
    getName()
}
