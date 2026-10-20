import java.util.Scanner;
public class P6 {
    public static void main (String [] args){
        Scanner input= new Scanner (System.in);
//Datos de entrada
        System.out.println("Introducir una palabra");
        String p=input.next();
        boolean misterio= true;
//proceso
            int i=0;
//lectura de caracteres
            while(i<p.length()){
                char c=p.charAt(i);
                if (!p.isLetter()){
                    misterio= false;

                }

            }
            
            input.close();
    }
}