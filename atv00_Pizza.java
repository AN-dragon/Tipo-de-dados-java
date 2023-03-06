import java.util.Scanner;

public class atv00_Pizza {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = input.nextInt();

        if (num > 0) {
            System.out.printf(num + " é um número positivo");

        } else if (num < 0){
            System.out.printf(num + " é um número negativo");

        } else {
            System.out.printf("Isso aí é zero");
            
        }
    }
}
