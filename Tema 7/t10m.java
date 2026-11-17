import java.util.Scanner;
public class t10m {
    public static void main (String [] args){
/*
9. Que lea 10 números por teclado,
los almacene en un array y muestre la media.
*/

        Scanner input= new Scanner (System.in);
        int [] num = new int [13];
        int j=0;
        System.out.println("Introduzca un número");
        for(int i=0; i< num.length - 2 ; i++){
            num[i]= j=input.nextInt();
            num[11]= num[11] + num[i];
            num[12]= num[11] / 10;
        }
        System.out.println(num[12]);
    }
}

