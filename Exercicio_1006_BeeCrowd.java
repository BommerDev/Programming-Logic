import java.util.Scanner;
import java.util.Locale;

public class Exercicio_1006_BeeCrowd {

    /*
     * Read three values (variables A, B and C), which are the three student's
     * grades. Then, calculate the average, considering that grade A has weight 2,
     * grade B has weight 3 and the grade C has weight 5. Consider that each grade
     * can go from 0 to 10.0, always with one decimal place.
     * 
     * Input
     * The input file contains 3 values of floating points (double) with one digit
     * after the decimal point.
     * 
     * Output
     * Print the message "MEDIA"(average in Portuguese) and the student's average
     * according to the following example, with a blank space before and after the
     * equal signal.
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
        Double gradeC = sc.nextDouble();

        // Calcula a média ponderada das notas
        double media = (gradeA * 2.0 + gradeB * 3.0 + gradeC * 5.0) / (2.0 + 3.0 + 5.0);

        // Imprime a média com 5 casas decimais
        System.out.printf("MEDIA = %.1f\n", media);

        // Fecha o Scanner
        sc.close();

    }

}

