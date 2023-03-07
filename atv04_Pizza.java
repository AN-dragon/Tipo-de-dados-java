import java.util.Scanner;

public class atv04_Pizza {

    public static void main(String[] args) {

        //Exercício 3

        Scanner input = new Scanner(System.in);
        double met;

        System.out.println("Diga um comprimento em metros e o valor será convertido em centímetros: ");
        met = input.nextDouble();

        met = met * 100;

        System.out.printf("Será %s centímetros.", met);
    }
}
