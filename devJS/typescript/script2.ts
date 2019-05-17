interface Contrato {
    name:string;
}

class Humano implements Contrato {
    name:string;
    
    public constructor(n){
        this.name = n;
    }
    
    public getName() {
        console.log(this.name);
    }
}

class Persona extends Humano {
    public constructor() {
        super(n)
    }
}

const e = new Persona('Y4k')
e.getName()
