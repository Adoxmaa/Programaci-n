import java.util.Scanner;
public class Cali{
    public static void main(String[] args){
/*
Escribe un programa que convierta una nota 
numérica (double nota) en su calificación textual usando if/else if: 
>= 9 → “Sobresaliente” 
>= 7 → “Notable” 
== 6 → “Bien” 
>= 5 → “Aprobado” 
>= 0 → “Suspenso” 
Cualquier otro valor (negativo o mayor que 10) → “Nota inválida”
*/
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese su nota para saber su calificación textual por favor");
        double n=input.nextInt();

        if (n<0 || n>10){
            System.out.println("Nota inválida")
            System.exit();
        }
        else {
            
        }


    }
}