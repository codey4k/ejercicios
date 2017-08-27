// Sumar las edades de las personas mayores de edad
const nomina = [
    {nombre:"Yakiel", edad : 27},
    {nombre:"Emilly", edad: 22},
    {nombre: "Fulano", edad: 18}
]

let total = nomina
                  .map(e => e.edad)
                  .filter(e => e >= 18)
                  .reduce((prev, curr) => prev + curr, 0)

console.log(total)