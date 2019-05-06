// let arr = [1,2],
//     lista = [...arr, 3, 4]

// console.log(lista[0])

//Solucion Codewars

function calculate(...args){
	let ages = args
		.slice()
		.map(n => n * n)
		.reduce((a, b) => a + b, 0)
	
	let total = Math.sqrt(ages) / 2
	console.log(Math.trunc(total) )
}

calculate(65,60,75,55,60,63,64,45)