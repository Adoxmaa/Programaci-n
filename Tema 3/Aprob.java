import java.util.Scanner;

public class Aprob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las
dos notas que ha sacado el alumno en los dos primeros controles. Si la media de los
dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará
la media. En caso de que la media sea un número menor que 5, el alumno habrá tenido
que hacer el examen de recuperación que se califica como apto o no apto, por tanto se
debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto).
Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
mantiene la nota media anterior.
 */
        System.out.println("Introduzca la nota del primer control:");
        double nota1 = sc.nextDouble();

        System.out.println("Introduzca la nota del segundo control:");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Enhorabuena, ha aprobado. Su media es " + media);  
             sc.nextLine();      
        }
        else {
            sc.nextLine();
            System.out.println("¿Resultado de la recuperación? (apto/no apto)");
            
            String recuperacion = sc.next();
            
            if (recuperacion.equalsIgnoreCase ("apto")) {
                System.out.println("Ha aprobado la recuperación. Su nota es 5");

            }
            else {
                System.out.println("No apto. Su nota se mantiene en " + media);
            }
           
            sc.close();
        }
    }
}
