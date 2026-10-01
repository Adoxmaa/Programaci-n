public class P3 {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 5;
        int resA = 3 * a + b - 6 / a;
        System.out.println("a) " + resA);

        a = 4;
        b = 5;
        c = 1;
        int resB = b * a - b * b / 4 * c;
        System.out.println("b) " + resB);

        a = 4;
        b = 5;
        int resC = (a * b) / 9;
        System.out.println("c) " + resC);

        a = 4;
        b = 5;
        c = 1;
        int resD = (((b + c) / 2 * a + 10) * 3 * b) - 6;
        System.out.println("d) " + resD);

        a = 4;
        c = 1;
        boolean resE = 3 > a && !(c / 2 == 0.5);
        System.out.println("e) " + resE);

        a = 4;
        b = 2;
        c = 20;
        boolean resF = (a + b) / 2 >= 3 || c != 20;
        System.out.println("f) " + resF);
        System.out.println("g) " + (5 + 25 % 2));
        System.out.println("h) " + ((5 + 25) % 2));
        System.out.println("i) " + (5 + 25 / 10));
        System.out.println("j) " + (-2 * 2));
        System.out.println("k) " + ((-2) * 2));
        System.out.println("l) " + (-(2 * 2)));
        System.out.println("m) " + (-Math.pow(2, 2)));
        System.out.println("n) " + Math.pow(-2, 2));
        System.out.println("ñ) " + (-(Math.pow(2, 2))));
    }
}