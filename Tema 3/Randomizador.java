import java.util.Scanner;
public class Randomizador {
    public static void main(String [] args) {
        int random1=(int)(Math.random() * 10.0);
        int random2=(int)(Math.random() * 10.0);
        int resultado;
        int respuesta;
        Scanner sc = new Scanner (System.in);
         System.out.println("¿Cuanto es la suma de " +random1 + " + " +random2 + "?");
         respuesta=sc.nextInt();
         resultado= random1+random2;
         if (resultado== respuesta){
             System.out.println ("Tu respuesta es correcta");
         }
         else{
             System.out.println ("Tu respuesta es incorrecta, el resultado correcto es: " +resultado);
    }
    }
}