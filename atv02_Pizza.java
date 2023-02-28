import java.util.Scanner;

public class atv2_Pizza {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sal_atual, sal_novo;

        System.out.println("Informe seu salário: ");
        sal_atual = input.nextFloat();


        //Salário entre 1000 e 2000
        if (sal_atual >= 1000 && sal_atual <= 2000) {
            System.out.printf("Seu salário atual é: R$" + sal_atual);

            //Cálculo do salário novo
            sal_novo = sal_atual * 1.15;
            System.out.printf("\nAgora com o aumento, seu salário é: R$" + sal_novo);

        //Salário entre 2000 e 3000
        } else if (sal_atual > 2000 && sal_atual <= 3000) {
            System.out.printf("Seu salário atual é: R$" + sal_atual);

            //Cálculo do salário novo
            sal_novo = sal_atual * 1.10;
            System.out.printf("\nAgora com o aumento, seu salário é: R$" + sal_novo);

        //Salário acima de 3000
        } else if (sal_atual > 3000 && sal_atual <= 999000) {
            System.out.printf("Seu salário atual é: R$" + sal_atual);

            //Cálculo do salário novo
            sal_novo = sal_atual * 1.05;
            System.out.printf("\nAgora com o aumento, seu salário é: R$" + sal_novo);

        //Salário surreal
         } else {
             System.out.printf("Seu salário atual é: R$" + sal_atual + "...?");
             System.out.printf("\nTem certeza que trabalha aqui?");
     }
    }
  }

