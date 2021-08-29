package typicalTasks.arrayReverse;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int number = scanner.nextInt();
        int[] array = new int[number];

        Random random = new Random();
        for (int i = 0; i < number; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }

        Reverse.reverse(array);
    }
}
