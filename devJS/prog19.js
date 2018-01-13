//Promises

const datos = [
    {id:1,name:'Emii',profesion:'Analista de sistemas'},
    {id:2,name:'Yakiel',profesion:'FullStack Developer'},
    {id:3,name:'Vanessa',profesion:'Programador'}
]

function getUser() {
    return new Promise((resolved, reject)=>{
        setTimeout(()=>{
            resolved(datos)
        },2000)
    })
}

getUser()
    .then(datos => console.log(datos[8].name))