package typicalTasks.stringSplit;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        System.out.print("Введите сепаратор: ");
        char separator = (char) System.in.read();

        Split.splitStringByInternalMethod(str, separator);
        Split.splitStringThroughArrayOfCharacters(str, separator);
    }
}
