import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la nota del primer control:");
        double not1 = sc.nextDouble();

        System.out.println("Introduzca la nota del segundo control:");
        double not2 = sc.nextDouble();

        double media = (not1 + not2) / 2;

        if (media >= 5) {
            System.out.println("Enhorabuena, ha aprobado. Su media es " + media);
        }
        else {
            sc.nextLine();

            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            String recu = sc.nextLine();

            if (recu.equalsIgnoreCase("apto")) {
                System.out.println("Ha aprobado la recuperación. Su nota es 5");
            }
            else {
                System.out.println("Recuperación no apta. Su nota se mantiene en " + media);
            }
        }
    }
}
