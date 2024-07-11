import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1014_BeeCrowd {

    /*
     * Calculate a car's average consumption being provided the total distance
     * traveled (in Km) and the spent fuel total (in liters).
     * 
     * Input
     * The input file contains two values: one integer value X representing the
     * total distance (in Km) and the second one is a floating point number Y
     * representing the spent fuel total, with a digit after the decimal point.
     * 
     * Output
     * Present a value that represents the average consumption of a car with 3
     * digits after the decimal point, followed by the message "km/l".
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    public static void main(String[] args) throws Exception {

        // Define a localidade padrão para garantir a formatação numérica correta
        Locale.setDefault(Locale.US);

        // Cria um scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê a distância total percorrida em quilômetros (valor inteiro)
        int km = sc.nextInt();

        // Lê o total de combustível gasto em litros (valor de ponto flutuante)
        double liteFuel = sc.nextDouble();

        // Calcula o consumo médio do carro em km/l
        double kmPerLiter = km / liteFuel;

        // Imprime o consumo médio com 3 dígitos após o ponto decimal, seguido de "km/l"
        System.out.printf("%.3f km/l\n", kmPerLiter);

        // Fechar o Scanner
        sc.close();

    }
}
