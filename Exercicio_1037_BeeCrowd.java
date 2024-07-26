import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1037_BeeCrowd {

    /*
     * Timelimit: 1
     * You must make a program that read a float-point number and print a message
     * saying in which of following intervals the number belongs: [0,25] (25,50],
     * (50,75], (75,100]. If the read number is less than zero or greather than 100,
     * the program must print the message “Fora de intervalo” that means
     * "Out of Interval".
     * 
     * The symbol '(' represents greather than. For example:
     * [0,25] indicates numbers between 0 and 25.0000, including both.
     * (25,50] indicates numbers greather than 25 (25.00001) up to 50.0000000.
     * 
     * Input
     * The input file contains a floating-point number.
     * 
     * Output
     * The output must be a message like following example.
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    public static void main(String[] args) throws Exception {

        // Define o locale para US para garantir a formatação correta dos números
        Locale.setDefault(Locale.US);

        // Cria um scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê o número de ponto flutuante
        double number = sc.nextDouble();

        // Fecha o scanner para liberar recursos
        sc.close();

        // Verifica em qual intervalo o número se encontra e imprime a mensagem
        // apropriada
        if (number >= 0 && number <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (number > 25 && number <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (number > 50 && number <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (number > 75 && number <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
