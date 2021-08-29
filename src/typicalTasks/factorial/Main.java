package typicalTasks.factorial;
import java.util.Scanner;

import static typicalTasks.factorial.Factorial.calculateFactorialWithCycle;
import static typicalTasks.factorial.Factorial.calculateFactorialWithRecursion;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.println("Факториал введённого числа (через цикл): " + calculateFactorialWithCycle(number));
        System.out.println("Факториал введённого числа (через рекурсию): " + calculateFactorialWithRecursion(number));
    }
}
