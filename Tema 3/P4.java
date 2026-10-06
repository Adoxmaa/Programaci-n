import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Realiza un programa que diga si 
        un número entero positivo introducido por teclado 
        es capicúa. Se permiten números de hasta 5 cifras. */

        System.out.println("Introduzca un número entero positivo (hasta 5 cifras):");
        int n = sc.nextInt();

        if (n < 1 || n > 99999) {
            System.out.println("Número no válido");
        }
        else {
            boolean capicua;

            if (n < 10) {
                capicua = true;                            
            }
            else if (n < 100) {
                capicua = n / 10 == n % 10;                  
            }
            else if (n < 1000) {
                capicua = n / 100 == n % 10;                
            }
            else if (n < 10000) {
                capicua = n / 1000 == n % 10
                        && n / 100 % 10 == n / 10 % 10;       
            }
            else {
                capicua = n / 10000 == n % 10
                        && n / 1000 % 10 == n / 10 % 10;     
            }

            if (capicua) {
                System.out.println("El número " + n + " es capicúa");
            }
            else {
                System.out.println("El número " + n + " no es capicúa");
            }
        }

        sc.close();
    }
}
