
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1012_BeeCrowd {

    /*
     * Make a program that reads three floating point values: A, B and C. Then,
     * calculate and show:
     * a) the area of the rectangled triangle that has base A and height C.
     * b) the area of the radius's circle C. (pi = 3.14159)
     * c) the area of the trapezium which has A and B by base, and C by height.
     * d) the area of the square that has side B.
     * e) the area of the rectangle that has sides A and B.
     * 
     * Input
     * The input file contains three double values with one digit after the decimal
     * point.
     * 
     * Output
     * The output file must contain 5 lines of data. Each line corresponds to one of
     * the areas described above, always with a corresponding message (in
     * Portuguese) and one space between the two points and the value. The value
     * calculated must be presented with 3 digits after the decimal point.
     * 
     * Attention: For the program to work, you need to change the class to "Main";
     * 
     */

    // Definindo a constante PI com valor 3.14159
    final static double PI = 3.14159;

    public static void main(String[] args) throws Exception {

        // Definindo a localidade padrão para garantir que a formatação numérica seja a
        // correta
        Locale.setDefault(Locale.US);

        // Criando um scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lendo os valores de A, B e C fornecidos pelo usuário
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Calculando a área do triângulo retângulo com base A e altura C
        double triangle = A * C / 2.0;

        // Calculando a área do círculo de raio C
        double circle = Math.pow(C, 2) * PI;

        // Calculando a área do trapézio com bases A e B, e altura C
        double trapezium = (A + B) * C / 2.0;

        // Calculando a área do quadrado com lado B
        double square = Math.pow(B, 2);

        // Calculando a área do retângulo com lados A e B
        double rectangle = A * B;

        // Imprimindo os resultados com a formatação especificada
        System.out.printf("TRIANGULO: %.3f\n", triangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n", rectangle);

        // Fecha o Scanner
        sc.close();

    }

}
