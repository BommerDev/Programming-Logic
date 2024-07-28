import java.util.Scanner;

public class Exercicio_1019_BeeCrowd {

    /*
     * Read an integer value, which is the duration in seconds of a certain event in
     * a factory, and inform it expressed in hours:minutes:seconds.
     * 
     * Input
     * The input file contains an integer N.
     * 
     * Output
     * Print the read time in the input file (seconds) converted in
     * hours:minutes:seconds like the following example.
     * 
     * Attention: For the program to work, you need to change the class to "Main";
     * 
     */

    public static void main(String[] args) throws Exception {

        // Cria um Scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê o valor inteiro fornecido pelo usuário (duração em segundos)
        int time = sc.nextInt();

        // Calcula o número de horas
        int hour = time / 3600;
        // Atualiza o valor restante, removendo as horas
        time %= 3600;

        // Calcula o número de minutos
        int minutes = time / 60;
        // Atualiza o valor restante, removendo os minutos
        time %= 60;

        // O valor restante é o número de segundos
        int second = time;

        // Imprime o resultado no formato horas:minutos:segundos
        System.out.println(hour + ":" + minutes + ":" + second);

        // Fecha o Scanner
        sc.close();

    }
}
