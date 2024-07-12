import java.util.Scanner;

public class Exercicio_1007_BeeCrowd {

    /*
     * Read four integer values named A, B, C and D. Calculate and print the
     * difference of product A and B by the product of C and D (A * B - C * D).
     * 
     * Input
     * The input file contains 4 integer values.
     * 
     * Output
     * Print DIFERENCA (DIFFERENCE in Portuguese) with all the capital letters,
     * according to the following example, with a blank space before and after the
     * equal signal.
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */
    public static void main(String[] args) throws Exception {

        // Cria o objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Ler quatro valores inteiros
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        // Calcula a diferença entre o produto de A e B pelo produto de C e D
        int difference = A * B - C * D;

        // Imprime a diferença no formato exigido
        System.out.println("DIFERENCA = " + difference);

        // Fecha o Scanner
        sc.close();

    }
}

