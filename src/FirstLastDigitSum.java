public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number != 0) {
            firstDigit = number % 10;
            number = number / 10;

        }
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        int sum = sumFirstAndLastDigit(1234);
        int sum2 = sumFirstAndLastDigit(-125);
        int sum3 = sumFirstAndLastDigit(4);
        int sum4 = sumFirstAndLastDigit(32123);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
