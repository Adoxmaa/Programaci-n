public class Primos {
    public static void main(String[] args) {
        for (int n = 2; n <= 50; n++) {
            boolean primo = true;

            for (int d = 2; d <= n / 2; d++) {
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