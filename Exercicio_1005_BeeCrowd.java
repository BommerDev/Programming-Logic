import java.util.Scanner;
import java.util.Locale;

public class Exercicio_1005_BeeCrowd {

    /*
     * Read two floating points' values of double precision A and B, corresponding
     * to two student's grades. After this, calculate the student's average,
     * considering that grade A has weight 3.5 and B has weight 7.5. Each grade can
     * be from zero to ten, always with one digit after the decimal point. Don’t
     * forget to print the end of line after the result, otherwise you will receive
     * “Presentation Error”. Don’t forget the space before and after the equal sign.
     * 
     * Input
     * The input file contains 2 floating points' values with one digit after the
     * decimal point.
     * 
     * Output
     * Print the message "MEDIA"(average in Portuguese) and the student's average
     * according to the following example, with 5 digits after the decimal point and
     * with a blank space before and after the equal signal.
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    public static void main(String[] args) throws Exception {

        // Define a localidade padrão para os EUA, garantindo que o separador decimal
        // seja um ponto
        Locale.setDefault(Locale.US);

        // Cria o objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Ler o valor das notas
        Double gradeA = sc.nextDouble();
        Double gradeB = sc.nextDouble();

        // Calcula a média ponderada das notas
        double media = (gradeA * 3.5 + gradeB * 7.5) / (3.5 + 7.5);

        // Imprime a média com 5 casas decimais
        System.out.printf("MEDIA = %.5f\n", media);

        // Fecha o Scanner
        sc.close();

    }

}

