import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1036_BeeCrowd {

    /*
     * Read 3 floating-point numbers. After, print the roots of bhaskara’s formula.
     * If it's impossible to calculate the roots because a division by zero or a
     * square root of a negative number, presents the message “Impossivel calcular”.
     * 
     * Input
     * Read 3 floating-point numbers (double) A, B and C.
     * 
     * Output
     * Print the result with 5 digits after the decimal point or the message if it
     * is impossible to calculate.
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    public static void main(String[] args) {

        // Define o locale para US para garantir a formatação correta dos números
        Locale.setDefault(Locale.US);

        // Cria um scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê os valores de A, B e C
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Fecha o scanner para liberar recursos
        sc.close();

        // Calcula o delta da fórmula quadrática
        double delta = Math.pow(B, 2.0) - 4.0 * A * C;

        // Verifica se a fórmula de Bhaskara pode ser calculada e imprime o resultado
        // formatado
        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-B + Math.sqrt(delta)) / (2.0 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2.0 * A);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}
