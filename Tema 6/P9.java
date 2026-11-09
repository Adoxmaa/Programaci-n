import java.util.Scanner;
public class P9 {
    public static void main(String [] args){
        public static boolean esCapicua(int n) {
        int n = original; 
        int inverso = 0;
        while (n != 0) {
            inverso = inverso * 10 + n % 10;
            n = n / 10;
        }
        if (inverso == original) {
            System.out.println("El número es capícua");
        } else {
            System.out.println("El número no es capícua");
        }

        }
           
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduzca el número de la opción deseada: \n"+ "1) esCapicua\r\n" + //
                        "2) potencia\n" + //
                        "3) digitos\n" + //
                        "4) voltea\n" + //
                        "5) quitaPorDetras\n" + //
                        "6) pegaPorDelante");
        int i= sc.nextInt();

        switch (i) {
            case 1:
                System.out.println("Ingrese un número para saber si es Capícua:");
                int original =sc.nextInt();


            
                break;
            case 2:
                break;
            case 3:
                break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                break;
                default:
                System.out.println("Opción no válida");
    }
                 
   
        sc.close();
    }
}