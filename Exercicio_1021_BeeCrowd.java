import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1021_BeeCrowd {

    /*
     * Read a value of floating point with two decimal places. This represents a
     * monetary value. After this, calculate the smallest possible number of notes
     * and coins on which the value can be decomposed. The considered notes are of
     * 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05
     * and 0.01. Print the message “NOTAS:” followed by the list of notes and the
     * message “MOEDAS:” followed by the list of coins.
     * 
     * Input
     * The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00).
     * 
     * Output
     * Print the minimum quantity of banknotes and coins necessary to change the
     * initial value, as the given example.
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    public static void main(String[] args) throws Exception {

        // Define o locale para US para garantir a formatação correta dos números
        Locale.setDefault(Locale.US);

        // Cria um scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê o valor de ponto flutuante fornecido pelo usuário
        double value = sc.nextDouble();

        // Transforma o valor em centavos para evitar problemas com arredondamento em
        // operações com ponto flutuante
        int centavos = (int) (value * 100);

        // Define os valores das cédulas e moedas em centavos
        int[] note = { 10000, 5000, 2000, 1000, 500, 200 };
        int[] coin = { 100, 50, 25, 10, 5, 1 };

        // Variáveis para contar a quantidade de cada nota e moeda
        int[] numberOfNotes = new int[6];
        int[] numberOfCoins = new int[6];

        // Calcula a quantidade de cada nota
        for (int i = 0; i < note.length; i++) {
            numberOfNotes[i] = centavos / note[i];
            centavos %= note[i];
        }

        // Calcula a quantidade de cada moeda
        for (int i = 0; i < coin.length; i++) {
            numberOfCoins[i] = centavos / coin[i];
            centavos %= coin[i];
        }

        // Imprime a quantidade mínima de cédulas necessárias
        System.out.println("NOTAS:");
        for (int i = 0; i < note.length; i++) {
            System.out.printf("%d nota(s) de R$ %.2f\n", numberOfNotes[i], note[i] / 100.0);
        }

        // Imprime a quantidade mínima de moedas necessárias
        System.out.println("MOEDAS:");
        for (int i = 0; i < coin.length; i++) {
            System.out.printf("%d moeda(s) de R$ %.2f\n", numberOfCoins[i], coin[i] / 100.0);
        }

        // Fecha o Scanner
        sc.close();
    }
}
