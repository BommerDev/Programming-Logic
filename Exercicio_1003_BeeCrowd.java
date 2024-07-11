import java.util.Scanner;

public class Exercicio_1003_BeeCrowd {

    /*
     * Read two integer values, in this case, the variables A and B. After this,
     * calculate the sum between them and assign it to the variable SOMA. Write the
     * value of this variable.
     * 
     * Input
     * The input file contains 2 integer numbers.
     * 
     * Output
     * Print the message "SOMA" with all the capital letters, with a blank space
     * before and after the equal signal followed by the corresponding value to the
     * sum of A and B. Like all the problems, don't forget to print the end of line,
     * otherwise you will receive "Presentation Error"
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     */

    public static void main(String[] args) throws Exception {

        // Cria um objeto Scanner para ler a entrada do console
        try (Scanner sc = new Scanner(System.in)) {
            // Ler o primeiro número inteiro
            int A = sc.nextInt();
            // Ler o segundo número inteiro
            int B = sc.nextInt();

            // Calcula e soma o resultado de A + B, e escreve a saída no formato requerido
            System.out.println("SOMA = " + (A + B));
        }
    }
}
