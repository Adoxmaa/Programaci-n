import java.util.Scanner;
public class Factor
 {
    public static void main (String[] aegs){
/*
    4.) Calcula el factorial de un número
    entero positivo N leído desde teclado.
    Ejemplos:
    el factorial de 5 es igual a 1*2*3*4*5
    el factorial de 0 es igual a 1
    el factorial de 8 es igual a 1*2*3*4*5*6*7*8
    el factorial de 1 es igual a 1
*/
        Scanner input=new Scanner (System.in);
        System.out.println("Introduza");
        int num = input.nextInt();
        boolean v=true
        if (num<0)
        for (int i=1;i<num;i++){
            System.out.print(i + "*");
        }
            System.out.println("El factorial de " + num + " es igual a " + i);

        }
      
        
        
    }
}