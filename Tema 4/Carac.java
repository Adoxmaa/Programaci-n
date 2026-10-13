public class Carac {
    public static void main (String [] args){
/*
    Realiza un programa que pinte por pantalla una línea 
    con 5 caracteres. El carácter con el que se pinta esa 
    línea se elige de forma aleatoria entre uno de los siguientes: #,$,€,&
*/


        int num= (int) (1 + Math.random() * 4);
        char simbolo;
        switch (num){
            case 1:
                simbolo= '#';
                break;
            case 2:
                simbolo= '$';
                break;
            case 3:
                simbolo= '€';
                break;
            default:
                simbolo = '&';
        }

        int contador=0;
        while(contador<5){
            System.out.print(simbolo);
            contador++;
        }
        System.out.println();
    }
}