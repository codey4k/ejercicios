let promesa = new Promise( (resolve, reject) => 
	false ? resolve('Exito!') : reject('Error!')
)

promesa
	.then(Message => console.log(Message))
	.catch(err => console.log(err))