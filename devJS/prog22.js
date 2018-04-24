class Persona {
    constructor(nombre) {
        this.nombre = nombre
    }
    
    getName() {
        console.log("hello " + this.nombre)
    }
}

class Hombre extends Persona {
    constructor(){
        super()
    }
}

let Y4k = new Hombre("Yakiel")
Y4k.getName()