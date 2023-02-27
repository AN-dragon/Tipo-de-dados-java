import java.util.Scanner;


public class SomaDeNumeros {
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, soma;

        System.out.println("Informe o valor do primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Informe o valor do segundo número: ");
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.printf("Seu primeiro número foi %s e o segundo %s...", num1, num2);
        System.out.printf("\n >>A soma dos dois números é: " + soma);

    }
}