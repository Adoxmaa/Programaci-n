import java.util.Scanner;
public class P6{
    public static void main (String[] args){
        int original;
        int n = original;
        int inverso= 0;
        Scanner sc= new Scanner (System.in);
        System.out.println ("Ingrese un numero de cinco digitos");
        original=sc.nextInt();
  
        while (numero!=0){
        inverso= inverso * 10 + n % 10;
        n = n /10;
        }
        if (inverso==original){
            System.out.println("El número es capícua");
        }
        else if (inverso!==original){
            System.out.println("El número no es capícua");
        }
        else {
            System.out.println("no valido");
        }
        sc.close();
    }
}