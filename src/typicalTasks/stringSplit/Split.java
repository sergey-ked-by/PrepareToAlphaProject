package typicalTasks.stringSplit;

public class Split {
    static public void splitStringByInternalMethod(String string, char separator) {
        String[] subString;
        System.out.print("\nРазделённая строка (через метод): ");
        subString = string.split(String.valueOf(separator));
        for (String str: subString) {
            System.out.print("\n" + str);
        }
    }

    static public void splitStringThroughArrayOfCharacters(String string, char separator) {
        char[] stringToArray = string.toCharArray();
        System.out.println("\nРазделённая строка (через массив символов): ");
        for (int i = 0; i < stringToArray.length; i++) {
            System.out.print(stringToArray[i]);
            if (stringToArray[i] == separator) {
                System.out.println("");
            }
        }
    }
}
