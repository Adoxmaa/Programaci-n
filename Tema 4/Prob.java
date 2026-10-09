public class Prob {
    /*
        Realiza un programa que muestre al azar el nombre de una 
        carta de la baraja francesa. Esta baraja está dividida en 
        cuatro palos: picas, corazones, diamantes y tréboles. Cada 
        palo está formado por 13 cartas, de las 
        cuales 9 cartas son numerales y 4 literales:
         2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).
    */
    public static void main(String[] args) {
        int palo = (int) (1 + Math.random() * 4);     // 1 a 4
        int carta = (int) (1 + Math.random() * 13);   // 1 a 13

        String nombrePalo;
        switch (palo) {
            case 1:
                nombrePalo = "picas";
                break;
            case 2:
                nombrePalo = "corazones";
                break;
            case 3:
                nombrePalo = "diamantes";
                break;
            default:
                nombrePalo = "tréboles";
        }

        switch (carta) {
            case 1:
                System.out.println("A de " + nombrePalo);
                break;
            case 11:
                System.out.println("J de " + nombrePalo);
                break;
            case 12:
                System.out.println("Q de " + nombrePalo);
                break;
            case 13:
                System.out.println("K de " + nombrePalo);
                break;
            default:
                System.out.println(carta + " de " + nombrePalo);
        }
    }
}
