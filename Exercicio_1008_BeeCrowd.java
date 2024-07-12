import java.util.Scanner;

public class Exercicio_1008_BeeCrowd {

    /*
     * Write a program that reads an employee's number, his/her worked hours number
     * in a month and the amount he received per hour. Print the employee's number
     * and salary that he/she will receive at end of the month, with two decimal
     * places.
     * 
     * Don’t forget to print the line's end after the result, otherwise you will
     * receive “Presentation Error”.
     * Don’t forget the space before and after the equal signal and after the U$.
     * Input
     * The input file contains 2 integer numbers and 1 value of floating point,
     * representing the number, worked hours amount and the amount the employee
     * receives per worked hour.
     * 
     * Output
     * Print the number and the employee's salary, according to the given example,
     * with a blank space before and after the equal signal.
     * 
     * Attention: For the program to work, you need to change the class to "Main";
     * 
     */

    public static void main(String[] args) throws Exception {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê o número de identificação do funcionário
        int number = sc.nextInt();

        // Lê a quantidade de horas trabalhadas pelo funcionário
        int hour = sc.nextInt();

        // Lê o valor que o funcionário recebe por hora trabalhada
        double hourlyWage = sc.nextDouble();

        // Lê o valor que o funcionário recebe por hora trabalhada
        double salaryTime = hour * hourlyWage;

        // Imprime o número de identificação do funcionário
        System.out.println("NUMBER = " + number);

        // Imprime o salário do funcionário com duas casas decimais
        System.out.printf("SALARY = U$ %.2f\n", salaryTime);

        // Fecha o Scanner
        sc.close();
    }
}

