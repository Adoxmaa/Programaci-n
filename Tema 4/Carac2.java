public class Carac2 {
    public static void main(String[] args) {
/*
Realiza el programa anterior con los siguientes caracteres:*, -, =, ., |, @.
*/

        int num = (int) (1 + Math.random() * 6);  
        char simbolo;
        switch (num) {
            case 1:
                simbolo = '*';
                break;
            case 2:
                simbolo = '-';
                break;
            case 3:
                simbolo = '=';
                break;
            case 4:
                simbolo = '.';
                break;
            case 5:
                simbolo = '|';
                break;
            default:
                simbolo = '@';
        }

        int contador = 0;
        while (contador < 5) {
            System.out.print(simbolo);
            contador++;
        }
        System.out.println();
    }
}