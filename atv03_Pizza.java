import java.util.Scanner;

public class atv03_Pizza {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Informe seu peso(em kgs): ");
        peso = input.nextDouble();

        System.out.println("Informe sua altura pls(em metros): ");
        altura = input.nextDouble();

        imc = peso / (altura * altura);

        //Abaixo do peso
        if (imc < 18.5) {
            System.out.printf("Seu IMC é de: " + imc);
            System.out.printf("\nEstá abaixo do peso bro.");

        //Peso normal
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Seu IMC é de: " + imc);
            System.out.printf("\nEstá com peso normal, nice.");

        //Sobrepeso
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.printf("Seu IMC é de: " + imc);
            System.out.printf("\nEstá sobrepeso bro.");

        //Obesidade Grau 1
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.printf("Seu IMC é de: " + imc);
            System.out.printf("\nEstá com obesidade de grau 1 bro.");

        //Obesidade Grau 2
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.printf("Seu IMC é de: " + imc);
            System.out.printf("\nEstá com obesidade de grau 2 bro.");

        //Obesidade Grau 3 - Mórbida
        } else if (imc >= 40.0) {
            System.out.printf("Seu IMC é de: " + imc);
            System.out.printf("\nEstá com obesidade de grau 3 - Mórbida bro.");

        
        } else {
            System.out.printf("Erro de cálculo rip");

        }
    }
}
