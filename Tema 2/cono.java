import java.util.Scanner;
    public class cono {
        public static void main(String[] args) {
            double r;
            double v;
            double h;
            Scanner sc= new Scanner (System.in);
            System.out.println ("Ingrese el radio para calcular el volumen del cono");
            r= sc.nextDouble();
            System.out.println ("Ingrese la altura para calcular el volumen del cono");
            h= sc.nextDouble();
            v= 1.14159 * r *r *h /3;
            System.out.println ("El volumen del cono es de " +v);
        }
    }