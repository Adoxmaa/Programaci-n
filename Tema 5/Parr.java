import java.util.Scanner;
public class Parr {
    public static void main (String [] args){
        Scanner input= new Scanner (System.in);
        int num=0;
        do {
            System.out.println("Introduzca un número positivo para descubrir los números primos entre dicho número y el uno");
            num=input.nextInt();
        } while (num<1);

        for (int j=2; j<=num; j++){
            System.out.print(j);
        }
        input.close();
    }
}
