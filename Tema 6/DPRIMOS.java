
import java.util.Scanner;

public class DPRIMOS {

    // Módulo al que se le pasa un número
    // entero y devuelve el número de divisores primos que tiene.
    public static int isPrimos(int num) {
        int cont=0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
              cont ++;
                while (num % i==0){
                    num /=i;
                }
            }

        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número para saber los números divisores primos que tiene:");
        int num = sc.nextInt();

        System.out.println("Los números de divisores primos que tiene son 1 y " + isPrimos(num));

        sc.close();
    }
}
