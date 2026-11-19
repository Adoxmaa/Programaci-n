import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        /*
         * 14. Que mediante un array almacene números tanto positivos como negativos y
         * los
         * muestre ordenados.
         */
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        int temp;
        System.out.println("Introduzca números positivos y negativos");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        for (int i = 0, j = 4; i < num.length; i++, j--) {
            if (num[i] > num[j]) {
                temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            System.out.println(num[i]);
        }
        input.close();
    }
}
