import java.util.Scanner;
    public class Matriz {
        public static void main (String [] args){
/*
14. Matriz de números. Pide el número de filas y
 columnas y muestra una matriz en la que cada posición
  contenga el número de su fila multiplicado por el 
  número de su columna. 
*/

            Scanner input=new Scanner (System.in);
            int f=0;
            int c=0;
            do {
                System.out.println("Introduzca el número de filas que desea"); 
                f=input.nextInt();
                System.out.println("Introduzca el número de columnas que desea");
                c=input.nextInt();
            } while (f<= 0 || c<=0);

            for (int j=1; j<=f; j++){
                for (int k=1; k<=c; k++){
                    System.out.print( j * k + " " );
                }
                System.out.println();
            }
            input.close();
        }
    }
