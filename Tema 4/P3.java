public class P3 {
    public static void main (String [] args){
/*
    Realiza un programa que 
    escriba por pantalla una palabra
    formada por 5 caracteres alfabéticos 
    aleatorios en mayúsculas y esos mismos 
    en minúsculas. 
*/

int num1=(int) (65+Math.random()*26);

char caracter= (char) num1;

String textoOriginal="";
String textoMinusculas = textoOriginal.toLowerCase();
String textoMayusculas = textoOriginal.toUpperCase();

System.out.println(textoMinusculas);
System.out.println(textoMayusculas);

    }
}