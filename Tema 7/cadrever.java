import java.util.Scanner;
public class cadrever {
/*
16. Que lea una cadena 
y la muestre al revés.
*/
    public static void main (String [] args){
        Scanner input= new Scanner (System.in);
        String nom= "";
        System.out.println("Introduzca una palabra");
        nom = input.nextLine();

        for (int i= nom.length() ; i>=0; i--){
            System.out.println(nom.charAt(i));
        }
    }
}

