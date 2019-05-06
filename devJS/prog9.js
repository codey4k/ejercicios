/*'use-strict'

let app = x => x * 3

console.log(app(5))
*/

//SOlucion Codewars

const cadena = 'Yakiel Forta'

function abbrevName(name) {
	let str = name.split(' '),
		 inicial = ''
	for(let i = 0; i < str.length; i++) {
		inicial += str[i].substr(0, 1)
	}

	return inicial.split('').join('.')
}

console.log(abbrevName(cadena))
