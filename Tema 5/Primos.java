public class Primos {
    public static void main(String[] args) {
        boolean primo = true;
        final int MAXP = 50;
        System.out.println("Lista de los primeros 50 números primos");
        for (int n = 2; n <= MAXP; n++) {
            primo = true;

            for (int d = 2; d < n; d++) {
                if (n % d == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println(n);
            }
        }
    }
}
