//recursividad

const lista = ['Uno','Dos','Tres']

function recursive(n) {
    let variable = []
    if(n < 5) {
        variable[n] = 'culo'
        return recursive(n+1)
    }
    else {
        return variable
    }
 
}

console.log(recursive(10))
