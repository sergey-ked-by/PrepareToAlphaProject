package typicalTasks.numberOfFibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        Calculation.calculateNumberOfFibonacci(number);
    }
}

