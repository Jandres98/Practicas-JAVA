package ejercicios4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double premio = 23563899;
        double imp1 = premio * 0.0245;
        double imp2 = premio * 0.15;
        double imp3 = premio * 0.03;
        double premioTot = (premio-imp1-imp2-imp3)/100;
        System.out.println("el monto bruto del premio es: $" + premioTot);
    }
}
