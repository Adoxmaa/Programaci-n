import java.util.Scanner;
public class Divc {
    public static void main(String[] args) {
        /*Aquí hay un programa que verifica si un número es divisible 
        por 2 y 3, si un número es divisible por 2 ó 3, y si un número 
        es divisible por 2 ó 3 pero no por ambos:
 */
        Scanner sc= new Scanner (System.in);
        System.out.print("Introduzca un numero ");
        int num=sc.nextInt();
        
        if (num%2==0 && num%3==0){
            System.out.println("El número es divisible por 2 y 3");
        }
        else if (num%2==0){
            System.out.println("El número es divisible por 2");
        }
        else if (num%3==0){
            System.out.println("El número es divisible por 3");
        }
        else if (num%2==0 ^ num%3==0){
            System.out.println("El número es divisible por 2 o 3 pero no por ambos");
        }
        else{
            System.out.println("El número no es divisible por 2 ni por 3");
        }
        sc.close();
    }
}