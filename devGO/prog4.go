package main

import "fmt"

type Person struct {
    age int
    name,lastname string
}

func (person Person) getData() (int, string, string) {
    return person.age, person.name, person.lastname
}

func main() {

    people1 := new(Person)
    fmt.Print("What is your firt name ")
    fmt.Scanf("%s", &people1.name)
    
    fmt.Print("What is your lastname? ")
    fmt.Scanf("%s", &people1.lastname)
    
    fmt.Print("Give me your age ")
    fmt.Scanf("%d",&people1.age)

    fmt.Println(people1.getData())

}
