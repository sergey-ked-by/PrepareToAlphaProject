package typicalTasks.arrayReverse;

public class Reverse {
    static public void reverse(int[] array) {
        int halfLength = array.length / 2;
        int temp;
        for (int i = 0; i < halfLength; i++) {
            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }

        System.out.println("\nПеревёрнутый массив: ");
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
