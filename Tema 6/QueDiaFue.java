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

  static Scanner sc = new Scanner(System.in);

  public static int AñoValido() {
    int año;
    do {
      System.out.println("Introduzca un año (Desde 1583 en adelante):");
      año = sc.nextInt();
    } while (año < 1583);
    return año;
  }

  public static int MesValido() {
    int mes;
    do {
      System.out.println("Introduzca un mes (Desde 1-12):");
      mes = sc.nextInt();
    } while (mes <= 0 || mes >= 13);
    return mes;
  }

  public static boolean esBisiesto(int año) {
    return (año % 4 == 0 && año % 100 != 0) || año % 400 == 0;
  }

  public static int diasMes(int año, int mes) {
    switch (mes) {
      case 2:
        return esBisiesto(año) ? 29 : 28;
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      default:
        return 31;
    }
  }

  public static int DiaValido(int año, int mes) {
    int dia;
    int max = diasMes(año, mes);
    do {
      System.out.println("Introduzca un día (Desde 1-" + max + "):");
      dia = sc.nextInt();
    } while (dia <= 0 || dia > max);
    return dia;
  }

  public static int DiaSemana(int año, int mes, int dia) {
    int a;
    int b;
    int c;

    if (mes == 1 || mes == 2) {
      a = mes + 10;
      b = (año - 1) % 100;
      c = (año - 1) / 100;
    } else {
      a = mes - 2;
      b = año % 100;
      c = año / 100;
    }
    int n = (700 + (26 * a - 2) / 10 + dia + b + b / 4 + c / 4 - 2 * c) % 7;
    // La fórmula da 0 para domingo; el enunciado pide valores de 1 a 7
    if (n == 0) {
      n = 7;
    }
    return n;
  }

  public static String DiaLetra(int n) {
    switch (n) {
      case 1:
        return "Lunes";
      case 2:
        return "Martes";
      case 3:
        return "Miércoles";
      case 4:
        return "Jueves";
      case 5:
        return "Viernes";
      case 6:
        return "Sábado";
      case 7:
        return "Domingo";
      default:
        return "Día no válido";
    }
  }

  public static void main(String[] args) {
    int año = AñoValido();
    int mes = MesValido();
    int dia = DiaValido(año, mes);

    int n = DiaSemana(año, mes, dia);
    System.out.println(dia + "/" + mes + "/" + año + " es " + DiaLetra(n));

    sc.close();
  }
      }
