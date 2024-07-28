import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1015_BeeCrowd {

    /*
     * Read the four values corresponding to the x and y axes of two points in the
     * plane, p1 (x1, y1) and p2 (x2, y2) and calculate the distance between them,
     * showing four decimal places, according to the formula:
     * 
     * Distance = sqrt((x2 - x1)² + (y2 - y1)²).
     * 
     * Input
     * The input file contains two lines of data. The first one contains two double
     * values: x1 y1 and the second one also contains two double values with one
     * digit after the decimal point: x2 y2.
     * 
     * Output
     * Calculate and print the distance value using the provided formula, with 4
     * decimal places.
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    public static void main(String[] args) throws Exception {

        // Define o locale para US para garantir o ponto decimal
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê os valores de entrada
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calcula a distância usando a fórmula
        double distance = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));

        // Imprime a distância com 4 casas decimais
        System.out.printf("%.4f\n", distance);

        // Fecha o Scanner
        sc.close();

    }
}
