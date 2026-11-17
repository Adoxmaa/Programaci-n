import java.util.Scanner;

public class t10a {
    /*
     * 6. Escribe un programa que lea 10 números
     * por teclado, los almacene en un array y
     * muestre los números insertados en orden inverso.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Introduzca un número");
        for (int j = 0; j < num.length; j++) {
            num[j] = input.nextInt();
        }
        for(int i=9; i< num.length; i--){
            System.out.println(num[i]);
        }
    }
}
