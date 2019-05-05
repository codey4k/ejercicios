function longest(s1, s2) {
  
    let caracter = "";
    for(var i = 0; i < s1.length; i++){
  	    for(var s = 0; i < s2.length; s++){
    	    if(s1.charAt(i) != s2.charAt(s)){
      	        caracter.concat(i);
            }
        }
    }

  return caracter.sort();
}

longest('osdjfis','wweresdasd')