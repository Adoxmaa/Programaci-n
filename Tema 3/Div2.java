import java.util.Scanner;
public class Div2 {
    public static void main(String[] args) {
        /*Aquí hay un programa que verifica si un número es divisible 
        por 2 y 3, si un número es divisible por 2 ó 3, y si un número 
        es divisible por 2 ó 3 pero no por ambos:
 */        
        boolean divisiblepor2, divisiblepor3;
        Scanner sc= new Scanner (System.in);
        System.out.print("Introduzca un numero ");
        int num=sc.nextInt();
        divisiblepor2 = (num % 2 == 0);
        divisiblepor3 = (num % 3 == 0);
        if (divisiblepor2)
            System.out.println("El numero es divisible por 2");
        if (divisiblepor3)
            System.out.println("El numero es divisible por 3");
        if (divisiblepor2 ^ divisiblepor3)
            System.out.println("El numero es divisible por 2 o 3 pero no por ambos");
        if (!divisiblepor2 && !divisiblepor3)
            System.out.println("El numero no es divisible por 2 ni por 3");
        sc.close();
    }
}