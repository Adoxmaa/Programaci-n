import java.util.Scanner;

public class QueDiaFue {
  /*
   * 7. Realizar un programa que lea fechas validas por teclado y calcule el día
   * de la semana que corresponde a esa fecha. Para ello creará las siguientes
   * funciones:
   * · int LeeDiaValido(int a, int m): Lee por teclado una día válido (dado un año
   * y un mes)
   * . int LeeMesValido(int a): Lee por teclado una mes válido para un año dado
   * . int LeeAñoValido(): Lee por teclado una año válido (desde 1583 en adelante)
   * · int DiaSemana(d, m, a): Devuelve el día de la semana que corresponde a la
   * fecha. Será un valor entre 1 y 7
   * · String DiaEnLetra(nDia): Devuelve la cadena que corresponde al nombre de un
   * día que viene identificado por un número calculado con la función anterior.
   * Para solucionar el problema se tendrá en cuenta que la expresión que devuelve
   * el día de la semana es:
   * n = (700 + (26 * a -2) / 10 + dia + b + b / 4 + c / 4 - 2 * c) % 7
   * Siendo:
   * Para enero y febrero
   * Para el resto de los meses
   * a = mes + 10
   * b = (año - 1) % 100
   * c = (año - 1) / 100
   * a = mes – 2
   * b = año % 100
   * c = año / 100
   * 
   * 
   * El valor de n indicará 0 para domingo, 1 para lunes, 2 para martes,…
   */

  public static int AñoValido(int año) {
          Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Introduzca un año (Desde 1583 en adelante");
      año = sc.nextInt();
    } while (año < 1583);
        sc.close();
    return año;
  }

  public static int MesValido (int mes){
          Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Introduzca un mes (Desde 1-12)");
      mes = sc.nextInt();
    } while (mes <=0 || mes>=13);
        sc.close();
    return mes;
  }

  public static int DiaValido (int año, int mes){
            Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Introduzca un mes (Desde 1-12)");
      dia = sc.nextInt();
    } while (dia <=0 || mes>=31);
        sc.close();
    return dia;    
  }
  public static int DiaSemana (int año, int mes, int dia){
    int a;
    int b;
    int c;
    
    if (mes== 1 || mes==2){
       a = mes + 10;
   b = (año - 1) % 100;
    c = (año - 1) / 100;
    }
    else {
    a = mes – 2;
   b = año % 100;
   c = año / 100;
    }
    int n=(700 + (26 * a -2) / 10 + dia + b + b / 4 + c / 4 - 2 * c) % 7;
    return n; 

  }

    public static String DiaLetra (DiaSemana){
      int n= DiaSemana;
      String D="";
      switch (D){
        case(1): return D="Lunes";
        case(2): return D="Martes";
        case(3): return D="Miercoles";
        case(4): return D="Jueves";
        case(5): return D="Viernes";
        case(6): return D="Sabado";
        case(7): return D="Domingo";

      }
    }
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

    int año = AñoValido;
    int mes = MesValido;
    int dia = DiaValido;
    System.out.println("Hi");
  }

