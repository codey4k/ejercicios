
var capitals = function (word) {
  var mayus = []
  for(var i = 0; i < word.length; i++) {
    if(word[i] == word[i].toUpperCase()) {
        mayus.push(i)
    }
  }
  return mayus;
}

var resultado = capitals("Codey4k")

console.log(resultado)