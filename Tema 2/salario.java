import java.util.Scanner;

public class salario {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            double salarioSemanal= 0.0;
            double SalarioHora= 12.0;
            double numerohoras= 0.0;
            System.out.println("Ingrese el numero de horas trabajadas: ");
            numerohoras= sc.nextDouble();
            salarioSemanal= numerohoras*SalarioHora;
            System.out.println("El salario semanal es de: "+ salarioSemanal);
        }
}