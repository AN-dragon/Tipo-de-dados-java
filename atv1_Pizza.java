import java.util.Scanner;

public class atv1_Pizza {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome;
        int idade;

        //Nome
        System.out.println("Diga seu nome: ");
        nome = input.next();

        //Idade
        System.out.println("Diga sua idade: ");
        idade = input.nextInt();


        //Recém Nascido
        if (idade == 0) {
            System.out.printf("Olá %s, tu não completaste nenhum ano, logo, ainda é um recém nascido.", nome);
            
        }
        //Criança
          else if (idade > 0 && idade <= 12) {
            System.out.printf("Olá %s, tu tens %s anos, logo, ainda é uma criança.", nome, idade);

        //Adolescente
        } else if (idade > 12 && idade <= 17) {
            System.out.printf("Olá %s, tu tens %s anos, logo, é um adolescente.", nome, idade);

        //Adulto
        } else if(idade > 17 && idade <= 58) {
            System.out.printf("Olá %s, tu tens %s anos, logo, é um adulto.", nome, idade);

        //Idoso
        } else if (idade > 59 && idade <= 140) {
            System.out.printf("Olá %s, tu tens %s anos, logo, é um idoso.", nome, idade);

        //Além
        } else {
            System.out.printf("Olá %s, claramente você não tem uma Air Fryer...", nome);

        }
    }
}
