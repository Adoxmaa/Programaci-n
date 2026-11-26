public class ContarVocalesAle {
    /*
     * 20. Un vector de caracteres de 100
     * elementos está cargado con vocales de manera
     * aleatoria. Contar e imprimir el número
     * de veces que aparece cada vocal. Nota: se
     * puede utilizar un vector de frecuencias
     * de repetición para las 5 vocales.
     */
    public static void main(String[] args) {
        char[] c = new char[100];
        int[] cont = new int[5];
        int i = 0;
        for (i = 0; i < c.length; i++) {
            c[i] = (char) (65 + Math.random() * 26);

            if (c[i] == 'A')
                cont[0]++;
            else if (c[i] == 'E')
                cont[1]++;
            else if (c[i] == 'I')
                cont[2]++;
            else if (c[i] == 'O')
                cont[3]++;
            else if (c[i] == 'U')
                cont[4]++;
        }

        System.out.println("El número veces que aparece cada vocal son: \n A: " + cont[0] + "\n E: " + cont[1]
                + "\n I: " + cont[2] + "\n O: " + cont[3] + "\n U: " + cont[4]);

    }
}