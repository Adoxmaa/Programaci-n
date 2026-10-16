import java.util.Scanner;
public class P4 {
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduzca su nombre y un apellido");
        String nombre=sc.next();
        int k = nombre.indexOf (" ");
        String Nombre=nombre.substring(0, k);
        String Apellido=nombre.substring(k+1);
        System.out.println(Nombre);
        System.out.println(Apellido);
        sc.close();
    }
}