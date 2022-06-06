
package coche;

import coche.Coche;
import coche.Motor;
import coche.Rueda;

public class Principal
{
     public static void main(String[] args) 
     {
  

Motor M1 = new Motor ();
Rueda R1 = new Rueda ();
//Usara Constructor por defecto
Coche C1 = new Coche ();
// Usara constructor con argumentos
Coche C2 = new Coche (M1, R1);
// Leera datos por teclado
Coche C3 = new Coche ();
C3.leer_c();
System.out.println("\n\n********* DATOS DEL COCHE 1 *********");
C1.mostrar_c();
System.out.println("\n\n********* DATOS DEL COCHE 2 *********");
C2.mostrar_c();
System.out.println("\n\n********* DATOS DEL COCHE 3 *********");
C3.mostrar_c();
//a)
C1.verifica_NumAro(C1, C2, C3);
System.out.println("");
//b)
C3.verifica_motores(C1, C3);
//c)
C3.muestra_atrib();
//d)
C3.verifica_chassis(C1, C2, C3);
}
    
}
