import java.util.Scanner;
public class AST {
    public static void main (String [] args){
/*12. Rectángulo de asteriscos. Pide al
 usuario el número de filas y columnas
 y dibuja un rectángulo de asteriscos. 
 Por ejemplo, para 3 filas y 5 columnas:
*****
*****
*****
*/
        Scanner input= new Scanner (System.in);
        int f=0;
        int c=0;
        do {
            System.out.println("Introduzca el número de filas que desea");
            f=input.nextInt();
            System.out.println("Introduzca el número de columnas que desea");
            c=input.nextInt();
        } while (f<1 || c<1);

        for (int j=1; j<=f; j++){   
            
            for (int k=1; k<=c; k++){   
                System.out.print("*");
            }
            System.out.println();

        }
        input.close();
    }
}