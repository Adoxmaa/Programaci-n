import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int b= 5;
        int operacion;
        operacion=sc.nextInt();
        operacion= 3*a+b-6/a;
        System.out.println ("El resultado es: " + operacion);
    }
}