import java.util.Scanner;
    public class P3R {
        public static void main (String [] args){
/*
5.) 
Calcula los números primos entre M y N.
Siendo M y N  números introducidos por el usuario.
Un número P es primo si sus únicos divisores 
son el propio número P y 1, es decir, 
la suma de sus divisores son P+1.
*/
            Scanner input= new Scanner (System.in);
            int m=0;
            int n=0;
            int f=0;
            do {
                System.out.println("Introduzca un número (No introduzca números negativos o iguales/menores que 1)");
                n=input.nextInt();
                System.out.println("Introduzca un número positivo (No introduzca números negativos o iguales/menores que 1)");
                m=input.nextInt();
            } while (m<=1 || n<=1);
            if (m<n){
                f= m;
                m=n;
                n=f;
            }
            System.out.println("Los números primos entre " + n + " y " + m + " son:");
            System.out.println("===================================================");
            int cont=n;
            boolean z = true;
            while (n<=m){
                z = true;
                //for (int g=2; g<=n; g++){
                 //   if (g % 2 ==0){
                 //       z = false;
                  // 
                  if (n % 2 ==0){
                    z = false;   
                  }
                  else if (z){
                    System.out.print(n + ", ");
            }
                else if (cont == m){
                   System.out.print("."); 
                }
                n++;
                cont++;

                }

            

            input.close();
        }
    }