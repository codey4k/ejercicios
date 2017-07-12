const readline = require('readline')

const q = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

q.question('Cual es tu nombre ', answer => {
  
  console.log(`Mucho gusto ${answer}`)

  q.close()
})
