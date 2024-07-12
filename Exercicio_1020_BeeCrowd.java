import java.util.Scanner;

public class Exercicio_1020_BeeCrowd {

    /*
     * Read an integer value corresponding to a person's age (in days) and print it
     * in years, months and days, followed by its respective message “ano(s)”,
     * “mes(es)”, “dia(s)”.
     * 
     * Note: only to facilitate the calculation, consider the whole year with 365
     * days and 30 days every month. In the cases of test there will never be a
     * situation that allows 12 months and some days, like 360, 363 or 364. This is
     * just an exercise for the purpose of testing simple mathematical reasoning.
     * 
     * Input
     * The input file contains 1 integer value.
     * 
     * Output
     * Print the output, like the following example.
     * 
     * Attention: For the program to work, you need to change the class to "Main";
     * 
     */

    public static void main(String[] args) throws Exception {

        // Cria um scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê o valor inteiro fornecido pelo usuário (idade em dias)
        int totalDays = sc.nextInt();

        // Calcula o número de anos
        int years = totalDays / 365;

        // Atualiza o valor restante, removendo os anos
        totalDays %= 365;

        // Calcula o número de meses
        int months = totalDays / 30;
        // Atualiza o valor restante, removendo os meses
        totalDays %= 30;

        // Imprime o resultado no formato anos, meses e dias
        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(totalDays + " dia(s)");

        // Fecha o Scanner
        sc.close();

    }
}
