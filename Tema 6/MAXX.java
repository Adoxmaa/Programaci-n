import java.util.Scanner;
public class MAXX {
    

    public static int MAXXX (int num1, int num2){
        int V=Math.max(num1,num2);
        return v;
    }


    public static void main (String [] args){
        Scanner input=new Scanner (System.in);
//Diseñar una función que tenga como parámetros dos números, y que calcule el máximo

        int num1=0;
        int num2=0;
        do {
            System.out.println("Introduzca un número");
            num1=input.nextInt();
            System.out.println("Introduzca un número");
            num2=input.nextInt();
        } while (num1<0 || num2<0);
        System.out.println("El maximo es " + MAXXX(num1,num2));
        input.close();

    }
}