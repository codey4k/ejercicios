/*
'use-strict'

var iterable = 'codey4k'

for(var i of iterable){
    console.log(i)
}
*/

// Codewars

function abbrevName(name) {
	let cosa = name.split(' '),
		 inicial = ''
	for(let i = 0; i < cosa.length; i++) {
		inicial += cosa[i].substr(0, 1)
	}
	
	//return inicial.split('').join('.').toUpperCase()
	return inicial.split('').join('.').toUpperCase()
}