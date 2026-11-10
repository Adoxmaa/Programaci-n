import java.util.Scanner;

public class MAXXX3 {
    // Haz una versión que calcule el máximo de 3 números.
    public static int esmaximo(int num1, int num2, int num3) {
        int max = Math.max(num1, Math.max(num2, num3));
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Introduzca un número:");
        num1 = sc.nextInt();
        System.out.println("Introduzca un número:");
        num2 = sc.nextInt();
        System.out.println("Introduzca un número:");
        num3 = sc.nextInt();
        System.out.println("El maximo de los tres números es: " + esmaximo(num1, num2, num3));
        sc.close();
    }
}
