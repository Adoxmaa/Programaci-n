import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la nota del primer control:");
        double nota1 = sc.nextDouble();

        System.out.println("Introduzca la nota del segundo control:");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Enhorabuena, ha aprobado. Su media es " + media);
        }
        else {
            System.out.println("¿Resultado de la recuperación? (1 = apto, 2 = no apto)");
            int recuperacion = sc.nextInt();

            if (recuperacion == 1) {
                System.out.println("Ha aprobado la recuperación. Su nota es 5");
            }
            else {
                System.out.println("No apto. Su nota se mantiene en " + media);
            }
        }
    }
}
