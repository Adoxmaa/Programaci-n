import java.util.Scanner;

public class t10aems {
    /*
     * 7. Que lea 10 números por teclado,
     * los almacene en un array y muestre la suma, resta,
     * multiplicación y división de todos.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        int i = num.length;
        int[] operaciones = { 0, 0, 0, 0 };
        System.out.println("Introduzca un número");
        for (int j = 0; j < num.length; j++) {
            num[j] = i = input.nextInt();
        }
        for (int j = 0; j < num.length; j++) {
            operaciones[0] = operaciones[0] + num[j];
            operaciones[1] = operaciones[1] - num[j];
            operaciones[2] = (operaciones[2] + num[j]) * num[j];
            operaciones[3] = (operaciones[3] + num[j]) / num[j];

        }

        System.out.println("El resultado de la suma es: " + operaciones[0]);
        System.out.println("El resultado de la resta es: " + operaciones[1]);
        System.out.println("El resultado de la multiplicación es: " + operaciones[2]);
        System.out.println("El resultado de la división es: " + operaciones[3]);

    }
}