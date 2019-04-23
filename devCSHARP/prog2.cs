using System;
/*using System.IO;*/

namespace prog2 {

    class Programa {
        public static int calculo(int a, int b) {
            return a + b;
        }
        
        public static void Main(string[] args) {
            
            int [] n = new int[2];
            
            for(int i = 0; i < 2; i++){
                Console.WriteLine("ingresa valor " + (i+1));
                n[i] = Int32.Parse(Console.ReadLine());
            }

            Console.WriteLine("El resultado es: " + calculo(n[0], n[1]));

        }
        
    }

}
