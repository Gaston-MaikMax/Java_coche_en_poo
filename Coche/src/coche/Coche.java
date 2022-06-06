
package coche;
  import java.util.Scanner;
public class Coche
{
String marca;
String color;
int num_chasis;
int modelo;
Scanner sc = new Scanner (System.in);
Motor M1 = new Motor();
Rueda R1 = new Rueda ();
// Rueda R2 = new Rueda (16,"Tubular","KUMO", "3 AÑOS"); Opcional
// Constructor por defecto
public Coche ()
{
marca = "TOYOTA";
color = "Blanco";
num_chasis = 123;
modelo=2000;
}
//Constructor con argumentos
public Coche (Motor x, Rueda y)
{
marca = "NISSAN";
color = "ROJO";
num_chasis = 456;
modelo=2017;
M1 =x;
R1 = y;
}

public void     Coche(Motor M1, Rueda R1) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void leer_c()
{
System.out.println("------DATOS DEL COCHE------");
System.out.print("Intro. la marca => ");
marca = sc.nextLine();
System.out.print("Intro. el color => ");
color = sc.nextLine();
System.out.print("Intro. Nº chasis => ");
num_chasis = sc.nextInt();
System.out.print("Intro. el modelo => ");
modelo = sc.nextInt();
M1.leer_m();
R1.leer_r();
}
public void mostrar_c()
{
System.out.println("------DATOS DEL COCHE------");
System.out.println("Nº de Cilindros => "+marca);
System.out.println("El tipo => "+color);
System.out.println("El origen => "+num_chasis);
System.out.println("Fabricante => "+modelo);
M1.mostrar_m();
R1.mostrar_r();
//R2.mostrar_r(); "opcional"
}
//a)
public void verifica_NumAro (Coche a, Coche b, Coche c)
{
System.out.println("\n------a) VERIFICA SI 3 COCHES TIENEN EL MISMO NUMERO DE ARO------");
if ((a.R1.getNum_aro()== b.R1.getNum_aro()) && (a.R1.getNum_aro()== c.R1.getNum_aro())&& (b.R1.getNum_aro()== c.R1.getNum_aro()))
{
System.out.println("Los coches tienen el mismos Nº de aro");
System.out.println(" => "+a.R1.getNum_aro());
}
else
{
System.out.println("Los coches NO tienen el mismos Nº de aro");
System.out.println(" => "+a.R1.getNum_aro());
System.out.println(" => "+b.R1.getNum_aro());
System.out.println(" => "+c.R1.getNum_aro());
}
}
//b)
public void verifica_motores(Coche x, Coche y)
{
System.out.println("\n------b) VERIFICA SI 2 MOTORES DE LOS COCHES SON IGUALES------");
int nci1 = x.M1.getNum_cil();
String t1 = x.M1.getTipo();
String o1 = x.M1.getOrigen();
String f1 = x.M1.getFabricante();
int nci2 = y.M1.getNum_cil();
String t2 = y.M1.getTipo();
String o2 = y.M1.getOrigen();
String f2 = y.M1.getFabricante();
if ((nci1==nci2) && (t1.equals(t2)) && (o1.equals(o2)) && (f1.equals(f2)))
{
System.out.println("Los Coches tienen los mismos motores");
System.out.println(" => "+x.M1.getNum_cil());
System.out.println(" => "+x.M1.getTipo());
System.out.println(" => "+x.M1.getOrigen());
System.out.println(" => "+x.M1.getFabricante());
}
else
{
System.out.println("Los Coches NO tienen los mismos motores");
System.out.println(" => "+x.M1.getNum_cil());
System.out.println(" => "+x.M1.getTipo());
System.out.println(" => "+x.M1.getOrigen());
System.out.println(" => "+x.M1.getFabricante());
System.out.println("");
System.out.println(" => "+y.M1.getNum_cil());
System.out.println(" => "+y.M1.getTipo());
System.out.println(" => "+y.M1.getOrigen());
System.out.println(" => "+y.M1.getFabricante());
}
}
//c)
public void muestra_atrib ()
{
System.out.println("\n------c) MUESTRA ATRIBUTOS DE: 'MOTOR-COCHE,RUEDA'------");
System.out.println("Origen del motor => "+ M1.getOrigen());
System.out.println("Fabricante del motor => "+ M1.getFabricante());
System.out.println("Modelo del coche => "+ modelo);
System.out.println("Marca del coche => "+ marca);
System.out.println("Numero de aro => "+ R1.getNum_aro());
System.out.println("Tipo de rueda => "+ R1.getTipo());
}
//d)
public void verifica_chassis (Coche x, Coche y, Coche z)
{
System.out.println("\n------d) VERIFICA SI 3 COCHES TIENEN CHASIS CLONADO------");
int nc1= x.getNum_chasis();
int nc2= y.getNum_chasis();
int nc3= z.getNum_chasis();
if ((nc1==nc2)&&(nc1==nc3)&&(nc2==nc3))
{
System.out.println("El numero de los chasis son clonados");
System.out.println(" ==>"+x.getNum_chasis());
}
else
{
System.out.println("El numero de los chasis NO son clonados");
System.out.println(" => "+x.getNum_chasis());
System.out.println(" => "+y.getNum_chasis());
System.out.println(" => "+z.getNum_chasis());
}
}
public String getMarca() {
return marca;
}
public String getColor() {
return color;
}
public int getNum_chasis() {
return num_chasis;
}
public int getModelo() {
return modelo;
}
}


    

