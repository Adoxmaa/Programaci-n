public class Primos {
    public static void main(String[] args) {
        boolean primo = true;
        final int MAXP = 50;
        int n = 2;
        System.out.println("Lista de los números primos entre 1 y " + MAXP + ":");
        System.out.println("====================================================");        
        for (n = 2; n <= MAXP; n++) {
            primo = true;

            for (int d = 2; d < n; d++) {
                if (n % d == 0) {
                    primo = false;
                }
            }

            if (primo) {
                if ( n == MAXP -3){
                    System.out.print(n + ".");
                }
                else {
                System.out.print(n + ", ");
                    }
                }
            }
        }
    }
