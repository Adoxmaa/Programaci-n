import java.util.Scanner;

public class MinDig {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca entre 2 y 7 dígitos: ");
        String num = input.next();

        boolean soloDigitos = true;
        int i = 0;
        while (i < num.length()) {
            if (!Character.isDigit(num.charAt(i))) {
                soloDigitos = false;
            }
            i++;
        }

        if (num.length() >= 2 && num.length() <= 7 && soloDigitos) {
            System.out.println("Número válido: " + num);
        } else {
            System.out.println("Número no válido");
        }
    }
}