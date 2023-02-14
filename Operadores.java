public class Operadores {

    public static void main(String[] args) {

        int x = 8;
        int y = 2;



        /* '%d\n' o '\' vai mandar pra linha de baixo, tipo o <br> do html */
        System.out.printf("x + y = %d\n", x + y);
        System.out.printf("x - y = %d\n", x - y);
        System.out.printf("x * y = %d\n", x * y);
        System.out.printf("x / y = %d\n", x / y); //divisão inteira
        System.out.printf("x / y = %2.2f\n", x /(double)y); //divisão normal
        System.out.printf("x %% y = %d\n", x % y); //restante da divisão
        /* '%2.2f\n' o 'f' arredonda o numero, de 4,555... vai para 4,50 */
    }

}
