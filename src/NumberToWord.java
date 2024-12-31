public class NumberToWord {
    /*
    This Challenge takes a number and print out in words for example 100 will print One Zero Zero
     */
    public static String convertNumberToWord(int number) {
        return switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "";

        };
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        String str = "" + number;
        return str.length();
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            StringBuilder words = new StringBuilder();
            for (int i = getDigitCount(number); i > 0; i--) {
                int firstDigit = number / ((int) Math.pow(10, i - 1));
                words.append(convertNumberToWord(firstDigit) + " ");
                number = number % ((int) Math.pow(10, i - 1));
            }
            System.out.println(words);
        }

    }

    public static void main(String[] args) {
        numberToWords(56789);
    }
}
