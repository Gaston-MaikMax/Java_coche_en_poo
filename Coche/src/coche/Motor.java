
package coche;
import java.util.Scanner;
public class Motor 
{
int num_cil;
String tipo;
String origen;
String fabricante;
Scanner sc = new Scanner (System.in);
public Motor ()
{
num_cil = 4;
tipo = "gas";
origen = "Japon";
fabricante = "Taito Motors";
}
public void leer_m()
{
System.out.println("------DATOS DEL MOTOR------");
System.out.print("Intro. Nº de Cilindros => ");
num_cil = sc.nextInt();
System.out.print("Intro. El tipo => ");
tipo = sc.next();
System.out.print("Intro. El origen => ");
origen = sc.next();
Scanner gdfgdfg = new Scanner (System.in);
System.out.print("Intro. fabricante => ");
fabricante = sc.next();
}
public void mostrar_m()
{
System.out.println("------DATOS DEL MOTOR------");
System.out.println("Nº de Cilindros => "+num_cil);
System.out.println("El tipo => "+tipo);
System.out.println("El origen => "+origen);
System.out.println("Fabricante => "+fabricante);
}
public int getNum_cil() {
return num_cil;
}
public String getTipo() {
return tipo;
}
public String getOrigen() {
return origen;
}
public String getFabricante() {
return fabricante;
}
}
    

