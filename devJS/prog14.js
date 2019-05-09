//contatenar elementos de una lista sin usar concat ni join
/*
const lista = ['L', 'u', 'i', 's']

let reductor = lista.reduce((p,c)=>p +c, '')

console.log(reductor)
*/

// Codewars
function perro(...args){
	let calculo = args
		.slice()
		.map(n => n * n)
		.reduce((a, b) => a + b, 0)
	
    let total = Math.sqrt(calculo) / 2


console.log(Math.trunc(total) )

}