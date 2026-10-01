import java.util.Scanner;
public class CertificadodeEdad {
    public static void main(String [] args) {
        Scanner sc= new Scanner (System.in);
         System.out.println("Introduzca su edad para calificar si es mayor de edad");
         int edad= sc.nextInt();
         if (edad >= 18){
             System.out.println ("Si eres mayor de edad");
         }
         else{
             System.out.println ("No eres mayor de edad");
    }
    }
}