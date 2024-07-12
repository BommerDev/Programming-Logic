import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1017_BeeCrowd {

    /*
     * Little John wants to calculate and show the amount of spent fuel liters on a
     * trip, using a car that does 12 Km/L. For this, he would like you to help him
     * through a simple program. To perform the calculation, you have to read spent
     * time (in hours) and the same average speed (km/h). In this way, you can get
     * distance and then, calculate how many liters would be needed. Show the value
     * with three decimal places after the point.
     * 
     * Input
     * The input file contains two integers. The first one is the spent time in the
     * trip (in hours). The second one is the average speed during the trip (in
     * Km/h).
     * 
     * Output
     * Print how many liters would be needed to do this trip, with three digits
     * after the decimal point.
     * 
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    public static void main(String[] args) throws Exception {

        // Define o locale para US para garantir a formatação correta dos números
        Locale.setDefault(Locale.US);

        // Cria um scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê o tempo gasto na viagem (em horas)
        int spentTime = sc.nextInt();

        // Lê a velocidade média durante a viagem (em km/h)
        int travelPace = sc.nextInt();

        // Calcula a quantidade total de litros necessária
        // A fórmula é: tempo gasto * velocidade média / 12.0 (km/L)
        double totalLiters = spentTime * travelPace / 12.0;

        // Imprime o resultado com três casas decimais
        System.out.printf("%.3f\n", totalLiters);

        // Fecha o Scanner
        sc.close();

    }

}
