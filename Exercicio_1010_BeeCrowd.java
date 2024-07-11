import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1010_BeeCrowd {

    /*
     * In this problem, the task is to read a code of a product 1, the number of
     * units of product 1, the price for one unit of product 1, the code of a
     * product 2, the number of units of product 2 and the price for one unit of
     * product 2. After this, calculate and show the amount to be paid.
     * 
     * Input
     * The input file contains two lines of data. In each line there will be 3
     * values: two integers and a floating value with 2 digits after the decimal
     * point.
     * 
     * Output
     * The output file must be a message like the following example where
     * "Valor a pagar" means Value to Pay. Remember the space after ":" and after
     * "R$" symbol. The value must be presented with 2 digits after the point.
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

        // Variável para armazenar o valor total a pagar
        double total = 0;

        // Loop para ler os dados de dois produtos
        for (int i = 0; i <= 1; i++) {

            // Lê o código do produto (não utilizado no cálculo)
            int code = sc.nextInt();

            // Lê a quantidade de unidades do produto
            int amount = sc.nextInt();

            // Lê o preço por unidade do produto
            double price = sc.nextDouble();

            // Calcula o valor total do produto (quantidade * preço) e adiciona ao total
            // geral
            total += amount * price;

        }

        // Imprime o valor total a pagar com duas casas decimais
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        // Fecha o scanner
        sc.close();

    }
}
