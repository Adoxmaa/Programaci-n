import java.util.Scanner;
public class Parr{
    public static void main (String [] args){
/*
 Números pares. 
 Pide un número entero al usuario y 
 muestra todos los números pares 
 comprendidos entre 1 y ese número
*/ 
        Scanner input= new Scanner (System.in);
        int num=0;
        do {
            System.out.println("Introduzca un número positivo para saber los numeros pares entre dicho número y el 1");
            num=input.nextInt();
        } while (num<0);
            boolean A=true;
            for (int j=1; j<num; j++){
                for (int d = 2; d <= num / 2; d++) {
                if (j % 2 != 0){
                    A=false;
                }
                if (A){
                    System.out.println(j);
                } }
            }
            input.close();
    }
}

