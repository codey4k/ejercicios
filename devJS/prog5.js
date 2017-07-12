class Humano {
    constructor(nombre, apellido){
        this.nombre = nombre
        this.apellido = apellido
    }

    saludo(){
        console.log("Mi nombre es " + this.nombre + " " +this.apellido)
    }
}

const yo = new Humano("Yakiel", "Forta")

yo.saludo()
