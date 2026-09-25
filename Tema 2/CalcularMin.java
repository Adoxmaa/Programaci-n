
import java.util.Scanner;
public class CalcularMin {
    public static void main(String[] arg) {
        int segundos;
        int minutos;
        int segundosRestantes;
        int horas;
        Scanner sc= new Scanner (System.in);
        System.out.println("Calculamos el número de minutos y segundos, dada una cantidad de segundos");

        segundos= sc.nextInt ();

        minutos= segundos/60;
        horas=minutos/60;
        segundosRestantes= minutos%60;
        System.out.println ("El numero de horas es" +horas + ", los minutos son" + minutos + "los segundos restantes son" + segundosRestantes);
    }
}