import java.util.Scanner;

public class Exercicio_1004_BeeCrowd {

    /*
     * Read two integer values. After this, calculate the product between them and
     * store the result in a variable named PROD. Print the result like the example
     * below. Do not forget to print the end of line after the result, otherwise you
     * will receive “Presentation Error”.
     * 
     * Input
     * The input file contains 2 integer numbers.
     * 
     * Output
     * Print the message "PROD" and PROD according to the following example, with a
     * blank space before and after the equal signal.
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Lê o primeiro valor inteiro
        int produtoA = sc.nextInt();
        // Lê o segundo valor inteiro
        int produtoB = sc.nextInt();

        // Calcula o produto dos dois valores e imprime o resultado
        System.out.println("PROD = " + (produtoA * produtoB));

        // Fecha o scanner
        sc.close();

    }

}
