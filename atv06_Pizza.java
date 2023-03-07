import java.util.Scanner;

public class atv06_Pizza {
    
    public static void main(String[] args) {

        //Exercício 5

        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Diga um número de 1 a 7: ");
        num = input.nextInt();


        if (num == 1) {
            System.out.printf("Domingo... ou Primeira-feira, se preferir =￣ω￣= ");


        } else if (num == 2) {
            System.out.printf("Segunda-feira >_< .....");


        } else if (num == 3) {
            System.out.printf("Terça-feira ￣へ￣ ");


        } else if (num == 4) {
            System.out.printf("Quarta-feira... metade da semana heh ^.^ ");


        } else if (num == 5) {
            System.out.printf("Quinta-feira OwO ");


        } else if (num == 6) {
            System.out.printf("Sexta-feira UwU..");


        } else if (num == 7) {
            System.out.printf("Sábado! Ou Sétima-feira, se preferir  ^_^");


        } else {
            System.out.printf("Eu pedi de 1 a 7...nada mais, nada menos ￣︿￣  ");


        }
    }
}