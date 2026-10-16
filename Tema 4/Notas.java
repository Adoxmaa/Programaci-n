import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = input.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = input.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = input.nextDouble();
        System.out.print("Nota 4: ");
        double n4 = input.nextDouble();
        System.out.print("Nota 5: ");
        double n5 = input.nextDouble();

        System.out.println("Nota " + n1 + " -> alza: " + Math.ceil(n1 * 10) / 10
                + ", baja: " + Math.floor(n1 * 10) / 10 + ", truncada: " + (int) n1);
        System.out.println("Nota " + n2 + " -> alza: " + Math.ceil(n2 * 10) / 10
                + ", baja: " + Math.floor(n2 * 10) / 10 + ", truncada: " + (int) n2);
        System.out.println("Nota " + n3 + " -> alza: " + Math.ceil(n3 * 10) / 10
                + ", baja: " + Math.floor(n3 * 10) / 10 + ", truncada: " + (int) n3);
        System.out.println("Nota " + n4 + " -> alza: " + Math.ceil(n4 * 10) / 10
                + ", baja: " + Math.floor(n4 * 10) / 10 + ", truncada: " + (int) n4);
        System.out.println("Nota " + n5 + " -> alza: " + Math.ceil(n5 * 10) / 10
                + ", baja: " + Math.floor(n5 * 10) / 10 + ", truncada: " + (int) n5);

        double media = (n1 + n2 + n3 + n4 + n5) / 5;
        double max = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
        double min = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5))));

        System.out.println("Media: " + media);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}