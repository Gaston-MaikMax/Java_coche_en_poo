
package coche;
 import java.util.Scanner;
public class Rueda
{
int num_aro;
String tipo;
String marca;
String vida_util;
Scanner sc = new Scanner (System.in);
public Rueda ()
{
num_aro = 13;
tipo = "radial";
marca = "Michelin";
vida_util = "2 años";
}
/* Opcional
public Rueda (int na, String ti, String ma, String vu)
{
num_aro = na;
tipo = ti;
marca = ma;
vida_util = vu;
}*/
public void leer_r()
{
System.out.println("------DATOS DE LA RUEDA------");
System.out.print("Intro. Nº de aro => ");
num_aro = sc.nextInt();
System.out.print("Intro. El tipo => ");
tipo = sc.next();
System.out.print("Intro. la marca => ");
marca = sc.next();
System.out.print("Intro. vida util => ");
vida_util = sc.next();
}
public void mostrar_r()
{
System.out.println("------DATOS DE LA RUEDA------");
System.out.println("Nº de Cilindros => "+num_aro);
System.out.println("El tipo => "+tipo);
System.out.println("El origen => "+marca);
System.out.println("Fabricante => "+vida_util);
}
public int getNum_aro() {
return num_aro;
}
public String getTipo() {
return tipo;
}
public String getMarca() {
return marca;
}
public String getVida_util() {
return vida_util;
}
}
    

