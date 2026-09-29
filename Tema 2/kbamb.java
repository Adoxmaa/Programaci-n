import java.util.Scanner;
public class kbamb{
    public static void main(String[] args){
        int mb;
        int kb;
        Scanner sc=new Scanner (System.in);
        System.out.println("Ingrese la cantidad de kilobytes que desea convertir a megabytes: ");
        kb=sc.nextInt();
        mb=kb/1000;
        System.out.println("La cantidad de megabytes es de: "+mb);
    }
}