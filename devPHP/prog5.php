<?php
    
    class Animal {
        public function __construct($name){
            $this->name = $name;
        }
    }
    
    class Perro extends Animal {
        private $ladrido = "guau";
        
        public function sonido() {
            echo "Hola soy " . $this->name . " " . $this->ladrido;
        }
    }
    
    $instancia = new Perro("Triki");
    $instancia->sonido();