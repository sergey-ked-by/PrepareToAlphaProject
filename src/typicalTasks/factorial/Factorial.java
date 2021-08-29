package typicalTasks.factorial;

public class Factorial {
    static public int calculateFactorialWithCycle(int number) {
        int factorial = 1;
        if (number < 1) {
            return factorial;
        }
        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    static public int calculateFactorialWithRecursion(int number) {
        int factorial = 1;
        if (number < 1) {
            return factorial;
        }
        factorial = number * calculateFactorialWithRecursion(number - 1);
        return factorial;
    }
}
