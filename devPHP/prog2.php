<?php

    class Persona {
        
        public function __construct($name, $lastname){
            $this->name = $name;
            $this->lastname = $lastname;
        }
        
        public function fullName() {
            return 'Hola, ' . $this->name .' '. $this->lastname . '!';
        }
    }

    $persona = new Persona('Yakiel', 'Forta');

    echo $persona->fullName();

?>
