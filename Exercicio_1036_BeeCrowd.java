import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1036_BeeCrowd {

    public static void main(String[] args) throws Exception {

        // Define o locale para US para garantir a formatação correta dos números
        Locale.setDefault(Locale.US);

        // Cria um scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        sc.close();

        double delta = Math.pow(B, 2.0) - 4.0 * A * C;

        String result = (A == 0 || delta <= 0)
                ? "Impossivel calcular"
                : String.format("R1: %.5f\n R2: %.5f\n",
                        (-B + Math.sqrt(delta)) / (2.0 * A),
                        (-B - Math.sqrt(delta)) / (2.0 * A));

        System.out.println(result);
    }
}
