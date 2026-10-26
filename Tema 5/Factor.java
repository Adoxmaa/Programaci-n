import java.util.Scanner;
public class Factor
 {
    public static void main (String[] args){
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
        System.out.println("Introduza un número entero positivo para calcular el factorial");
            int num = input.nextInt();
                if (num<0){
                    System.out.println("Error Introduzca un número positivo");
                }
                else {
                    int f=1;
                    for (int i=1;i<=num;i++){
                        f= f*i;
                    }

                    System.out.println("El factorial de " + num + " es igual a " + f);
                }   
     input.close();
    }
}
