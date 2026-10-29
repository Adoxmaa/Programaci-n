public class Primos {
    public static void main(String[] args) {
        boolean primo = true;
        for (int n = 2; n <= 50; n++) {
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
