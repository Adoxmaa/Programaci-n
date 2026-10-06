import java.util.Scanner;
public class P5 {
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        /*Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las
    dos notas que ha sacado el alumno en los dos primeros controles. Si la media de los
    dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará
    la media. En caso de que la media sea un número menor que 5, el alumno habrá tenido
    que hacer el examen de recuperación que se califica como apto o no apto, por tanto se
    debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto).
    Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
    mantiene la nota media anterior.
         */
        System.out.println ("Introduzca la nota calificante del primer control");
        int not1=sc.nextInt();
        System.out.println("Introduzca la nota calificante del segundo control");
        int not2=sc.nextInt();
        int media=0;
        media= (not1+not2)%2
        if (media=>5){
            System.out.println("Enhorabuena a aprobado su media es "+ media);
        }
        else (media<5){
            System.out.println ("No apto, ha suspendido");
        }

        System.out.println("¿Cual ha sido el resultado de la recuperación?");
        int recu=sc.nextInt();
        



    }
}