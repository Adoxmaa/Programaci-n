public class Lot {
    public static void main(String[] args) {
        int dado = (int) (1 + Math.random() * 6); 

        if (dado <= 3) {
            System.out.println("1");
        }
        else if (dado <= 5) {
            System.out.println("X");
        }
        else {
            System.out.println("2");
        }
    }
}
