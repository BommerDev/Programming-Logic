import java.util.Scanner;

public class Exercicio_1035_BeeCrowd {

    /*
     * Read 4 integer values A, B, C and D. Then if B is greater than C and D is
     * greater than A and if the sum of C and D is greater than the sum of A and B
     * and if C and D were positives values and if A is even, write the message
     * “Valores aceitos” (Accepted values). Otherwise, write the message “Valores
     * nao aceitos” (Values not accepted).
     * 
     * Input
     * Four integer numbers A, B, C and D.
     * 
     * Output
     * Show the corresponding message after the validation of the values​​.
     * 
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    public static void main(String[] args) throws Exception {

        // Cria um objeto Scanner para ler a entrada do console
        Scanner sc = new Scanner(System.in);

        // Lê os valores inteiros A, B, C e D
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // Fecha o Scanner para liberar os recursos
        sc.close();

        // Verifica se todas as condições são atendidas
        boolean accepted = B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0;

        // Imprime o resultado com base na avaliação das condições
        if (accepted) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
