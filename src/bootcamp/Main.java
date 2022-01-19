package bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //psvm
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = teclado.next();

        System.out.println("ingrese la fecha de hoy");
        int numero = teclado.nextInt();

        System.out.println("Es soleado por ahi?");
        boolean comprobar = teclado.nextBoolean();

        System.out.println("Hola " + nombre + ", como estas?");//sout
        System.out.println("la fecha de hoy es " + numero);
        System.out.println("es soleado? " + comprobar);
    }
}
