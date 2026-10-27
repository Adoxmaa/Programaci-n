public class Escalera4 {
    public static void main(String[] args) {
        for (int fila = 1; fila <= 4; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}