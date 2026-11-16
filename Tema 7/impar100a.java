
public class impar100a{
    /*
4. Escribe un programa que rellene un array con los números impares comprendidos
entre 1 y 100 y los muestre en pantalla en orden ascendente.

*/
    public static void main (String [] args){
        int []num= new int [50];
        for(int i=0; i<num.length;i++){
            num[i] = 2 * i + 1;
        }
        for(int i=0; i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}