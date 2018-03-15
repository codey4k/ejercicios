package main

import "fmt"

func parimpar(n int) {
	if n % 2 == 0 {
		fmt.Printf("%d es par\n", n)
	} else {
		fmt.Printf("%d es impar\n", n)
	}
}

func main() {

	var number int
	fmt.Print("Get me a number ")
	fmt.Scanf("%d", &number)

	parimpar(number)

}
