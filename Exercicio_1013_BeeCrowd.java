import java.util.Scanner;

public class Exercicio_1013_BeeCrowd {

    /*
     * Make a program that reads 3 integer values and present the greatest one
     * followed by the message "eh o maior". Use the following formula:
     * 
     * formula: (a + b + |a - b|) / 2
     * 
     * Input
     * The input file contains 3 integer values.
     * 
     * Output
     * Print the greatest of these three values followed by a space and the message
     * “eh o maior”.
     * 
     * Attention: For the program to work, you need to change the class to "Main";
     * 
     */

    public static void main(String[] args) throws Exception {

        // Cria um scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê três inteiros fornecidos pelo usuário
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Calcula o maior valor entre a e b usando a fórmula: (a + b + |a - b|) / 2
        int abs_1 = (a + b + Math.abs(a - b)) / 2;

        // Calcula o maior valor entre abs_1 (maior de a e b) e c usando a mesma fórmula
        int abs_2 = (abs_1 + c + Math.abs(abs_1 - c)) / 2;

        // Imprime o maior valor entre os três números fornecidos
        System.out.println(abs_2 + " eh o maior");

        // Fecha o Scanner
        sc.close();

    }

}