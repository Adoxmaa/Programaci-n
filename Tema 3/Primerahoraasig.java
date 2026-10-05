import java.util.Scanner;
public class Primerahoraasig {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduzca un día de la semana por favor");
        String dia= sc.nextLine();
        /* Compara cadenas e ignora mayus y minus */
        if (dia.equalsIgnoreCase("Lunes")){
            System.out.println("El lunes a primera hora toca Lenguaje de Marca");
        }
        else if (dia.equalsIgnoreCase("Martes")){
            System.out.println("El martes a primera hora toca Base de Datos");
        }
        else if (dia.equalsIgnoreCase("Miercoles")){
            System.out.println("El miercoles a primera hora toca Sistemas Informáticos");
        }
        else if (dia.equalsIgnoreCase("Jueves")){
            System.out.println("El jueves a primera hora toca Programación");
        }
        else if (dia.equalsIgnoreCase ("Viernes")){
            System.out.println("El viernes a primera hora toca Entornos de Desarrollo");
        }
        else {
            System.out.println("El día introducido es finde semana, no hay clase");
        }
    }
}