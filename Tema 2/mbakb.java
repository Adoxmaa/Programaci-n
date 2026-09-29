import java.util.Scanner;
public class mbakb{
    public static void main(String[] args){
        int mb;
        int kb;
        Scanner sc=new Scanner (System.in);
        System.out.println("Ingrese la cantidad de megabytes a convertir a kilobytes");
        mb=sc.nextInt();
        kb=mb*1000;
        System.out.println("La cantidad de kilobytes es de: "+kb);
    }
}