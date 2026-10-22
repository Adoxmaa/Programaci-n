import java.util.Scanner;

public class Cali {
    public static void main(String[] args) {
        /*
        Escribe un programa que convierta una nota
        numérica (double nota) en su calificación textual usando if/else if:
        >= 9 → "Sobresaliente"
        >= 7 → "Notable"
        == 6 → "Bien"
        >= 5 → "Aprobado"
        >= 0 → "Suspenso"
        Cualquier otro valor (negativo o mayor que 10) → "Nota inválida"
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nota para saber su calificación textual por favor");
        double n = input.nextDouble();

        if (n < 0 || n > 10) {
            System.out.println("Nota inválida");
        } else if (n >= 9) {
            System.out.println("Sobresaliente");
        } else if (n >= 7) {
            System.out.println("Notable");
        } else if (n == 6) {
            System.out.println("Bien");
        } else if (n >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        input.close();
    }
}
