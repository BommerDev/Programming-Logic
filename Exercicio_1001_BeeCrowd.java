public

import java.util.Scanner;

public class Exercicio_1001_BeeCrowd {

    /*
     * Read 2 variables, named A and B and make the sum of these two variables,
     * assigning its result to the variable X. Print X as shown below. Print endline
     * after the result otherwise you will get “Presentation Error”.
     * 
     * Input
     * The input file will contain 2 integer numbers.
     * 
     * Output
     * Print the letter X (uppercase) with a blank space before and after the equal
     * signal followed by the value of X, according to the following example.
     * 
     * Obs.: don't forget the endline after all.
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    public static void main(String[] args) throws Exception {

        // Cria o objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Solicita dois valores inteiros
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Imprime a saída da soma de A + B no formato desejado
        System.out.println("X = " + (A + B));

        // Fecha o Scanner
        sc.close();

    }
}
