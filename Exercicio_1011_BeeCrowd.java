
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1011_BeeCrowd {

    /*
     * Make a program that calculates and shows the volume of a sphere being
     * provided the value of its radius (R) . The formula to calculate the volume
     * is: (4/3) * pi * R3. Consider (assign) for pi the value 3.14159.
     * 
     * Tip: Use (4/3.0) or (4.0/3) in your formula, because some languages
     * (including C++) assume that the division's result between two integers is
     * another integer. :)
     * 
     * Input
     * The input contains a value of floating point (double precision).
     * 
     * Output
     * The output must be a message "VOLUME" like the following example with a space
     * before and after the equal signal. The value must be presented with 3 digits
     * after the decimal point.
     * 
     * Attention: For the program to work, you need to change the class to "Main".
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

        // Lendo o valor do raio fornecido pelo usuário
        double radius = sc.nextDouble();

        // Calculando o volume da esfera usando a fórmula (4/3) * pi * R^3
        double sphere = 4.0 / 3.0 * Math.pow(radius, 3) * PI;

        // Imprimindo o resultado com a formatação especificada
        System.out.printf("VOLUME = %.3f\n", sphere);

        // Fechando o scanner
        sc.close();

    }
}
