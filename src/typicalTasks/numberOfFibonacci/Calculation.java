package typicalTasks.numberOfFibonacci;

public class Calculation {
    static public void calculateNumberOfFibonacci(int number) {
        int prePreviousNumber = 0;
        int previousNumber = 1;
        int currentNumber;

        System.out.print("Числа Фибоначчи (первые " + number + "): " + prePreviousNumber + ", " + previousNumber);
        for (int i = 1; i < number - 1; i++){
            currentNumber = prePreviousNumber + previousNumber;
            System.out.print(", " + currentNumber);
            prePreviousNumber = previousNumber;
            previousNumber = currentNumber;
        }
    }
}
