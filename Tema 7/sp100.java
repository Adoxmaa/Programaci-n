public class sp100 {
    /*
     * 8. Que rellene un array con los 100
     * primeros números pares y muestre su suma.
     */
    public static void main(String[] args) {
        int[] num = new int[50];
        for (int i = 0, j = 2; j <= 100; i++, j = j + 2) {
            num[i] = j;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}