interface Persona {}

function decoradorClase(target:Function) {
    return function(target) {
        console.log('Funcionando!'+ target)
    }
}

@decoradorClase
class Persona implements Persona{
    constructor(){}
}

const objeto = new Persona()

// objeto.saludo()

// console.log(objeto)
