import java.util.Scanner;

public class t10div {
    public static void main(String[] args) {
        /*
         * 11. Que lea 10 números por teclado, 5 para un array y 5 para otro array
         * distinto. Crea un
         * tercer array donde se almacenen los dos array anteriores y muestras 10
         * números en
         * pantalla mediante este último array.
         */
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        int[] part1 = new int[5];
        int[] part2 = new int[5];
        int[] fusion = new int[10];
        System.out.println("Introduzca un número");
        for (int j = 0; j < num.length; j++) {
            num[j] = input.nextInt();
        }
        for (int j = 0, k = 0; j < part1.length; j++, k++) {
            part1[j] = num[k];
        }
        for (int j = 0, k = 5; j < part2.length; j++, k++) {
            part2[j] = num[k];
        }
        for (int k = 0, b = 0; k < fusion.length / 2; k++, b++) {
            fusion[k] = part1[b];
            for (int c = 5, y = 0; c < fusion.length; c++, y++) {
                fusion[c] = part2[y];
            }
        }
        for (int i = 0; i < fusion.length; i++) {
            System.out.println();
            System.out.println(fusion[i]);
        }
        input.close();
    }
}
