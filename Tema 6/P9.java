import java.util.Scanner;

public class P9 {
    public static boolean esCapicua(int n) {
        int original = n;
        int inverso = 0;
        while (n != 0) {
            inverso = inverso * 10 + n % 10;
            n = n / 10;
        }
        return inverso == original;
    }

    public static int esPotencia(int num1, int num2) {
        int p = (int) Math.pow(num1, num2);
        return p;
    }

    public static int esCifras(int num1) {
        int cont = 0;
        int doppe = num1;
        if (doppe == 0) return 1; 
        
        while (doppe > 0) {
            doppe = doppe / 10;
            cont++;
        }
        return cont;
    }

    public static int esInversa(int num1) {
        int inv = 0;
        while (num1 != 0) {
            inv = inv * 10 + num1 % 10;
            num1 = num1 / 10;
        }
        return inv;
    }

    public static int esQuitar(int num1, int num2) {
        int i = 0;
        while (i < num2) {
            num1 = num1 / 10;
            i++;
        }
        return num1;
    }

    public static int esDelante(int num1, int num2) {
        String j = num2 + "" + num1;
        return Integer.parseInt(j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de la opción deseada: \n" + "1) esCapicua\r\n" +
                "2) potencia\n" +
                "3) digitos\n" +
                "4) voltea\n" +
                "5) quitaPorDetras\n" +
                "6) pegaPorDelante");
        int i = sc.nextInt();

        int original = 0;
        int num1 = 0;
        int num2 = 0;

        switch (i) {
            case 1:
                do {
                    System.out.println("Ingrese un número positivo para saber si es Capícua:");
                    original = sc.nextInt();
                } while (original < 0);
                
                if (esCapicua(original)) {
                    System.out.println("Es capícua");
                } else {
                    System.out.println("No es capícua");
                }
                break;
            case 2:
                do {
                    System.out.println("Introduza un número positivo para la base");
                    num1 = sc.nextInt();
                    System.out.println("Introduzca un número positivo para el exponente");
                    num2 = sc.nextInt();
                } while (num1 < 0 || num2 < 0);
                System.out.println("El resultado es " + esPotencia(num1, num2));
                break;
            case 3:
                do {
                    System.out.println("Introduza un número positivo para saber su número de digitos");
                    num1 = sc.nextInt();
                } while (num1 < 0);
                System.out.println("El número de cifras es de " + esCifras(num1));
                break;
            case 4:
                do {
                    System.out.println("Introduza el número que desee dar la vuelta");
                    num1 = sc.nextInt();
                } while (num1 < 0);
                System.out.println("Su número es " + esInversa(num1));
                break;
            case 5:
                do {
                    System.out.println("Introduzca un número");
                    num1 = sc.nextInt();
                    System.out.println("Introduza el número de digitos que deseé retirar");
                    num2 = sc.nextInt();
                } while (num1 < 0 || num2 < 0);
                System.out.println("Su número es " + esQuitar(num1, num2));
                break;
            case 6:
                System.out.println("Introduza el número que desee");
                num1 = sc.nextInt();
                System.out.println("Introduza el número que desee colocar delante del anterior número");
                num2 = sc.nextInt();
                System.out.println("El número es " + esDelante(num1, num2));
                break;
            default:
                System.out.println("Opción no válida");
        }
        sc.close();
    }
}
