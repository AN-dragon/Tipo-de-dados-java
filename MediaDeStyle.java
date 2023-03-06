import java.util.Scanner;

public class MediaDeStyle {
    
    public static void main(String[] args) {

     /*tem a mesma função da MedidaDeNotas, só que com notas de Devil May Cry 3 */

        Scanner input = new Scanner(System.in);
        int n1, n2, media;

        System.out.println("Digite a primeira nota: ");
        n1 = input.nextInt();

        System.out.println("Digite a segunda nota: ");
        n2 = input.nextInt();

        media = (n1 + n2) / 2;

        System.out.printf("A média foi: " + media + "\n");

        if (media == 10) {
            System.out.print("SSStylish!!!");

        } else if (media == 9) {
            System.out.print("SShowtime!!");

        } else if (media == 8) {
            System.out.print("Sweet!");

        } else if (media == 7) {
            System.out.print("Alright!");

        } else if (media == 5 || media == 6) {
            System.out.print("Blast!");

        } else if (media == 3 || media == 4) {
            System.out.print("Crazy!");

        } else if (media == 1 || media == 2) {
            System.out.print("Dope!");

        } else {
            System.out.print("Where is your motivation?");
            
        }
    }
}
