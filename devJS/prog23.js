const promesa = new Promise((resolve, reject)=>{
    let resultado = true

    if(resultado) {
        resolve("Promesa exitosa")
    }
    else {
        reject("promesa fallida")
    }
})

promesa.then(msj => console.log(msj))

promesa.catch(msj=> console.log(msj))
