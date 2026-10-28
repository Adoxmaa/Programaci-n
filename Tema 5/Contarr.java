import java.util.Scanner;
public class Contarr {
    public static void main (String [] args){
/*
10. Contar cifras. Pide un número entero positivo y
 calcula cuántas cifras tiene sin convertirlo a texto. 
*/

    Scanner input=new Scanner (System.in);
        int num=0;
        do{
            System.out.println("Introduzca un número positivo para saber cuantas cifras tiene");
            num=input.nextInt();
        } while (num<=0);

        int j=0;
        while (num>0){
            num= num/10;
            j++;
        }
        System.out.println("Las cifras que tiene son: " + j);
        input.close();
    }
}