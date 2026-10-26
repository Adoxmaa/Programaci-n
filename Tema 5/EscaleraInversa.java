public class EscaleraInversa {
    public static void main (String [] args){
        for(int i=1; i <4;i++){
            for (int esp=1; esp<=4 - i;esp++){
                System.out.print("  ");
            }
            for(int col=1; col<=i; col++){
                System.out.print (col + " ");
            }

            System.out.println();
        }
    }
}