import java.util.Scanner;

public class MediaDeNotas {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2, media;

        System.out.println("Digite a primeira nota: ");
        n1 = input.nextInt();

        System.out.println("Digite a segunda nota: ");
        n2 = input.nextInt();

        media = (n1 + n2) / 2;

        System.out.printf("A primeira nota foi %s e a segunda foi %s...", n1, n2);
        System.out.printf("logo, a média é: " + media + "\n");

        if (media >=8 && media <=10) {
            System.out.print("Aluno está aprovado.\n");

        } else if (media >= 5 && media <= 7) {
            System.out.print("Aluno está aprovado, porém terá de fazer recuperação. \n");

        } else if (media >= 0 && media <= 4) {
            System.out.print("Aluno está reprovado rip \n");

        } else{
            System.out.print("Erro na média \n");

        }

    }
}
