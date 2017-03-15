function closure() {

    var uno = ' mundo'

    var dos = x => x + uno

    return dos

}

var saludando = closure()

console.log( saludando('Hola') )
