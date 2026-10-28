import java.util.Scanner;

public class TFP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Introduzca un número positivo y entero mayor que 1 para saber si es primo");
            num = input.nextInt();
        } while (num <= 1);

        boolean k = true;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                k = false;
            }
        }

        if (k) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
        input.close();
    }
}