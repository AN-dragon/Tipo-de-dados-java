import java.util.Scanner;

public class InserirObjeto {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int base, altura, area;

        System.out.println("Informe o valor da base: ");
        base = input.nextInt();

        System.out.println("Informe o valor da altura: ");
        altura = input.nextInt();

        area = base * altura;

        System.out.printf("A área de um retângulo de base = " + base);
        System.out.printf("\n e altura de = " + altura);
        System.out.printf("\n é = " + area + "\n");
        
    }

}
