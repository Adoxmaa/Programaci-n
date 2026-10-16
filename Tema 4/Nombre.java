import java.util.Scanner;
public class Nombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
Escribe un programa que lea el nombre y dos 
apellidos y nos almacene en cades separadas 
el nombre, el primer apellido y el segundo apellido. 
*/
        System.out.println("Introduzca su nombre y apellidos");
        String completo = sc.nextLine();

        int k = completo.indexOf(" ");
        String nombre = completo.substring(0, k);
        String resto = completo.substring(k + 1);

        int k2 = resto.indexOf(" ");
        String apellido1 = resto.substring(0, k2);
        String apellido2 = resto.substring(k2 + 1);

        System.out.println(nombre);
        System.out.println(apellido1);
        System.out.println(apellido2);

        sc.close();
    }
}