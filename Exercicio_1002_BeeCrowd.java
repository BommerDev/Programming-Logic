import java.util.Scanner;
import java.util.Locale;

public class Exercicio_1002_BeeCrowd {

    /*
     * The formula to calculate the area of a circumference is defined as A = π .
     * R2. Considering to this problem that π = 3.14159:
     * 
     * Calculate the area using the formula given in the problem description.
     * 
     * Input
     * The input contains a value of floating point (double precision), that is the
     * variable R.
     * 
     * Output
     * Present the message "A=" followed by the value of the variable, as in the
     * example bellow, with four places after the decimal point. Use all double
     * precision variables. Like all the problems, don't forget to print the end of
     * line after the result, otherwise you will receive "Presentation Error".
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    // Constante de PI.
    final static double PI = 3.14159;

    public static void main(String[] args) throws Exception {
        // Define a localidade padrão para os EUA, garantindo que o separador decimal
        // seja um ponto
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Lê o valor de R
        double R = sc.nextDouble();

        // Calcula a área usando a fórmula A = π * R^2
        double A = PI * Math.pow(R, 2);

        // Imprime a área com quatro casas decimais
        System.out.printf("A=%.4f\n", A);

        // Fecha o Scanner
        sc.close();

    }

}
