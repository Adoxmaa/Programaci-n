public class EscaleraInversa4 {
    public static void main (String [] args){
        final int MAX=4;
        for(int i=1; i <=MAX;i++){
            for (int esp=1; esp<=MAX - i;esp++){
                System.out.print("  ");
            }
            for(int col=i; col>=1; col--){
                System.out.print (col + " ");
            }
            System.out.println();
        }
    }
}