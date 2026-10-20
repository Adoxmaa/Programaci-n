import java.util.Scanner;
public class AleatorioAcert {
    public static void main (String [] args){
        Scanner input= new Scanner (System.in);

/*
    Escriba un programa que genere aleatoriamente un 
    número entero entre 0 y 100, inclusive. El programa 
    le pide al usuario que introduzca un número continuamente
    hasta que el número coincida con el número generado aleatoriamente. 
     Para cada entrada de usuario, el programa le dice al usuario si la
     entrada es demasiado baja o demasiado alta, para que el usuario pueda elegir 
    la siguiente entrada de forma inteligente.
*/

        int num=(int) (Math.random()*100);
        int i=0;
        
        while
        System.out.println("Intente adivinar el número: ");
        int adivino=input.nextInt();
        if (num<adivino){
            System.out.println("El número es menor ");
        }
        else if (num>adivino){
            System.out.println("El número es mayor ");
        }
        else {
            System.out.println("Has acertado enhorabuena");
        }