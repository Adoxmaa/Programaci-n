
import java.util.Scanner;
public class Amigos {
//6. Escriba una función que decida si dos 
// números enteros positivos son amigos. 
// Dos números son amigos, si la suma de sus 
// divisores (distintos de ellos mismos) son iguales.

    public static boolean sonAmigos (int num1, int num2){
        boolean j=false;
        int s1;
        for (int i =1; i <=num1; i++){
            while (num1 %i ==0)
                num1/=i;
        }
                for (int i =1; i <=num2; i++){
            while (num1 %i ==0)

        }
        if (num1 == num2)
           j=true;
        return j;
    }
    public static void main(String [] args){

        Scanner sc= new Scanner (System.in);
        int num1 =0, num2=0;
        do{
        System.out.println("Introduzca un número");
        num1= sc.nextInt();
        System.out.println("Introduzca un número");
        num2= sc.nextInt();
        } while (num1 <0 || num2 <0);
        System.out.println(sonAmigos(num1,num2));
        sc.close();
    }
}

