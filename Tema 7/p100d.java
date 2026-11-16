public class p100d{
    /*
2. Escribe un programa que rellene 
un array con los 100 primeros números enteros en
orden descendente y los muestre en pantalla.
*/
    public static void main (String [] args){
        int []num= new int [100];
        for(int i=0; i<num.length;i++){
            num[i] = 100 - i;
        }
        for(int i=0; i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}