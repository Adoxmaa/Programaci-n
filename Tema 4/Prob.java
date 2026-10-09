import java.util.Scanner;
public class Prob {
    /*
        Realiza un programa que muestre al azar el nombre de una 
        carta de la baraja francesa. Esta baraja está dividida en 
        cuatro palos: picas, corazones, diamantes y tréboles. Cada 
        palo está formado por 13 cartas, de las 
        cuales 9 cartas son numerales y 4 literales:
         2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).
    */
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int palos=(int)(1+(Math.random() *4));
        int cartas num=(int)(1+(Math.random()*9));
        int cartas lit=(int)(10+(Math.random()*13));
        


        System.out.println("Hi");
        sc.close();
    }
}