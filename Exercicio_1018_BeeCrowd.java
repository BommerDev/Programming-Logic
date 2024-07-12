import java.util.Scanner;

public class Exercicio_1018_BeeCrowd {

    /*
     * In this problem you have to read an integer value and calculate the smallest
     * possible number of banknotes in which the value may be decomposed. The
     * possible banknotes are 100, 50, 20, 10, 5, 2 and 1. Print the read value and
     * the list of banknotes.
     * 
     * Input
     * The input file contains an integer value N (0 < N < 1000000).
     * 
     * Output
     * Print the read number and the minimum quantity of each necessary banknotes in
     * Portuguese language, as the given example. Do not forget to print the end of
     * line after each line, otherwise you will receive “Presentation Error”.
     * 
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     *
     * 
     */

    public static void main(String[] args) throws Exception {

        // Cria um scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê o valor inteiro fornecido pelo usuário
        int value = sc.nextInt();

        // Imprime o valor lido
        System.out.println(value);

        // Calcula a quantidade de cédulas de R$ 100,00
        int note100 = value / 100;
        value %= 100; // Atualiza o valor restante

        // Calcula a quantidade de cédulas de R$ 50,00
        int note50 = value / 50;
        value %= 50; // Atualiza o valor restante

        // Calcula a quantidade de cédulas de R$ 20,00
        int note20 = value / 20;
        value %= 20; // Atualiza o valor restante

        // Calcula a quantidade de cédulas de R$ 10,00
        int note10 = value / 10;
        value %= 10; // Atualiza o valor restante

        // Calcula a quantidade de cédulas de R$ 5,00
        int note5 = value / 5;
        value %= 5; // Atualiza o valor restante

        // Calcula a quantidade de cédulas de R$ 2,00
        int note2 = value / 2;
        value %= 2; // Atualiza o valor restante

        // O valor restante é a quantidade de cédulas de R$ 1,00
        // Imprime a quantidade mínima de cédulas necessárias
        System.out.println(note100 + " nota(s) de R$ 100,00");
        System.out.println(note50 + " nota(s) de R$ 50,00");
        System.out.println(note20 + " nota(s) de R$ 20,00");
        System.out.println(note10 + " nota(s) de R$ 10,00");
        System.out.println(note5 + " nota(s) de R$ 5,00");
        System.out.println(note2 + " nota(s) de R$ 2,00");
        System.out.println(value + " nota(s) de R$ 1,00");

        // Fecha o Scanner
        sc.close();

    }
}
