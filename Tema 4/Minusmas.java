public class Minusmas {
    public static void main(String[] args) {

/*
     Realiza un programa que escriba por pantalla
     una palabra formada por 5 caracteres alfabéticos 
     aleatorios en mayúsculas y esos mismos en minúsculas. 
*/
        String Mayuscula = "";
        int contador = 0;
        while (contador < 5) {
            int num = (int) (65 + Math.random() * 26);
            char character = (char) num;
            Mayuscula = Mayuscula + character;
            contador++;
        }
        String textominuscula = Mayuscula.toLowerCase();
        System.out.println(Mayuscula);
        System.out.println(textominuscula);
    }
}