import java.util.Scanner;
public class P4 {
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
/*
Escribe un programa que lea el nombre y dos 
apellidos y nos almacene en cades separadas 
el nombre, el primer apellido y el segundo apellido. 
*/
        System.out.println("Introduzca su nombre y apellidos");
        String nombre=sc.next();
        int k = nombre.indexOf (" ");
        String Nombre=nombre.substring(0, k);
        String Apellido1=nombre.substring(k-1);
        String Apellido2=nombre.substring(k-1);
        System.out.println(Nombre);
        System.out.println(Apellido1);
        System.out.println(Apellido2);
        sc.close();
    }
}