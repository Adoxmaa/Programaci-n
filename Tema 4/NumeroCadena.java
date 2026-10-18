import java.util.Scanner;

public class NumeroCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Entrada
        System.out.println("Introduzca un número (de 2 a 7 dígitos):");
        String numero = sc.next();
//Proceso
        boolean valido = true;
        
        if (numero.length() < 2 || numero.length() > 7) {
            valido = false;
        }
        else {
            int i = 0;
            while (i < numero.length()) {
                char c = numero.charAt(i);
                if (c < '0' || c > '9') {
                    valido = false;
                }
                i++;
            }
        }
//Resultado
        if (valido) {
            System.out.println("Número válido: " + numero);
        }
        else {
            System.out.println("Número no válido");
        }
    }
}