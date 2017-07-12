class Person {
    constructor(name, lastname){
        this.name = name
        this.lastname = lastname
    }

    fullName(){
        return this.name + this.lastname
    }
}
var human = new Person('Yakiel ', 'Forta')

console.log(human.fullName())
