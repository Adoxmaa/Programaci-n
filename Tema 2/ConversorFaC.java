import java.util.Scanner;
public class ConversorFaC {
    public static void main(String[] arg) {
       double celsius= 0.0;
       double fahrenheit= 0.0;
        Scanner sc= new Scanner (System.in);
      System.out.println ("Calculamos la temperatura en grados fahrenheit, dada una cantidad de grados fahrenheit");
      fahrenheit = sc.nextDouble();
        celsius = (fahrenheit - 32) * 5.0 / 9;
    System.out.println ("La temperatura en grados celsius es " + celsius + " y la temperatura en grados fahrenheit es de  " + fahrenheit);    
 }
}
