import java.util.Scanner;
public class CaF{
    public static void main(String[] arg) {
        Scanner sc= new Scanner (System.in);
        double celsius= 0.0;
        double fahrenheit= 0.0;
        System.out.println ("Ingrese la temperatura de grados celsius para transformarla a grados fahrenheit");
        celsius= sc.nextDouble();
        fahrenheit= (9.0/5)*celsius+32;
     System.out.println ("La temperatura en grados farenheit es de " +fahrenheit);
    }
    }