import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1038_BeeCrowd {

    /*
     * Using the following table, write a program that reads a code and the amount
     * of an item. After, print the value to pay. This is a very simple program with
     * the only intention of practice of selection commands.
     * 
     * | Código | Descrição       | Preço   |
     * |--------|-----------------|---------|
     * | 1      | Cachorro Quente | R$ 4.00 |
     * | 2      | X-Salada        | R$ 4.50 |
     * | 3      | X-Bacon         | R$ 5.00 |
     * | 4      | Torrada Simples | R$ 2.00 |
     * | 5      | Refrigerante    | R$ 1.50 |
     * 
     * Input
     * The input file contains two integer numbers X and Y. X is the product code
     * and Y is the quantity of this item according to the above table.
     * 
     * Output
     * The output must be a message "Total: R$ " followed by the total value to be
     * paid, with 2 digits after the decimal point.
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    public static void main(String[] args) throws Exception {

        // Define a localidade padrão para o formato dos números
        Locale.setDefault(Locale.US);
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê o código do produto e a quantidade
        int code = sc.nextInt();
        int quantity = sc.nextInt();

        // Inicializa a variável product com 0.0
        double product = 0.0;

        // Verifica o código do produto e calcula o total de acordo com o preço
        // correspondente
        if (code == 1) {
            double hotDog = quantity * 4.0;
            product = hotDog; // Produto é um cachorro-quente
        } else if (code == 2) {
            double xSalad = quantity * 4.5;
            product = xSalad; // Produto é um x-salada
        } else if (code == 3) {
            double xBacon = quantity * 5.0;
            product = xBacon; // Produto é um x-bacon
        } else if (code == 4) {
            double simpleToast = quantity * 2.0;
            product = simpleToast; // Produto é um torrada simples
        } else {
            double refreshment = quantity * 1.5;
            product = refreshment; // Produto é um refrigerante
        }

        // Imprime o total formatado com duas casas decimais
        System.out.printf("Total: R$ %.2f\n", product);

        // Fecha o objeto Scanner
        sc.close();

    }
}
