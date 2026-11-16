
public class pares100a{
    /*
3. Escribe un programa que rellene un 
array con los números pares comprendidos
entre 1 y 100 y los muestre en pantalla en orden ascendente.
*/
    public static void main (String [] args){
        int []num= new int [50];
        for(int i=0; i<num.length;i++){
            num[i] = (i + 1) *2;
        }
        for(int i=0; i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}