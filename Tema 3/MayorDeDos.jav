import java.util.Scanner;

public class MayorDeDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Introduzca el segundo número:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        }a
        else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        }
        else {
            System.out.println("Los dos números son iguales");
        }
    }
}