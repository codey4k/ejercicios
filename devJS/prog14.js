//contatenar elementos de una lista sin usar concat ni join
const lista = ['L', 'u', 'i', 's']

let reductor = lista.reduce((p,c)=>p +c, '')

console.log(reductor)