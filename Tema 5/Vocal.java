import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca una palabra");
        String p = input.nextLine();

        if (p.contains(" ")) {
            System.out.println("Escriba solamente una palabra");
        } else {
            int i = 0;
            int contador = 0;
            while (i < p.length()) {
                char c = Character.toLowerCase(p.charAt(i));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    contador++;
                }
                i++;
            }
            System.out.println("El número de vocales es de " + contador);
        }
        input.close();
    }
}
