import java.util.Scanner;
    public class NC {
        public static void main (String [] args){
/*
13. Cuadrado numérico. Pide un número
N y muestra un cuadrado de N filas y 
N columnas con números del 1 al N en cada fila.
Para N=4:
1234
1234
1234
1234
*/
            Scanner input= new Scanner (System.in);
            int n=0;
            do {
                System.out.println("Introduzca un número");
                n=input.nextInt();

            } while (n<=0);

            for (int j=1; j<=n;j++){
                for (int k=1; k<=n; k++){
                    System.out.print (k);
                }
                System.out.println();
            }
            input.close();
        }
    }

