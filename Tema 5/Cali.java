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
        double n=0;
        System.out.println("Ingrese su nota para saber su calificación textual por favor");
        n=input.nextDouble();

        if (n<0.00 || n>10.0){
            System.out.println("Nota inválida");
        }
        else {
            if (n>= 9.00){
                System.out.println("Sobresaliente");
            }
            else if (n>=7.00){
                System.out.println("Notable");
            }
            else if (n>=6.00){
                System.out.println("Bien");
            }
            else if (n>=5.00){
                System.out.println("Aprobado");
            }
            else if (n>=0.00){
                System.out.println("Suspenso");
            }
        }

        input.close();
    }
}