import java.util.Scanner;

public class PrimeraHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un día de la semana:");
        String dia = sc.nextLine();

        if (dia.equalsIgnoreCase("lunes")) {
            System.out.println("A primera hora toca: LMDAW (Lenguaje de marcas)");
        }
        else if (dia.equalsIgnoreCase("martes")) {
            System.out.println("A primera hora toca: BDDAW (Bases de datos)");
        }
        else if (dia.equalsIgnoreCase("miércoles") || dia.equalsIgnoreCase("miercoles")) {
            System.out.println("A primera hora toca: SIDAW (Sistemas informáticos)");
        }
        else if (dia.equalsIgnoreCase("jueves")) {
            System.out.println("A primera hora toca: PRDAW (Programación)");
        }
        else if (dia.equalsIgnoreCase("viernes")) {
            System.out.println("A primera hora toca: EDDAW (Entornos de desarrollo)");
        }
        else {
            System.out.println("Ese día no hay clase o no es un día válido");
        }
        sc.close();
    }
}