public class SumDigit {
    public static int sumDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = number % 10;
        number = number / 10;


        while (number != 0) {
            sum += number % 10;
            number = number / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = sumDigit(1234);
        int sum2 = sumDigit(-125);
        int sum3 = sumDigit(4);
        int sum4 = sumDigit(32123);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
