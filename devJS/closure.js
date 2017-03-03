function closure() {

    var uno = 'Hola'

    var dos = x => x + uno

    return dos

}

var saludando = closure()

console.log( saludando(' mundo') )
