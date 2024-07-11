import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1009_BeeCrowd {

    /*
     * Make a program that reads a seller's name, his/her fixed salary and the
     * sale's total made by himself/herself in the month (in money). Considering
     * that this seller receives 15% over all products sold, write the final salary
     * (total) of this seller at the end of the month , with two decimal places.
     * 
     * - Don’t forget to print the line's end after the result, otherwise you will
     * receive “Presentation Error”.
     * 
     * - Don’t forget the blank spaces.
     * 
     * Input
     * The input file contains a text (employee's first name), and two double
     * precision values, that are the seller's salary and the total value sold by
     * him/her.
     * 
     * Output
     * Print the seller's total salary, according to the given example.
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {

        // Define a localidade padrão para os EUA, garantindo que o separador decimal
        // seja um ponto
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê o nome do vendedor
        String name = sc.next();

        // Lê o salário fixo do vendedor
        double salary = sc.nextDouble();

        // Lê o valor total de vendas efetuadas pelo vendedor
        double salesMade = sc.nextDouble();

        // Calcula o bônus como 15% do total de vendas e soma com salário
        double bonus = 15.0 * salesMade / 100.0 + salary;

        // Imprime o salário total com duas casas decimais
        System.out.printf("TOTAL = R$ %.2f\n", bonus);

        // Fecha o Scanner
        sc.close();

    }
}
