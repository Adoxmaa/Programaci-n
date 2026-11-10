import java.util.Scanner;

public class Cilindro {
    public static double divolumen(double r, double a) {
        double v = (Math.PI * (r * r) * a);
        return v;
    }

    public static void main(String[] args) {
        // Realizar una función que calcule (muestre en pantalla) volumen de un
        // cilindro. Además hemos de pasarle a la función el radio y la altura

        double r, a;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca el radio del cilindro:");
            r = sc.nextDouble();
            System.out.println("Introduzca la altura del cilindro:");
            a = sc.nextDouble();
        } while (r < 0 || a < 0);

        System.out.println("El volumen del cilindro es: " + divolumen(r, a));
        sc.close();
    }
}
