package ejercicios3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrse la cantidad de dias que va de la promocion");
        int dias = teclado.nextInt();
        int diasp = 2*dias;
        System.out.println("El valor total recaudado de la promocion es: "+ diasp + "$");
    }
}
