import java.util.Scanner;

public class Capi {
    public static void main(String[] args) {
        int original = 0;
        int inverso = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de cinco digitos:");
        original = sc.nextInt();
        
        int n = original; 
  
        while (n != 0) {
            inverso = inverso * 10 + n % 10;
            n = n / 10;
        }
        
        if (inverso == original) {
            System.out.println("El número es capícua");
        } else {
            System.out.println("El número no es capícua");
        }
        
        sc.close();
    }
}
