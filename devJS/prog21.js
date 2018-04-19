const People = new Set()

People
    .add("Emii")
    .add("Y4k")
    .add("Vanessa")


let personas = [...People]

for(let i = 0; i < personas.length; i++){
    console.log(personas[i])
}
// console.log(People.has("Y4k"))
