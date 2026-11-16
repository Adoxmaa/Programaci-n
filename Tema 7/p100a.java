public class p100a{
/*
1. Escribe un programa que rellene un 
array con los 100 primeros números enteros en
orden ascendente y los muestre en pantalla.
*/

    public static void main (String [] args){
        int [] num= new int [100];

            for (int i=0; i<1; i++)
                {

                for (int j=100; j>=0;j--){
                    num [i] = j;
                    System.out.println(num [i]);
                }
                
        
        }
    }
}

