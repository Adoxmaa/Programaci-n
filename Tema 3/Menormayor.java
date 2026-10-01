import java.util.Scanner;

public class Menormayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Introduzca el segundo número:");
        int num2 = sc.nextInt();

        System.out.println("Introduzca el tercer número:");
        int num3 = sc.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("El número más pequeño es: " + num1);
        }
        else if (num2 <= num1 && num2 <= num3) {
            System.out.println("El número más pequeño es: " + num2);
        }
        else {
            System.out.println("El número más pequeño es: " + num3);
        }
    }
}