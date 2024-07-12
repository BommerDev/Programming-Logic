import java.util.Scanner;

public class Exercicio_1016_BeeCrowd {

    /*
     * Two cars (X and Y) leave in the same direction. The car X leaves with a
     * constant speed of 60 km/h and the car Y leaves with a constant speed of 90 km
     * / h.
     * 
     * In one hour (60 minutes) the car Y can get a distance of 30 kilometers from
     * the X car, in other words, it can get away one kilometer for each 2 minutes.
     * 
     * Read the distance (in km) and calculate how long it takes (in minutes) for
     * the car Y to take this distance in relation to the other car.
     * 
     * Input
     * The input file contains 1 integer value.
     * 
     * Output
     * Print the necessary time followed by the message "minutos" that means minutes
     * in Portuguese.
     * 
     * 
     * Attention: For the program to work, you need to change the class to "Main".
     * 
     */

    public static void main(String[] args) throws Exception {

        // Cria um scanner para receber a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Ler a distância de entrada
        int distance = sc.nextInt();

        // Calcular o tempo em minutos
        int time = distance * 2;

        // Imprimir o resultado
        System.out.println(time + " minutos");

        // Fecha o Scanner
        sc.close();

    }

}
