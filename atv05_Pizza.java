import java.util.Scanner;

public class atv05_Pizza {
    
    public static void main(String[] args) {

        //Exercício 4

        Scanner input = new Scanner(System.in);
        String nome1, nome2;
        int idade1, idade2, dif_idade;


        //Primeira pessoa
        System.out.println("Primeiro usuário, diga seu nome: ");
        nome1 = input.next();

        System.out.println("E agora, sua idade: ");
        idade1 = input.nextInt();

        //Segunda pessoa
        System.out.println("Segundo usuário, diga seu nome: ");
        nome2 = input.next();

        System.out.println("E agora, sua idade: ");
        idade2 = input.nextInt();


        if (idade1 > idade2) {
            System.out.printf(nome1 + " com %s anos, é mais velho que %s.", idade1, nome2);
            
            //Diferença de idade
            dif_idade = idade1 - idade2;
            System.out.printf("\nDiferença de %s anos!", dif_idade);

        } else if (idade2 > idade1) {
            System.out.printf(nome2 + " com %s anos, é mais velho que %s.", idade2, nome1);


            dif_idade = idade2 - idade1;
            System.out.printf("\nDiferença de %s anos!", dif_idade);
            
        } else {
            System.out.printf("%s e %s tem a mesma idade uwu", nome1, nome2);

        }
    }
}
